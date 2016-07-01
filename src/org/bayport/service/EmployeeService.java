package org.bayport.service;

import org.bayport.entity.Address;
import org.bayport.entity.Auth;
import org.bayport.entity.Employee;
import org.mongodb.morphia.query.Query;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by sarmeetsingh on 6/28/16.
 */

public class EmployeeService {

    public static Employee createEmployee(HttpServletRequest request) throws ParseException {
        Employee employee = new Employee();
        employee.setName(request.getParameter("firstname") + " " + request.getParameter("lastname"));
        employee.setGender(request.getParameter("gender").charAt(0));
        employee.setDOB(new SimpleDateFormat("MM-dd-yyyy").parse(request.getParameter("dob" )));
        employee.setJobTitle(request.getParameter("jobtitle"));
        employee.setPhoneNumber(request.getParameter("phonenumber"));
        employee.setEmail(request.getParameter("email"));
        Address address = AddressService.createAddress(request);
        employee.setAddress(address);
        Services.getDataStore().save(employee);
        return employee;
    }



    public static Auth createAuthenticatedEmployee(HttpServletRequest request) throws ParseException {
        Auth auth = AuthService.createAuth(request);
        Employee employee = createEmployee(request);
        auth.setEmployee(employee);
        Services.getDataStore().save(auth);
        return auth;
    }

}
