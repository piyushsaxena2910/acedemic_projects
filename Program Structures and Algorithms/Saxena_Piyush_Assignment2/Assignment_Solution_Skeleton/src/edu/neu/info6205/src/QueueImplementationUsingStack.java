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
public class QueueImplementationUsingStack {
    
    public void enqueue(int value, Stack stack1, Stack stack2){     
        if(stack1.isEmpty()){
            stack1.push(value);
        }
        else{
            int sizeOfStack1 = stack1.size();
            for(int i = 0; i < sizeOfStack1; i++){
                stack2.push(stack1.pop());
            }
                stack1.push(value);
                for(int j = 0; j < sizeOfStack1; j++){
                stack1.push(stack2.pop());
                }
            
        }
    }
    
    public Object dequeue(Stack stack1, Stack stack2){
        if(stack1.isEmpty()){
            System.out.println("Queue is empty, cannot dequeue");
            return null;
        }
        else{
            return stack1.pop();
        }
    }
    
    public Object peek(Stack stack1, Stack stack2){
        if(stack1.isEmpty()){
            System.out.println("Queue is empty, cannot peek");
            return null;
        }
        else{
            return stack1.peek();
        }
    }
}