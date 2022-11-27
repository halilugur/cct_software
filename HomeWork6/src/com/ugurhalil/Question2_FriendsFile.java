/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ugurhalil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author halilugur
 */
public class Question2_FriendsFile {

    /**
     * This project read name from the command line and write to friends.txt file.
     * 
     * 1) Read friend names from command line
     * 2) Collect in string builder
     * 3) If name come as "end" break loop
     * 4) Write friends names in friends.txt file
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder nameOfFriends = new StringBuilder();
        String name;
        do {
            System.out.println("Write your friend names : ");
            name = scanner.nextLine();
            nameOfFriends.append(name).append("\n");
        } while (!name.equalsIgnoreCase("end"));
        
        writeToFile("friends.txt", nameOfFriends.toString());
    }

    public static void writeToFile(String filename, String names) {
        try ( BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename, true))) {
            myWriter.newLine();
            myWriter.write(names);
            myWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Question2_FriendsFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
