package org.bayport.entity;


import org.mongodb.morphia.annotations.Reference;

public class Auth extends BaseEntity {
    private String userName, password, accountType;
    @Reference
    private Employee employee;
    private boolean active;

    public Auth() {
    }

    public Auth(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Auth(String userName, String password, String accountType, Employee employee, boolean active) {
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
        this.employee = employee;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
