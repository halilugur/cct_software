/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.osvirt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author halilugur
 */
public class BinaryToHexadecimal {

    static Map<String, String> hexa = new HashMap<String, String>() {
        {
            put("0000", "0");
            put("0001", "1");
            put("0010", "2");
            put("0011", "3");
            put("0100", "4");
            put("0101", "5");
            put("0110", "6");
            put("0111", "7");
            put("1000", "8");
            put("1001", "9");
            put("1010", "A");
            put("1011", "B");
            put("1100", "C");
            put("1101", "D");
            put("1110", "E");
            put("1111", "F");

        }
    };

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String binary = reader.readLine();
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < binary.length(); i = i + 4) {
                    String binaryPart = binary.substring(i, i + 4);
                    builder.append(hexa.get(binaryPart));
                }
                System.out.println(builder);
            }
        } catch (Exception e) {
            System.out.println("finish program");
        }
    }
}
