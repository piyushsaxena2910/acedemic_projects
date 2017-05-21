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
public class DoubleLinkedListNode {
    
    public DoubleLinkedListNode next;
    public DoubleLinkedListNode prev;
    public int value;

    public DoubleLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListNode next) {
        this.next = next;
    }

    public int getData() {
        return value;
    }

    public void setData(int value) {
        this.value = value;
    }

    public DoubleLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedListNode prev) {
        this.prev = prev;
    }
}
