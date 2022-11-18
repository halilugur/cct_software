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
public class Question3_MarkCalculator {

    /**
     * This program calculates the grades for an assignment worth 25% of the grades.
     * 
     * 1) Get number from shouldGetNumberFromInput method.
     * 2) Calculate this number by 25%
     * 3) Print value to screen.
     *
     * @param args that get values on command line.
     */
    public static void main(String[] args) {
        System.out.println("This program calculates the grades for an assignment worth 25% of the grades.");
        double number = shouldGetNumberFromInput();
        double calculationResult = (number / 100) * 25;
        System.out.println("--------------------------------------");
        System.out.println("You scored " + calculationResult + "% out of a maximum of 25%");
    }

    /**
     * This method behaves recursively.
     * 
     * 1) Get number form command line.
     * 2) Try to parse to integer type.
     * 3) if we get an exception from the system call this method again.
     * 4) if not, we check the number range.
     * 5) if range not between 0 and 100 try to parse "exception" word to integer type. (I do that because I need to crash the program)
     * 6) if everything is okay return the number.
     *
     * @return number
     */
    private static int shouldGetNumberFromInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Please enter your mark: ");
            int mark = Integer.parseInt(reader.readLine());
            if (mark < 0 || mark > 100) {
                System.out.println("Your mark should between 0 and 100 range.");
                Integer.valueOf("exception");
            }
            return mark;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Try again.");
            return shouldGetNumberFromInput();
        }
    }
}
