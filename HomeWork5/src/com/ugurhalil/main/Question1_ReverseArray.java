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
public class Question1_ReverseArray {

    /**
     * This program get 10 numbers from command line and reverse it.
     * 
     * 1) Define two integer arrays that it will have 10 numbers.
     * 2) Define two string variable that are show the array.
     * 3) In first for: Read number from command line by client and storage it on numbers array.
     * 4) In second for: Numbers array reverse by a for loop and storage it on reverse Numbers array.
     * 5) print numbers on terminal
     * 6) print reverse numbers on terminal
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] reverseNumbers = new int[numbers.length];
        String numbersAsString = "";
        String reverseNumbersAsString = "";

        System.out.println("Please Enter " + numbers.length + " number.");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number " + (i + 1) + " : ");
            numbers[i] = scanner.nextInt();
            numbersAsString += numbers[i];
        }
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverseNumbers[reverseNumbers.length - 1 - i] = numbers[i];
            reverseNumbersAsString += reverseNumbers[reverseNumbers.length - 1 - i];
        }
        
        System.out.println("Numbers : " + numbersAsString);
        System.out.println("Reverse Numbers : " + reverseNumbersAsString);
    }
}
