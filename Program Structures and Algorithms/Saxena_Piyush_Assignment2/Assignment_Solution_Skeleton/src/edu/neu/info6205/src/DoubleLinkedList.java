/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.DoubleLinkedListNode;
import edu.neu.info6205.Interface.IDoubleLinkedList;
import edu.neu.info6205.Interface.Node;

/**
 *
 * @author Muddassar
 */
public class DoubleLinkedList implements IDoubleLinkedList {
    private DoubleLinkedListNode head;
    private DoubleLinkedListNode tail;
    private static int listSize = 0;
    
    public DoubleLinkedList(){
        head = null;
        tail = null;
    }
    @Override
    public int size() {
        return listSize;
    }

    @Override
    public boolean isEmpty() {
        return listSize == 0;
    }

    @Override
    public void addNodeAtHead(int value) {
        DoubleLinkedListNode newNode = new DoubleLinkedListNode();
        newNode.value = value;
        if(isEmpty()){
            head = newNode;
            tail = head;
            listSize++;
            System.out.println("");
            System.out.println("Displaying List -> ");
            displayList();
            return;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            listSize++;
            System.out.println("");
            System.out.println("Displaying List -> ");
            displayList();
        }
    }

    @Override
    public void addNodeAtTail(int value) {
        DoubleLinkedListNode newNode = new DoubleLinkedListNode();
        newNode.setData(value);
        newNode.setPrev(tail);
        if(tail!=null){
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null){
            head = newNode;
        }
        listSize++;
        System.out.println("");
            System.out.println("Displaying List -> ");
            displayList();
    }

    @Override
    public void addNodeAtPosition(int value, int position) {
        if(isNegative(position)){
            System.out.println("Cannot insert a node at a negative position! Enter a valid integer value!");
            return;
        }
        else if(isEmpty()){
            System.out.println("Doubly Linked List is empty. Cannot add the element!");
            return;
        }
        if(position>listSize){
            System.out.println("Cannot insert Node after the end of list. Please enter a valid position!");
            return;
        }
        DoubleLinkedListNode newNode = new DoubleLinkedListNode();
        newNode.value = value;
        DoubleLinkedListNode insertAfterThisNode = head;
        for(int i = 0; i < position-2; i++){
            insertAfterThisNode = insertAfterThisNode.next;
        }
        newNode.next = insertAfterThisNode.next;
        insertAfterThisNode.next.prev = newNode;
        insertAfterThisNode.next = newNode;
        newNode.prev = insertAfterThisNode;
        listSize++;
        System.out.println("");
            System.out.println("Displaying List -> ");
            displayList();
    }

    @Override
    public DoubleLinkedListNode reverseALinkList(DoubleLinkedListNode node) {
        if(isEmpty()){
            System.out.println("List is Empty, cannot reverse!");
            return null;
        }
        else if(node!=head){
            System.out.println("The node passed is not the head, cannot reverse the list!");
            return null;
        }
        DoubleLinkedListNode current = head;
        DoubleLinkedListNode next;
        DoubleLinkedListNode previous = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return head;
    }

    @Override
    public DoubleLinkedListNode getHeadNode() {
        if(head==null){
            System.out.println("No data in the List!");
            return null;
        }
        else
            return head;
    }

    @Override
    public DoubleLinkedListNode getTailNode() {
        if(head==null){
            System.out.println("No data in the List!");
            return null;
        }
        else{
            DoubleLinkedListNode node = head;
            while(node.next!=null){
                node = node.next;
            }
            return node;
        }
    }

    @Override
    public boolean deleteNodeAtPosition(int position) {
        if(isNegative(position)){
            System.out.println("Cannot insert a node at a negative position! Enter a valid integer value!");
            return false;
        }
        else if(head==null){
            System.out.println("No data in the List!");
            return false;
        }
        else if(position>listSize){
            System.out.println("The position is outside the range of the Double Linked List. Enter a Valid Range!");
            return false;
        }
        else if(position == 1){
            if(listSize == 1){
                head = null;
                tail = null;
                listSize--;
                System.out.println("");
            System.out.println("Displaying List -> ");
            displayList();
                return true;
            }
            else{
                head = head.next;
                head.prev = null;
                listSize--;
                System.out.println("");
            System.out.println("Displaying List -> ");
            displayList();
                return true;
            }
        }
        else if(position ==listSize){
            tail = tail.prev;
            tail.next = null;
            listSize--;
            System.out.println("");
            System.out.println("Displaying List -> ");
            displayList();
            return true;
        }
        else{
            DoubleLinkedListNode deleteAfterThisNode = head;
        for(int i = 0; i < position-2; i++){
            deleteAfterThisNode = deleteAfterThisNode.next;
        }
        deleteAfterThisNode.next = deleteAfterThisNode.next.next;
        deleteAfterThisNode.next.prev = deleteAfterThisNode;
        listSize--;
        System.out.println("");
            System.out.println("Displaying List -> ");
            displayList();
        return true;
            }
    }
    
    public void displayList(){
        DoubleLinkedListNode pivot = head;
        for(int i = 0; i < listSize; i++){
            System.out.print(pivot.value + " ");
            pivot = pivot.next;
        }
    }
    
    public boolean isNegative(int dataToBeChecked){
        if(dataToBeChecked<1){
            return true;
        }
        else{
            return false;
        }
    }
    
}
