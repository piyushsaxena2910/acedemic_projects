/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.Interface;

/**
 *
 * @author Muddassar
 */
public class Node {
    
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }
    
    public Node(){
        
    }
    
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return value;
    }

    public void setData(int value) {
        this.value = value;
    }
}
