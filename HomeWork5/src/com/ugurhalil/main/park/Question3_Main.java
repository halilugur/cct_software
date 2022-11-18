/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ugurhalil.main.park;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author halilugur
 */
public class Question3_Main {

    /**
     * This program define to trees on the park environment.
     * 
     * 1) Define trees count variable on the park.
     * 2) Define a park environment as ArrayList.
     * 3) Create a for loop for create a Tree with type and number of branches.
     * 4) If number of branches not between 10 - 45 numbers go to while loop.
     * 5) If passed the while loop, create a tree.
     * 6) This tree add to park ArrayList.
     * 7) Print climbTree function for all tree on the park.
     * 
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int parkTreeCount = 5;
        ArrayList<Tree> park = new ArrayList<>(parkTreeCount);

        for (int i = 0; i < park.size(); i++) {
            System.out.println("Please enter a type of a Tree : ");
            String type = reader.readLine();
            System.out.println("Please enter a number of branches of a Tree : ");
            int numBranches = Integer.parseInt(reader.readLine());
            while (numBranches < 10 || numBranches > 45) {
                System.out.println("The number of branches must be a number between 10 and 45");
                System.out.println("Please enter a number of branches of a Tree : ");
                numBranches = Integer.parseInt(reader.readLine());
            }
            Tree tree = new Tree(type, numBranches);
            park.add(tree);
            System.out.println("Let's define a new Tree.");
            System.out.println("----------------------------------------------------------");
        }
        
        for (int i = 0; i < park.size(); i++) {
            System.out.println(park.get(i).climbTree());
        }
    }
}
