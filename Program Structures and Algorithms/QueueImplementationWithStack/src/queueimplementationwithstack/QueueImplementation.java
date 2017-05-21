/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueimplementationwithstack;

/**
 *
 * @author Piyush
 */
public class QueueImplementation {
    
    public void enqueue(Object data, StackImplementation stack1, StackImplementation stack2){     
        if(stack1.isEmpty()){
            stack1.push(data);
        }
        else{
            int sizeOfStack1 = stack1.getSize();
            for(int i = 0; i < sizeOfStack1; i++){
                stack2.push(stack1.pop());
            }
                stack1.push(data);
                for(int j = 0; j < sizeOfStack1; j++){
                stack1.push(stack2.pop());
                }
            
        }
    }
    
    public Object dequeue(StackImplementation stack1, StackImplementation stack2){
        if(stack1.isEmpty()){
            System.out.println("Queue is empty, cannot dequeue");
            return null;
        }
        else{
            return stack1.pop();
        }
    }
    
    public Object peek(StackImplementation stack1, StackImplementation stack2){
        if(stack1.isEmpty()){
            System.out.println("Queue is empty, cannot dequeue");
            return null;
        }
        else{
            return stack1.peek();
        }
    }
}