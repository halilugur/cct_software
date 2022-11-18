/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ugurhalil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author halilugur
 */
public class Main {

    /**
     * This program calculate a few mathematics process.
     *
     * 1) Get a number from the user that determines how many numbers the user wants. 
     * 2) Get numbers from the user. 
     * 3) Check number that user input from console. 
     * 4) Each number add to array list. 
     * 5) Show all options on screen.
     * 6) Apply specific method that user chosen option. 
     * 7) Show message after calculation.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PREPARE DATA
        System.out.println("How many numbers you want to input : ");
        int numbersSize = checkNumber();
        ArrayList<Integer> numbers = new ArrayList<>(numbersSize);
        String printArray = "";
        for (int i = 0; i < numbersSize; i++) {
            System.out.println("Please enter number " + (i + 1) + ". : ");
            int number = checkNumberBetween0And30();
            numbers.add(number);
            printArray += number + " ";
        }

        // SHOW OPTION AND APPLY
        int option;
        OUTER:
        do {

            System.out.println("");
            System.out.println("Array numbers are : " + printArray);
            showOptions();
            option = checkNumber();
            System.out.println("");
            switch (option) {
                case 1:
                    System.out.println("Total of numbers are : " + totalOfNumbers(numbers));
                    break;
                case 2:
                    System.out.println("Big number in array is : " + findBigNumber(numbers));
                    break;
                case 3:
                    System.out.println("Avarage of numbers are : " + avarageOfNumbers(numbers));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please check your option that your selected.");
                    break;
            }
        } while (option != 4);
    }

    /**
     * User input a data on console and check this data by a few rule.
     *
     * 1) This data should number. 
     * 2) This data should between 0 and 30.
     *
     * @return number
     */
    private static int checkNumberBetween0And30() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(reader.readLine());
            while (number < 0 || number > 30) {
                System.out.println("Number should be between 0 and 30.");
                System.out.println("Re-enter number : ");
                number = Integer.parseInt(reader.readLine());
            }
            return number;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Just number acceptable! Re-enter number : ");
            return checkNumberBetween0And30();
        }
    }

    /**
     * Check input a data from console and this data should be number.
     *
     * @return number
     */
    private static int checkNumber() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Just number acceptable! Re-enter number : ");
            return checkNumber();
        }
    }

    /**
     * Show a few options to user.
     *
     * 1) Total of array. 
     * 2) Find big number. 
     * 3) Average of array. 
     * 4) Exit the program.
     */
    private static void showOptions() {
        System.out.println("-------------------------");
        System.out.println("........ Options ........");
        System.out.println("Option 1 – Calculate the TOTAL of all the numbers in the array (i.e. add them all together)");
        System.out.println("Option 2 – Determine the HIGHEST number that is stored in the array");
        System.out.println("Option 3 – Calculate the AVERAGE of the numbers in the array (i.e. add them up and divide by the quantity)");
        System.out.println("Option 4 – Exit");
        System.out.println("........ Options ........");

        System.out.println("Please select option : ");
    }

    /**
     * Find big number in array.
     *
     * @param numbers are contains user inputs.
     * @return big number
     */
    private static int findBigNumber(ArrayList<Integer> numbers) {
        int bigNumber = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > bigNumber) {
                bigNumber = numbers.get(i);
            }
        }
        return bigNumber;
    }

    /**
     * Get total of array.
     *
     * @param numbers are contains user inputs.
     * @return total of array data.
     */
    private static int totalOfNumbers(ArrayList<Integer> numbers) {
        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }
        return total;
    }

    /**
     * Get average of array.
     *
     * @param numbers are contains user inputs.
     * @return average
     */
    private static double avarageOfNumbers(ArrayList<Integer> numbers) {
        return totalOfNumbers(numbers) / numbers.size();
    }
}
