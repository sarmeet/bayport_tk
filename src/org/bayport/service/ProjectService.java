package org.bayport.service;

import org.bayport.entity.Address;
import org.bayport.entity.Auth;
import org.bayport.entity.Project;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by sarmeetsingh on 6/29/16.
 */
public class ProjectService {
    public static Project createProject(HttpServletRequest request) {
        Project project = new Project();
        project.setName(request.getParameter("projectname"));
        project.setOwner(request.getParameter("projectownername"));
        Address address = AddressService.createAddress(request);
        project.setAddress(address);
        project.setCmu(Integer.parseInt(request.getParameter("cmu")));
        project.setCmuPrice(new BigDecimal(request.getParameter("cmuprice")));
        project.setBricks(Integer.parseInt(request.getParameter("bricks")));
        project.setBrickPrice(new BigDecimal(request.getParameter("bricksprice")));
        project.setStucco(Integer.parseInt(request.getParameter("stucco")));
        project.setStuccoPrice(new BigDecimal(request.getParameter("stuccoprice")));
        project.setScaffolding(Integer.parseInt(request.getParameter("scaffolding")));
        project.setScaffoldingPrice(new BigDecimal(request.getParameter("scaffoldingprice")));
        project.setProjectManager(AuthService.getCurrentUser(request).getEmployee());
        Services.getDataStore().save(project);
        return project;
    }


    public static List<Project> getProjectByUser(HttpServletRequest request) {
        Auth auth = Services.getDataStore().createQuery(Auth.class).field("userName").equal(request.getSession().getAttribute("username")).get();
        List<Project> ProjectList = Services.getDataStore().createQuery(Project.class).field("projectManager").equal(auth.getEmployee()).asList();
        return ProjectList;
    }
}
