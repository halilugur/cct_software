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
public class BinaryToDecimal {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String binary = reader.readLine();
                int total = 0;
                for (int i = 0; i < binary.length(); i++) {
                    String number = binary.substring(binary.length() - 1 - i, binary.length() - i);
                    total += Math.pow(2, i) * Integer.parseInt(number);
                }
                System.out.println(total);
            }
        } catch (Exception e) {
            System.out.println("finish program");
        }
    }
}
