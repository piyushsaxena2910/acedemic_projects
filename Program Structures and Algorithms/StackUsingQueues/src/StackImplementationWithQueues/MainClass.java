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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueImplementation queue1 = new QueueImplementation();
        QueueImplementation queue2 = new QueueImplementation();
        queue1.enqueue("a");
        queue1.enqueue("b");
        queue1.enqueue("c");
        queue1.enqueue("d");
        
        StackImplementation si = new StackImplementation();
        System.out.println("Top of Queue: "+ si.peek(queue1, queue2));
        si.push("e", queue1, queue2);
        System.out.println(si.peek(queue1, queue2));
    }
    
}
