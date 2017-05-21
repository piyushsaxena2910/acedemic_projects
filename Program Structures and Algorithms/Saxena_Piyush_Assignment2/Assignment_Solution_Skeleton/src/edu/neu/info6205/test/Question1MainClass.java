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
public class Question1MainClass {
    public static void main(String[] args) {
        LinkedList llo = new LinkedList();
        llo.addNodeAtHead(1);
        llo.addNodeAtHead(2);
        llo.addNodeAtTail(3);
        llo.addNodeAtTail(4);
        llo.addNodeAtTail(5);
        llo.addNodeAtTail(6);
        llo.addNodeAtTail(7);
        llo.addNodeAtTail(8);
        llo.addNodeAtPosition(9, 5);
        llo.addNodeAtPosition(10, 9);
        llo.displayList();
        System.out.println("");
        llo.displayList();
        System.out.println("");
        System.out.println(llo.getHeadNode().value);
        System.out.println(llo.getTailNode().value);
        llo.deleteNodeAtPosition(4);
        System.out.println("");
        llo.displayList();
    }   
}
