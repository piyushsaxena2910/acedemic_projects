/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlistimplementation;

/**
 *
 * @author Piyush
 */
public class DoublyLinkedListOperations {
    private Node head;
    private Node tail;
    private static int listSize = 0;
    
    public DoublyLinkedListOperations(){        
         head = null;
         tail = null;
    }

    public static int getListSize() {
        return listSize;
    }

    public boolean isEmpty(){
        return listSize == 0;
    }
    
    public void addNodeAtHead(Object data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            head = newNode;
            tail = head;
            listSize++;
            return;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            listSize++;
        }
    }
    
    public void addNodeAtTail(Object data){
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setPrev(tail);
        if(tail!=null){
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null){
            head = newNode;
        }
        listSize++;
    }
    
    public void addElementAtPosition(int n, Object data){
        if(isEmpty()){
            System.out.println("Doubly Linked List is empty. Cannot add the element!");
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        Node insertAfterThisNode = head;
        for(int i = 0; i < n-2; i++){
            insertAfterThisNode = insertAfterThisNode.next;
        }
        newNode.next = insertAfterThisNode.next;
        insertAfterThisNode.next.prev = newNode;
        insertAfterThisNode.next = newNode;
        newNode.prev = insertAfterThisNode;
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
        Node current = head;
        Node next;
        Node previous = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
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
        else if(n > listSize){
            System.out.println("Invalid List Size!");
            return;
        }
        else if(n == 1){
            if(listSize == 1){
                head = null;
                tail = null;
                listSize--;
                return;
            }
            else{
                head = head.next;
                head.prev = null;
                listSize--;
                return;
            }
        }
        else if(n ==listSize){
            tail = tail.prev;
            tail.next = null;
            listSize--;
            return;
        }
        else{
            Node deleteAfterThisNode = head;
        for(int i = 0; i < n-2; i++){
            deleteAfterThisNode = deleteAfterThisNode.next;
        }
        deleteAfterThisNode.next = deleteAfterThisNode.next.next;
        deleteAfterThisNode.next.prev = deleteAfterThisNode;
        listSize--;
                
            }
            }
}
