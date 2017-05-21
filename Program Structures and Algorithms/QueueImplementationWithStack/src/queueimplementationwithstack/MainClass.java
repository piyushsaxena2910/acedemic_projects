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
public class MainClass {
    
    public static void main(String[] args) {
        
        StackImplementation stack1 = new StackImplementation();
        StackImplementation stack2 = new StackImplementation();
        stack1.push("a");
        stack1.push("b");
        stack1.push("c");
        stack1.push("d");
        
        QueueImplementation qi = new QueueImplementation();
        qi.enqueue("e", stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
    }
    
}
