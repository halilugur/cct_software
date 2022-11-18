/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.osvirt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author halilugur
 */
public class DecimalToBinary {
    public static void main(String[] args) {        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                int decimal = Integer.parseInt(reader.readLine());
                StringBuilder binary = new StringBuilder();
                while (decimal > 0) {
                    binary.append(decimal % 2 == 0 ? "0" : "1");
                    decimal = decimal / 2;
                }
                
                while (binary.length() < 8) {                    
                    binary.append(0);
                }
                
                System.out.println(binary.reverse());
            }
        } catch (Exception e) {
            System.out.println("finish program");
        }
    }
}
