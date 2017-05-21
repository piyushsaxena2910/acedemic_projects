/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.IStack;
import edu.neu.info6205.Interface.Node;

/**
 *
 * @author Muddassar
 */
public class Stack implements IStack {
    private Node top;
    private int stackSize;
    public Stack(){
    stackSize = 0;
    }
    @Override
    public void push(int value) {
        if(isEmpty()){
            Node newTop = new Node(value);
            top = newTop;
            stackSize++;
        }
        else{
            Node newTop = top;
            top = new Node(value);
            top.next = newTop;
            stackSize++;
        }
    }

    @Override
    public int pop() {
        if(isEmpty()){
            System.out.println("No data in the list! Cannot Pop!");
            return -1;
        }
        else{
            int value = top.value;
            top = top.next;
            stackSize--;
            return value;
        }
    }

    @Override
    public int peek() {
        if(isEmpty()){
            System.out.println("No Data in the Stack!");
            return -1;
        }
        else{
        return top.value;
        }
    }

    @Override
    public int size() {
        return stackSize;
    }

    @Override
    public boolean isEmpty() {
        return (stackSize == 0);
    }
    
}
