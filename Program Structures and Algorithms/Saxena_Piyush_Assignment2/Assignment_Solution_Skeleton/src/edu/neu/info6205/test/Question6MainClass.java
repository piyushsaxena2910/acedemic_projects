/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Queue;
import edu.neu.info6205.src.StackImplementationUsingQueue;

/**
 *
 * @author Piyush
 */
public class Question6MainClass {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        Queue queue2 = new Queue();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
        
        StackImplementationUsingQueue si = new StackImplementationUsingQueue();
        System.out.println("Top of Queue: "+ si.peek(queue1, queue2));
        si.push(5, queue1, queue2);
        System.out.println(si.peek(queue1, queue2));
        si.pop(queue1, queue2);
        System.out.println(si.peek(queue1, queue2));
        si.pop(queue1, queue2);
        System.out.println(si.peek(queue1, queue2));
        si.pop(queue1, queue2);
        System.out.println(si.peek(queue1, queue2));
        si.pop(queue1, queue2);
        System.out.println(si.peek(queue1, queue2));
        si.pop(queue1, queue2);
        System.out.println(si.peek(queue1, queue2));
    }
}
