/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ugurhalil.main.park;

/**
 * This class contains detail of Tree. 
 * Tree with type and number of branches
 *
 * @author halilugur
 */
public class Tree {

    private final String type;
    private final int numBranches;

    /**
     * This method when create a tree it will working first creation.
     * 
     * @param type type of Tree
     * @param numBranches Tree with number of branches
     */
    public Tree(String type, int numBranches) {
        this.type = type;
        this.numBranches = numBranches;
    }

    /**
     * This method return detail of tree type.
     * 
     * @return Tree of type 
     */
    public String climbTree() {
        return "You are climbing the " + this.type;
    }
}
