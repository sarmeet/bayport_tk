package org.bayport.entity;

import org.mongodb.morphia.annotations.Reference;

import java.math.BigDecimal;

/**
 * Created by sarmeetsingh on 6/29/16.
 */
public class Project extends BaseEntity {

    private String name, owner;
    @Reference
    private Address address;
    private int cmu, bricks, stucco, scaffolding;
    private BigDecimal cmuPrice, brickPrice, stuccoPrice, scaffoldingPrice;
    @Reference
    private Employee projectManager;

    public Project() {
    }

    public Project(String name, String owner, Address address, int cmu, int bricks, int stucco, int Scaffolding, BigDecimal cmuPrice, BigDecimal brickPrice, BigDecimal stuccoPrice, BigDecimal scaffoldingPrice, Employee projectManager) {
        this.name = name;
        this.owner = owner;
        this.address = address;
        this.cmu = cmu;
        this.bricks = bricks;
        this.stucco = stucco;
        this.scaffolding = Scaffolding;
        this.cmuPrice = cmuPrice;
        this.brickPrice = brickPrice;
        this.stuccoPrice = stuccoPrice;
        this.scaffoldingPrice = scaffoldingPrice;
        this.projectManager = projectManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getCmu() {
        return cmu;
    }

    public void setCmu(int cmu) {
        this.cmu = cmu;
    }

    public int getBricks() {
        return bricks;
    }

    public void setBricks(int bricks) {
        this.bricks = bricks;
    }

    public int getStucco() {
        return stucco;
    }

    public void setStucco(int stucco) {
        this.stucco = stucco;
    }

    public int getScaffolding() {
        return scaffolding;
    }

    public void setScaffolding(int scaffolding) {
        this.scaffolding = scaffolding;
    }

    public BigDecimal getCmuPrice() {
        return cmuPrice;
    }

    public void setCmuPrice(BigDecimal cmuPrice) {
        this.cmuPrice = cmuPrice;
    }

    public BigDecimal getBrickPrice() {
        return brickPrice;
    }

    public void setBrickPrice(BigDecimal brickPrice) {
        this.brickPrice = brickPrice;
    }

    public BigDecimal getStuccoPrice() {
        return stuccoPrice;
    }

    public void setStuccoPrice(BigDecimal stuccoPrice) {
        this.stuccoPrice = stuccoPrice;
    }

    public BigDecimal getScaffoldingPrice() {
        return scaffoldingPrice;
    }

    public void setScaffoldingPrice(BigDecimal scaffoldingPrice) {
        this.scaffoldingPrice = scaffoldingPrice;
    }

    public Employee getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(Employee projectManager) {
        this.projectManager = projectManager;
    }
}
