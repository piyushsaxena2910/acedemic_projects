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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedListOperations dll = new DoublyLinkedListOperations();
        dll.addNodeAtHead("a");
        dll.addNodeAtTail("b");
        dll.displayList();
        System.out.println("");
        dll.addNodeAtHead("c");
        dll.displayList();
        dll.addNodeAtTail("d");
        System.out.println("");
        dll.displayList();
        System.out.println("");
        dll.addElementAtPosition(3, "e");
        dll.displayList();
        System.out.println(dll.isEmpty());
        System.out.println(String.valueOf(dll.getHeadNode().data));
        System.out.println(String.valueOf(dll.getTailNode().data));
        dll.deleteElement(5);
        dll.displayList();
    }
    
}
