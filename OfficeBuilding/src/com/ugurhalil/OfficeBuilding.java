/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ugurhalil;

import java.util.ArrayList;

/**
 *
 * @author halilugur
 */
public class OfficeBuilding {
    private int numFloors;
    ArrayList<Company> companies = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OfficeBuilding officeBuilding = new OfficeBuilding(3);
        
    }

    private OfficeBuilding(int size) {
        this.numFloors = size;
    }
    
}
