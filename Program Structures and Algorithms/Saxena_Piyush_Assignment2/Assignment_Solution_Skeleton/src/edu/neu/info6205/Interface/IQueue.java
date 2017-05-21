/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.Interface;

/**
 *
 * @author Muddassar
 */
public interface IQueue {
    
    public void enqueue(int value);
    public int dequeue();
    public int peek();
    public boolean isEmpty();
    public int size();
}
