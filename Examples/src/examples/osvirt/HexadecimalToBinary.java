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
public class HexadecimalToBinary {

    static Map<String, String> hexa = new HashMap<String, String>() {
        {
            put("0", "0000");
            put("1", "0001");
            put("2", "0010");
            put("3", "0011");
            put("4", "0100");
            put("5", "0101");
            put("6", "0110");
            put("7", "0111");
            put("8", "1000");
            put("9", "1001");
            put("A", "1010");
            put("B", "1011");
            put("C", "1100");
            put("D", "1101");
            put("E", "1110");
            put("F", "1111");

        }
    };

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String hexaValue = reader.readLine();
                StringBuilder binary = new StringBuilder();
                for (int i = 0; i < hexaValue.length(); i++) {
                    binary.append(hexa.get(hexaValue.substring(i, i + 1)));
                }
                System.out.println(binary);
            }
        } catch (Exception e) {
            System.out.println("finish program");
        }
    }
}
