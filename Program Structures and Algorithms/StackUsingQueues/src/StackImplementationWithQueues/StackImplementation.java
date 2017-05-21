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
public class StackImplementation {
    public void push(Object data, QueueImplementation queue1, QueueImplementation queue2){
        if(queue1.isEmpty()){
            queue1.enqueue(data);
        }
        else{
            for(int i = queue1.size(); i > 0; i--){
                Object dataValue = queue1.dequeue();
                queue2.enqueue(dataValue);
                }
            queue1.enqueue(data);
            for(int j = queue2.size(); j > 0; j--){
                queue1.enqueue(queue2.dequeue());
        }
    }
    }
    public Object pop(QueueImplementation queue1, QueueImplementation queue2){
        if(queue1.isEmpty()){
            System.out.println("Queue is empty, cannot dequeue");
            return null;
        }
        else{
            return queue1.dequeue();
        }
    }
    public Object peek(QueueImplementation queue1, QueueImplementation queue2){
        if(queue1.isEmpty()){
            System.out.println("Queue is empty, cannot dequeue");
            return null;
        }
        else{
            return queue1.peek();
        }
    }
}
