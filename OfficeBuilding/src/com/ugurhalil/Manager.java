/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ugurhalil;

/**
 *
 * @author halilugur
 */
public class Manager extends Employee{
    
    /**
     * Create a manager
     * 
     * @param firstname of manager
     * @param lastname of manager
     * @param ppsn of manager
     * @param employeeId of manager 
     */
    public Manager(String firstname, String lastname, String ppsn, Integer employeeId) {
        super(firstname, lastname, ppsn, employeeId);
        this.wallet = 50.0;
    }
    
}
