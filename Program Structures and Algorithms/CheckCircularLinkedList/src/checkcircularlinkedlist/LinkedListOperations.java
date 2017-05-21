/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkcircularlinkedlist;

/**
 *
 * @author Piyush
 */
public class LinkedListOperations {
    private Node head = new Node();
    private static int listSize = 0;
    
    public LinkedListOperations(){        
    }

    public static int getListSize() {
        return listSize;
    }

    public boolean isEmpty(){
        return listSize == 0;
    }
    
    public void addNodeAtHead(Object data){
        if(isEmpty()){
            head.data = data;
            head.next = null;
            listSize++;
            return;
        }
        else{
            Node newHead = new Node();
            Node oldHead = head;
            head = newHead;
            head.data = data;
            head.next = oldHead;
            listSize++;
            return;
        }
    }
    
    public void addNodeAtTail(Object data){
        if(isEmpty()){
            head.data = data;
            head.next = null;
            listSize++;
            return;
        }
        else{
            Node newTail = new Node();
            newTail.data = data;
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
    
    public void addElementAtPosition(int n, Object data){
        if(isEmpty()){
            System.out.println("Linked List is empty. Cannot add the element!");
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        Node insertAfterThisNode = head;
        for(int i = 0; i < n-2; i++){
            insertAfterThisNode = insertAfterThisNode.next;
        }
        newNode.next = insertAfterThisNode.next;
        insertAfterThisNode.next = newNode;
        listSize++;
    }
    
    public void displayList(){
        Node pivot = head;
        for(int i = 0; i < listSize; i++){
            System.out.print(pivot.data + " ");
            pivot = pivot.next;
        }
    }
    
    public void reverseAList(){
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
    }
    
    public Node getHeadNode(){
        if(head==null){
            System.out.println("No data in the List!");
            return null;
        }
        else
            return head;
    }
    
    public Node getTailNode(){
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
    
    public void deleteElement(int n){
        if(isEmpty()){
            System.out.println("LinkList is empty!");
            return;
        }
        else{
            Node deleteAfterThisNode = head;
        for(int i = 0; i < n-2; i++){
            deleteAfterThisNode = deleteAfterThisNode.next;
        }
        deleteAfterThisNode.next = deleteAfterThisNode.next.next;
        listSize--;
                
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
        else{
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast.data == slow.data){
                return true;
            }
        }
        return false;
        }
    }   
}
