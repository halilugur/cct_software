/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ugurhalil.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author halilugur
 */
public class Question1_NameInitials {

    /**
     * This program try to add super keyword between person name initials characters.
     *
     * 1) Get a string from command line. 
     * 2) Check the input data by regex. 
     * 3) * If data not as 2 characters and contains any number, show error message on command line 
     * 4) If data is valid by regex, add super keyword between that data.
     * 
     * (^[a-zA-Z]{2}$) Explanation
     * 
     * ^            Matches the beginning of the string or line.
     * [a-zA-Z]     Matches all characters between their, including themselves.
     * {2}          Expression matches within specified ranges.
     * $            Matches the end of the string or line.
     *
     * @param args
     */
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = "^[a-zA-Z]{2}$";
        String inputInitials;
        System.out.println("Please enter your name initials: ");
        try {
            do {
                inputInitials = reader.readLine();
                if (!inputInitials.matches(regex)) {
                    System.out.println("Please check your name as below rules : ");
                    System.out.println("1) Should not contains number");
                    System.out.println("2) Should have 2 character");
                    System.out.println("Please try again : ");
                }
            } while (!inputInitials.matches(regex));
            inputInitials = inputInitials.charAt(0) + "super" + inputInitials.charAt(1);
            System.out.println(inputInitials);
        } catch (IOException ex) {
            Logger.getLogger(Question1_NameInitials.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
