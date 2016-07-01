package org.bayport.service;

import org.bayport.entity.Address;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sarmeetsingh on 6/28/16.
 */
public class AddressService {
    public static Address createAddress(HttpServletRequest request) {

        Address address = new Address();
        address.setFirstLine(request.getParameter("firstline"));
        if (request.getParameter("secondline") != null) {
            address.setSecondLine(request.getParameter("secondline"));
        }
        address.setCity(request.getParameter("city"));
        address.setZip(request.getParameter("zip"));
        address.setState(request.getParameter("state"));
        address.setCountry(request.getParameter("country"));
        Services.getDataStore().save(address);
        return address;

    }
}
