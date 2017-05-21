/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Queue;

/**
 *
 * @author Piyush
 */
public class Question3MainClass {
    public static void main(String[] args) {
        Queue qll = new Queue();
        System.out.println(qll.isEmpty());
        qll.enqueue(1);
        qll.enqueue(2);
        qll.enqueue(3);
        qll.enqueue(4);
        qll.enqueue(5);
        System.out.println(qll.peek());
        qll.dequeue();
        System.out.println(qll.peek());
        qll.dequeue();
        System.out.println(qll.peek());
        qll.dequeue();
        System.out.println(qll.peek());
        qll.dequeue();
        System.out.println(qll.peek());
        qll.dequeue();
        System.out.println(qll.peek());
        qll.dequeue();
    }
}
