/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ugurhalil;

/**
 *
 * @author halilugur
 */
public class Employee {

    private String firstname;
    private String lastname;
    private String ppsn;
    private Integer employeeId;
    private Double wallet;

    /**
     * Create an employee
     *
     * @param firstname of employee
     * @param lastname of employee
     * @param ppsn of employee
     * @param employeeId of employee
     */
    public Employee(String firstname, String lastname, String ppsn, Integer employeeId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ppsn = ppsn;
        this.employeeId = employeeId;
        this.wallet = 0.0;
    }

    /**
     * Employee work action
     */
    public void work() {
        System.out.println(this.firstname + " is working.");
    }
}
