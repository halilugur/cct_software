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
public class Question1_FindBigNumber {

    /**
     * This program try to find the big number that enter by someone.
     * 
     * 1) Get first number from the command line.
     * 2) Get second number from the command line.
     * 3) if second number bigger than first set second to big number.
     * 4) Print screen the big number.
     *
     * @param args that get values on command line.
     */
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("This program try to find the big number that enter by someone.");
            System.out.println("--------------------------------------");
            System.out.println("Please input first number: ");
            int firstNumber = Integer.parseInt(reader.readLine());
            System.out.println("--------------------------------------");
            System.out.println("Please input second number: ");
            int secondNumber = Integer.parseInt(reader.readLine());
            System.out.println("--------------------------------------");
            int bigNumber = firstNumber;
            if (firstNumber < secondNumber) {
                bigNumber = secondNumber;
            }
            System.out.println("Your numbers are: " + firstNumber + ", " + secondNumber);
            System.out.println("Big one is: " + bigNumber);

        } catch (IOException | NumberFormatException e) {
            System.out.println("System Error!!! You must enter an integer.");
        }
    }
}
