/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ugurhalil.main;

import java.util.Scanner;

/**
 *
 * @author halilugur
 */
public class Question2_OptionSelection {

    /**
     * This program calculate the average of a string of numbers or the sum of odd numbers.
     * 
     * 1) Define an integer array that it will have 10 numbers.
     * 2) Define a string variable that is show the array.
     * 3) Read an option from command line by client and storage it on option variable.
     * 3) Create a for loop for read each number from numbers array.
     * 4) Check the option by option variable.
     * 5) if option is 1, get average of numbers.
     * 6) if option is 2, total of odd numbers.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String numbersAsString = "";
        System.out.println("");
        System.out.println("........ Options ........");
        System.out.println("Option 1 – Find the average of numbers");
        System.out.println("Option 2 – Count the odd numbers");
        System.out.println("........ Options ........");
        
        System.out.println("Please enter option (1,2) : ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        int avarage = 0;
        int totalOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (option == 1) {
                avarage += numbers[i];
            } else if (option == 2) {
                if (numbers[i] % 2 != 0) {
                    totalOdd += numbers[i];
                }
            }
            numbersAsString += numbers[i];
        }

        System.out.println("Numbers : " + numbersAsString);
        if (option == 1) {
            System.out.println("Avarage numbers : " + (avarage / numbers.length));
        } else if (option == 2) {
            System.out.println("Total of odd Numbers : " + totalOdd);
        }
    }
}
