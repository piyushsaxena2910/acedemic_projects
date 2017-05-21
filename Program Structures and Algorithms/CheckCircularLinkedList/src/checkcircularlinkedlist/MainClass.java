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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListOperations llo = new LinkedListOperations();
        llo.addNodeAtHead("c");
        llo.addNodeAtHead("a");
        llo.addNodeAtTail("d");
        llo.addNodeAtTail("b");
        llo.addNodeAtTail("c");
        llo.addNodeAtTail("q");
        llo.addNodeAtTail("r");
        llo.addNodeAtTail("s");
        llo.addNodeAtTail("b");
        llo.addElementAtPosition(5, "piyush");
        llo.addElementAtPosition(9, "piyush");
        llo.displayList();
        System.out.println("");
        llo.reverseAList();
        llo.displayList();
        System.out.println("");
        System.out.println(llo.getHeadNode().data);
        System.out.println(llo.getTailNode().data);
        llo.deleteElement(4);
        System.out.println("");
        llo.displayList();
        System.out.println("");
        System.out.println("Is the list cyclis: " + llo.isCyclic());
    }
    
}
