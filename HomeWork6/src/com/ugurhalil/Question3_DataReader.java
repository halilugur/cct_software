/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ugurhalil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author halilugur
 */
public class Question3_DataReader {

    /**
     * This project read data from the data.txt file.
     *
     * 1) Create two array list that one is for all data another is for numbers
     * 2) Read data and add it on list of data
     * 3) Check the read data, if it is a number add it to the list of numbers.
     * 4) Write screen the list of data
     * 5) Write list of number on screen
     * 6) Reverse the list of number
     * 7) Write the reverse numbers on the screen
     * 8) Write the reversed numbers in the clean.txt file.
     * 9) By taking the capacity difference between data and numbers, 
     * find the data that are not numbers and write them on the screen.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            ArrayList<Double> numbers = new ArrayList<>();
            ArrayList<String> data = new ArrayList<>();
            String line = bufferedReader.readLine();
            while (line != null) {
                data.add(line);

                if (isNumeric(line)) {
                    numbers.add(Double.valueOf(line));
                }
                line = bufferedReader.readLine();
            }
            System.out.println("Data.txt file : " + data.toString());
            System.out.println("Numbers : " + numbers.toString());
            Collections.reverse(numbers);
            System.out.println("Reverse Numbers : " + numbers.toString());
            writeToFile("clean.txt", numbers);
            System.out.println("Clean file ready. There were " + (data.size() - numbers.size()) + " errors in the data");
        } catch (IOException ex) {
            Logger.getLogger(Question3_DataReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean isNumeric(String number) {
        String regex = "[0-9]+[\\.]?[0-9]*";
        return Pattern.matches(regex, number);
    }

    public static void writeToFile(String filename, ArrayList<Double> numbers) {
        try ( BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, true))) {
            for (Double number : numbers) {
                myWriter.write(number.toString());
                myWriter.write("\n");
            }
            myWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Question3_DataReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
