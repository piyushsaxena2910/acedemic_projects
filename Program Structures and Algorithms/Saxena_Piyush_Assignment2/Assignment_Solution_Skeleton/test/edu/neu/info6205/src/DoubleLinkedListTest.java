/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.DoubleLinkedListNode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Piyush
 */
public class DoubleLinkedListTest {
    
    public DoubleLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class DoubleLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        DoubleLinkedList instance = new DoubleLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class DoubleLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNodeAtHead method, of class DoubleLinkedList.
     */
    @Test
    public void testAddNodeAtHead() {
        System.out.println("addNodeAtHead");
        int value = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.addNodeAtHead(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNodeAtTail method, of class DoubleLinkedList.
     */
    @Test
    public void testAddNodeAtTail() {
        System.out.println("addNodeAtTail");
        int value = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.addNodeAtTail(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNodeAtPosition method, of class DoubleLinkedList.
     */
    @Test
    public void testAddNodeAtPosition() {
        System.out.println("addNodeAtPosition");
        int value = 0;
        int position = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.addNodeAtPosition(value, position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reverseALinkList method, of class DoubleLinkedList.
     */
    @Test
    public void testReverseALinkList() {
        System.out.println("reverseALinkList");
        DoubleLinkedListNode node = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        DoubleLinkedListNode expResult = null;
        DoubleLinkedListNode result = instance.reverseALinkList(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeadNode method, of class DoubleLinkedList.
     */
    @Test
    public void testGetHeadNode() {
        System.out.println("getHeadNode");
        DoubleLinkedList instance = new DoubleLinkedList();
        DoubleLinkedListNode expResult = null;
        DoubleLinkedListNode result = instance.getHeadNode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTailNode method, of class DoubleLinkedList.
     */
    @Test
    public void testGetTailNode() {
        System.out.println("getTailNode");
        DoubleLinkedList instance = new DoubleLinkedList();
        DoubleLinkedListNode expResult = null;
        DoubleLinkedListNode result = instance.getTailNode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNodeAtPosition method, of class DoubleLinkedList.
     */
    @Test
    public void testDeleteNodeAtPosition() {
        System.out.println("deleteNodeAtPosition");
        int position = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.deleteNodeAtPosition(position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayList method, of class DoubleLinkedList.
     */
    @Test
    public void testDisplayList() {
        System.out.println("displayList");
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.displayList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNegative method, of class DoubleLinkedList.
     */
    @Test
    public void testIsNegative() {
        System.out.println("isNegative");
        int dataToBeChecked = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.isNegative(dataToBeChecked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
