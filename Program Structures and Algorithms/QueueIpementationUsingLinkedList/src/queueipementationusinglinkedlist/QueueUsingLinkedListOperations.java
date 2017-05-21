/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueipementationusinglinkedlist;

/**
 *
 * @author Piyush
 */
public class QueueUsingLinkedListOperations {
    private Node front;
    private Node rear;
    private static int queueSize = 0;
    
    public void enqueue(Object data){
        if(isEmpty()){
            Node newNode = new Node(data);
            front = newNode;
            rear = newNode;
            queueSize++;
        }
        else{
            Node newRear = new Node(data);
            rear.setNext(newRear);
            rear = rear.getNext();
            queueSize++;
        }
    }

    public boolean isEmpty() {
        return (queueSize == 0);
    }
    
    public Object dequeue(){
        if(isEmpty()){
            System.out.println("No data in the list! Cannot Pop!");
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
}
