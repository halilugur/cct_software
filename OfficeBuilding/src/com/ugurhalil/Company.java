/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ugurhalil;

import java.util.ArrayList;

/**
 *
 * @author halilugur
 */
public class Company {
    private String name;
    private ArrayList<Employee> employees;
    
    public Company() {
        this.employees = new ArrayList<>();
    }

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    
    /**
     * 
     * @param quantity max of employee
     * @return 
     */
    public boolean hireEmployees(int quantity) {
        return true;
    }
    
    /**
     * remove an employee
     * 
     * @param employee
     * @return 
     */
    public boolean sackEmployee(Employee employee) {
        return true;
    }
}
