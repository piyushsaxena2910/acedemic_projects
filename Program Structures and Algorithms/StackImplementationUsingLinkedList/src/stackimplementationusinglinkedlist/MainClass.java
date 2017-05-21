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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackUsingLinkedListOperations sll = new StackUsingLinkedListOperations();
        sll.push("a");
        sll.push("b");
        sll.push("c");
        sll.push("d");
        System.out.println(sll.peek());
        
        //System.out.println(sll.peek());
        sll.pop();
        System.out.println(sll.peek());
        sll.pop();
        System.out.println(sll.peek());
        sll.pop();
        System.out.println(sll.peek());
        System.out.println("This" + sll.pop());
    }
    
}
