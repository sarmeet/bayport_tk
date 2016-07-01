package org.bayport.servlet;

import org.bayport.entity.Auth;
import org.bayport.service.AuthService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by sarmeetsingh on 6/27/16.
 */
@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Auth login = AuthService.Login(request);
        request.getSession().invalidate();
        if (login != null) {
            HttpSession session = request.getSession();

            if (session.isNew()) {
                session.setAttribute("username", login.getUserName());
                session.setAttribute("name", login.getEmployee().getName());
                session.setAttribute("account", login.getAccountType());
                if (request.getParameter("rememberme") == null) {
                    session.setMaxInactiveInterval(30 * 60);
                } else {
                    session.setMaxInactiveInterval(300 * 60);
                }
                response.sendRedirect("/createproject.jsp");
            } else {
                response.sendRedirect("/createproject.jsp");
            }
        } else {
            request.setAttribute("error", "error");
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
