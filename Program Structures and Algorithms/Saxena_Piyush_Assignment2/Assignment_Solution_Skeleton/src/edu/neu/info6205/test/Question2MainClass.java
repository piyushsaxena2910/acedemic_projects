/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.test;

import edu.neu.info6205.src.Stack;

/**
 *
 * @author Piyush
 */
public class Question2MainClass {
    public static void main(String[] args) {
        Stack sll = new Stack();
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);
        System.out.println(sll.peek());
        
        //System.out.println(sll.peek());
        sll.pop();
        System.out.println(sll.peek());
        sll.pop();
        System.out.println(sll.peek());
        sll.pop();
        sll.pop();
        System.out.println(sll.peek());
        System.out.println("This" + sll.pop());
    }
}
