package org.bayport.servlet;

import org.bayport.service.ProjectService;
import org.bayport.entity.Project;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by sarmeetsingh on 6/28/16.
 */
@WebServlet(name = "ProjectServlet", urlPatterns = "/project")
public class ProjectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        org.bayport.entity.Project project = ProjectService.createProject(request);
        request.setAttribute("project", project);
        getServletContext().getRequestDispatcher("/displayproject.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Project> projects = ProjectService.getProjectByUser(request);

    }
}
