/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.ILinkedList;
import edu.neu.info6205.Interface.Node;

/**
 *
 * @author Muddassar
 */
public class LinkedList implements ILinkedList {
    private Node head = new Node();
    private static int listSize = 0;
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
        if(isEmpty()){
            head.value = value;
            head.next = null;
            listSize++;
            return;
        }
        else{
            Node newHead = new Node();
            Node oldHead = head;
            head = newHead;
            head.value = value;
            head.next = oldHead;
            listSize++;
            return;
        }
    }

    @Override
    public void addNodeAtTail(int value) {
        if(isEmpty()){
            head.value = value;
            head.next = null;
            listSize++;
            return;
        }
        else{
            Node newTail = new Node();
            newTail.value = value;
            Node pivot = head;
            for(int i = 0; i < listSize; i++){
                if(pivot.next == null){
                    listSize++;
                    pivot.next = newTail;
                    return;
                }
                pivot = pivot.next;
            }
        
        }
    }

    @Override
    public void addNodeAtPosition(int value, int position) {
        if(isNegative(position)){
            System.out.println("Cannot insert a node at a negative position! Enter a valid integer value!");
            return;
        }
        else if(isEmpty()){
            System.out.println("Linked List is empty. Cannot add the element!");
            return;
        }
        else if(position>listSize){
            System.out.println("The position is outside the range of the Linked List. Enter a Valid Range!");
            return;
        }
        Node newNode = new Node();
        newNode.value = value;
        Node insertAfterThisNode = head;
        for(int i = 0; i < position-2; i++){
            insertAfterThisNode = insertAfterThisNode.next;
        }
        newNode.next = insertAfterThisNode.next;
        insertAfterThisNode.next = newNode;
        listSize++;
    }

    @Override
    public Node reverseALinkList(Node node) {
        if(isEmpty()){
            System.out.println("List is Empty, cannot reverse!");
            return null;
        }
        else if(node!=head){
            System.out.println("The node passed is not the head, cannot reverse the list!");
            return null;
        }
        Node previousNode = null;
        Node nextNode = null;
        Node oldHead = head;
        while(oldHead!=null){
            nextNode = oldHead.next;
            oldHead.next = previousNode;
            previousNode = oldHead;
            oldHead = nextNode;
            head = previousNode;
        }
        return head;
    }

    @Override
    public Node getHeadNode() {
        if(head==null){
            System.out.println("No data in the List!");
            return null;
        }
        else
            return head;
    }

    @Override
    public Node getTailNode() {
        if(head==null){
            System.out.println("No data in the List!");
            return null;
        }
        else{
            Node node = head;
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
        else if(isEmpty()){
            System.out.println("LinkList is empty!");
            return false;
        }
        else if(position>listSize){
            System.out.println("The position is outside the range of the Linked List. Enter a Valid Range!");
            return false;
        }
        else{
            Node deleteAfterThisNode = head;
        for(int i = 0; i < position-2; i++){
            deleteAfterThisNode = deleteAfterThisNode.next;
        }
        deleteAfterThisNode.next = deleteAfterThisNode.next.next;
        listSize--;
                return true;
            }
    }
    
    public void displayList(){
        Node pivot = head;
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
    
    public boolean isCyclic(){
        if(head==null){
            System.out.println("List is empty!");
            return false;
        }
        else if(head.next == null){
            System.out.println("Acyclic as only one element in the list");
            return true;
        }
        Node fast = head;
        Node slow = head;
        while(true){
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }
                else
                return false;
            if(slow == null || fast ==null){
                return false;
            }
            if(slow == fast){
                return true;
            }
        }
    }
}
