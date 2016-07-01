package org.bayport.service;

import org.bayport.entity.Auth;
import org.mongodb.morphia.query.Query;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Sarmeet Singh on 6/26/16.
 */
public class AuthService {

    public static Auth Login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Auth auth = Services.db.getDatastore().createQuery(Auth.class).field("userName").equal(username).field("password").equal(password).get();
        if (auth != null) {
            return auth;
        } else return null;
    }

    public static Auth createAuth(HttpServletRequest request) {
        Auth auth = new Auth();
        auth.setActive(true);
        auth.setUserName(request.getParameter("username"));
        auth.setPassword(request.getParameter("password"));
        Services.getDataStore().save(auth);
        return auth;
    }


    public static Auth getCurrentUser(HttpServletRequest request) {
        Query<Auth> findLoggedinEmployee = Services.getDataStore().find(Auth.class).field("userName").equal(request.getSession().getAttribute("username"));
        System.out.println(request.getSession().getAttribute("username"));
        Auth auth = findLoggedinEmployee.get();
        return auth;
    }
}