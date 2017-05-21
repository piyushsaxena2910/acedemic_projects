/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackimplementationusinglinkedlist;

/**
 *
 * @author Piyush
 */
public class StackUsingLinkedListOperations {
    private Node top;
    private static int stackSize = 0;
    
    public void push(Object data){
        if(isEmpty()){
            Node newTop = new Node(data);
            top = newTop;
            stackSize++;
        }
        else{
            Node newTop = top;
            top = new Node(data);
            top.next = newTop;
            stackSize++;
        }
    }

    public boolean isEmpty() {
        return (stackSize == 0);
    }
    
    public Object pop(){
        if(isEmpty()){
            System.out.println("No data in the list! Cannot Pop!");
            return null;
        }
        else{
            Object data = top.data;
            top = top.next;
            stackSize--;
            return data;
        }
    }
    
    public Object peek(){
        if(isEmpty()){
            System.out.println("No Data in the Stack!");
            return null;
        }
        else{
        return top.data;
        }
    }
}
