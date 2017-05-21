/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackImplementationWithQueues;

/**
 *
 * @author Piyush
 */
public class QueueImplementation {
    private Node front;
    private Node rear;
    private int queueSize;
    
    public QueueImplementation(){
        front = null;
        rear = null;
        queueSize = 0;
    }
    public void enqueue(Object data){
        
            Node oldRear = rear;
            rear = new Node(data);
            rear.next = null;
            if(isEmpty()){
                front = rear;
            }
            else{
                oldRear.next = rear;
            }
            queueSize++;
        }

    public boolean isEmpty() {
        return (queueSize == 0);
    }
    
    public Object dequeue(){
        if(isEmpty()){
            System.out.println("No data in the list! Cannot Pop!");
            rear = null;
            return null;
        }
        else{
            Object data = front.data;
            front = front.next;
            queueSize--;
            return data;
        }
    }
    
    public Object peek(){
        if(isEmpty()){
            System.out.println("No Data in the Stack!");
            return null;
        }
        else{
        return front.data;
        }
    }
    
    public int size(){
        return queueSize;
    }
}
