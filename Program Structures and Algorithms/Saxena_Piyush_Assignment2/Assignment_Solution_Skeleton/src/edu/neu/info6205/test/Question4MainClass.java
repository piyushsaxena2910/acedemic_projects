/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.DoubleLinkedList;

/**
 *
 * @author Piyush
 */
public class Question4MainClass {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addNodeAtHead(1);
        dll.addNodeAtTail(2);
        System.out.println("");
        dll.addNodeAtHead(3);
        dll.addNodeAtTail(4);
        System.out.println("");
        dll.addNodeAtPosition(5, -3);
        System.out.println(dll.isEmpty());
        System.out.println(String.valueOf(dll.getHeadNode().value));
        System.out.println(String.valueOf(dll.getTailNode().value));
        dll.deleteNodeAtPosition(10);
    }
}
