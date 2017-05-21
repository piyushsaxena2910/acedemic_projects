/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.LinkedList;

/**
 *
 * @author Piyush
 */
public class Question8MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList llo = new LinkedList();
        llo.addNodeAtHead(3);
        llo.addNodeAtHead(1);
        llo.addNodeAtTail(4);
        llo.addNodeAtTail(2);
        llo.addNodeAtTail(3);
        llo.displayList();
        System.out.println("");
        llo.displayList();
        System.out.println("");
        System.out.println(llo.getHeadNode().value);
        System.out.println(llo.getTailNode().value);
        System.out.println("");
        llo.displayList();
        System.out.println("");
        System.out.println("Is the list cyclis: " + llo.isCyclic());
    }
    
}
