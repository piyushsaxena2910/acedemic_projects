/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.QueueImplementationUsingStack;
import edu.neu.info6205.src.Stack;

/**
 *
 * @author Piyush
 */
public class Question7MainClass {
    public static void main(String[] args) {
        
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        
        QueueImplementationUsingStack qi = new QueueImplementationUsingStack();
        qi.enqueue(5, stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.dequeue(stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.enqueue(6, stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.dequeue(stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.dequeue(stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.dequeue(stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.dequeue(stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.dequeue(stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.dequeue(stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.dequeue(stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.dequeue(stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.enqueue(10, stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
        qi.dequeue(stack1, stack2);
        System.out.println(qi.peek(stack1, stack2));
    }
}
