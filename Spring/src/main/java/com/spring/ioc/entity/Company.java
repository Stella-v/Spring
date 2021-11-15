package com.spring.ioc.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Company {
    private List<String> employee;
    private Set<String> rooms;
    private Map<String, Computer> computers;
    private Properties info;

    public Company() {
    }

    public Company(List<String> employee, Set<String> rooms, Map<String, Computer> computers, Properties info) {
        this.employee = employee;
        this.rooms = rooms;
        this.computers = computers;
        this.info = info;
    }

    public List<String> getEmployee() {
        return employee;
    }

    public void setEmployee(List<String> employee) {
        this.employee = employee;
    }

    public Set<String> getRooms() {
        return rooms;
    }

    public void setRooms(Set<String> rooms) {
        this.rooms = rooms;
    }

    public Map<String, Computer> getComputers() {
        return computers;
    }

    public void setComputers(Map<String, Computer> computers) {
        this.computers = computers;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employee=" + employee +
                ", rooms=" + rooms +
                ", computers=" + computers +
                ", info=" + info +
                '}';
    }
}
