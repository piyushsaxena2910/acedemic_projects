/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

/**
 *
 * @author Piyush
 */
public class StackImplementationUsingQueue {
    public void push(int value, Queue queue1, Queue queue2){
        if(queue1.isEmpty()){
            queue1.enqueue(value);
        }
        else{
            for(int i = queue1.size(); i > 0; i--){
                int dataValue = queue1.dequeue();
                queue2.enqueue(dataValue);
                }
            queue1.enqueue(value);
            for(int j = queue2.size(); j > 0; j--){
                queue1.enqueue(queue2.dequeue());
        }
    }
    }
    public Object pop(Queue queue1, Queue queue2){
        if(queue1.isEmpty()){
            System.out.println("Queue is empty, cannot dequeue");
            return null;
        }
        else{
            return queue1.dequeue();
        }
    }
    public Object peek(Queue queue1, Queue queue2){
        if(queue1.isEmpty()){
            System.out.println("Queue is empty, cannot dequeue");
            return null;
        }
        else{
            return queue1.peek();
        }
    }
}
