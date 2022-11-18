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
public class Question2_BoardingPass {

    /**
     * This program try to check to boarding pass.
     * 
     * 1) Read boarding pass number from command line. (show specific message)
     * 2) Check boarding pass as characters and numbers. (show specific message)
     * 3) Check length of boarding pass. (show specific message)
     * 4) Check prefix characters on boarding pass. It should be start FR or EI. (show specific message)
     * 5) Check suffix characters on boarding pass. It should be end number of 22. (show specific message)
     * 6) Check all rules with a regex definition. If not passed show general message.
     * 7) If passed all rules, say have a nice trip.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regexPrefix = "(^(?i)fr|ei).*";
        String regexValidStringAndNumber = "^[a-zA-Z0-9]*$";
        String fullRegex = "^(((?i)fr|ei)([0-9]{6,7})*22$)";

        String inputInitials;
        System.out.println("Please enter boarding pass number : ");
        try {
            do {
                inputInitials = reader.readLine();
                if (!inputInitials.matches(regexValidStringAndNumber)) {
                    System.out.println("Your boarding pass number should contains just letters and numerals.");
                }
                else if (inputInitials.length() < 10 || inputInitials.length() > 11) {
                    System.out.println("Your boarding pass number should be 10 or 11 characters length.");
                }
                else if (!inputInitials.matches(regexPrefix)) {
                    System.out.println("Your boarding pass number should be start with EI or FR");
                }
                else if (!inputInitials.endsWith("22")) {
                    System.out.println("Your boarding pass number should be end with 22");
                }
                if (!inputInitials.matches(fullRegex)) {
                    System.out.println("Your boarding pass number invalid. Please try again : ");
                }
            } while (!inputInitials.matches(fullRegex));
            System.out.println("Clear to board. Have a nice trip!");
        } catch (IOException ex) {
            Logger.getLogger(Question2_BoardingPass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

// Teste on web site : https://regex101.com/
// Current test link : https://regex101.com/r/WD20hq/1
// Test Data
//----------------------------------------
//FR14521122           (valid)
//ei14533122           (valid)
//FR145343322          (valid)
//FR145dd122           (invalid) (at the middle section have letters)
//RF14522122           (invalid) (at the start have RF letters) (Accepted Values: FR, EI)
//EI145dd122           (invalid) (at the middle section have letters)
//ei145dd122           (invalid) (at the middle section have letters)
//ie14522122           (invalid) (at the start have IE letters) (Accepted Values: FR, EI)
//EI14511122           (valid)
//fr145112122          (valid)
//FR14541224447        (invalid) (length should be 10 or 11)
//FR1454122444722      (invalid) (length should be 10 or 11)
//fr1111111111         (invalid) (length should be 10 or 11)
