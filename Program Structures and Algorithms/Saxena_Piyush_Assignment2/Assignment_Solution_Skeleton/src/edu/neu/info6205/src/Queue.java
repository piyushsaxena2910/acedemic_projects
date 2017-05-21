/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.IQueue;
import edu.neu.info6205.Interface.Node;

/**
 *
 * @author Muddassar
 */
public class Queue implements IQueue {
    
    public Node front;
    public Node rear;
    int queueSize;
    public Queue(){
    queueSize = 0;
}
    
    @Override
    public void enqueue(int value) {
        if(isEmpty()){
            Node newNode = new Node(value);
            front = newNode;
            rear = newNode;
            queueSize++;
        }
        else{
            Node newRear = new Node(value);
            rear.setNext(newRear);
            rear = rear.getNext();
            queueSize++;
        }
    }

    @Override
    public int dequeue() {
        if(isEmpty()){
            System.out.println("No data in the list! Cannot Pop!");
            return -1;
        }
        else{
            int value = front.value;
            front = front.next;
            queueSize--;
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
        return front.value;
        }
    }

    @Override
    public boolean isEmpty() {
        return (queueSize == 0);
    }

    @Override
    public int size() {
        return queueSize;
    }
    
}
