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
public class Node {
    Node next;
    Object data;
    
//    public Node(Node next, Object data){
//        this.next = next;
//        this.data = data;
//    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
