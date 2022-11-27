/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ugurhalil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author halilugur
 */
public class Question1_NumberReader {

    /**
     * This project read numbers from the numbers.txt file and give total of numbers and average of numbers.
     * 
     * 1) Read file from folder
     * 2) Count for each data
     * 3) Add up the numbers
     * 4) Show message
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers.txt"));
            double total = 0;
            double count = 0;
            String line = bufferedReader.readLine();
            while (line != null) {                
                total += Double.parseDouble(line);
                count++;
                line = bufferedReader.readLine();
            }       
            System.out.println("The total of adding all the numbers in the file : " + total);
            System.out.println("The average of all the numbers in the file : " + (total / count));
        } catch (IOException ex) {
            Logger.getLogger(Question1_NumberReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
