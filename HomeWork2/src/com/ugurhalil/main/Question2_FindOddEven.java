/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ugurhalil.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author halilugur
 */
public class Question2_FindOddEven {

    /**
     * This program tries to find out if the number someone entered is odd or even.
     * 
     * 1) Read a number from command line.
     * 2) Check number by %, if it is 0 set EVEN otherwise set ODD.
     * 3) Print screen the number.
     *
     * @param args that get values on command line.
     */
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("This program tries to find out if the number someone entered is odd or even.");
            System.out.println("--------------------------------------");
            System.out.println("Please input number: ");
            int number = Integer.parseInt(reader.readLine());
            System.out.println("--------------------------------------");
            String oddOrEven = "ODD";
            if (number % 2 == 0) {
                oddOrEven = "EVEN";
            }
            System.out.println("Your number is: " + number);
            System.out.println("This number is: " + oddOrEven);

        } catch (IOException | NumberFormatException e) {
            System.out.println("System Error!!! You must enter an integer.");
        }
    }
}
