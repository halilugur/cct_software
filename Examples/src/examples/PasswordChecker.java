/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author halilugur
 */
public class PasswordChecker {

    public static void main(String[] args) {                
        Scanner scanner = new Scanner(System.in);
        String password;
        int mistakeCounter = 0;
        int maxMistakeCounter = 5;
        String realPassword = "yes";
        do {
            System.out.println("Please enter your password. You have " + (maxMistakeCounter - mistakeCounter) + " chance.");
            password = scanner.nextLine();
            mistakeCounter++;
        } while (maxMistakeCounter > mistakeCounter && !password.equals(realPassword));
        if (!password.equals(realPassword)) {
            System.out.println("Access denied. You are now locked out of the system.");
        } else {
            System.out.println("Access granted.");
        }
    }
}
