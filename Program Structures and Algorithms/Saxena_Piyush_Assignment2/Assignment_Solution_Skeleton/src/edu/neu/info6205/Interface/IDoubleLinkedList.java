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
public interface IDoubleLinkedList {
    
    public int size();
    public boolean isEmpty();
    public void addNodeAtHead(int value);
    public void addNodeAtTail(int value);
    public void addNodeAtPosition(int value, int position);
    public DoubleLinkedListNode reverseALinkList(DoubleLinkedListNode node);
    public DoubleLinkedListNode getHeadNode();
    public DoubleLinkedListNode getTailNode();
    public boolean deleteNodeAtPosition(int position);
    
}
