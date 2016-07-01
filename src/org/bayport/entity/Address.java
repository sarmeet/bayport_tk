package org.bayport.entity;

/**
 * Created by sarmeetsingh on 6/26/16.
 */
public class Address extends BaseEntity {
    private String firstLine, secondLine, city, state, country, zip;

    public Address(String firstLine, String secondLine, String city, String country, String state, String zip) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }

    public Address() {
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
