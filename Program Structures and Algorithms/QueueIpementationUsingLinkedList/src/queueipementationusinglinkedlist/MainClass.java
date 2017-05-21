/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueipementationusinglinkedlist;

/**
 *
 * @author Piyush
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueUsingLinkedListOperations qll = new QueueUsingLinkedListOperations();
        System.out.println(qll.isEmpty());
        qll.enqueue("a");
        qll.enqueue("b");
        qll.enqueue("c");
        qll.enqueue("d");
        qll.enqueue("e");
        System.out.println(qll.peek());
        qll.dequeue();
        System.out.println(qll.peek());
        qll.dequeue();
        System.out.println(qll.peek());
        qll.dequeue();
        System.out.println(qll.peek());
        qll.dequeue();
        System.out.println(qll.peek());
        qll.dequeue();
        System.out.println(qll.peek());
    }
    
}
