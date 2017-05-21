/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import edu.neu.info6205.Interface.Node;
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
public class LinkedListTest {
    
    public LinkedListTest() {
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
     * Test of size method, of class LinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedList instance = new LinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class LinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNodeAtHead method, of class LinkedList.
     */
    @Test
    public void testAddNodeAtHead() {
        System.out.println("addNodeAtHead");
        int value = 0;
        LinkedList instance = new LinkedList();
        instance.addNodeAtHead(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNodeAtTail method, of class LinkedList.
     */
    @Test
    public void testAddNodeAtTail() {
        System.out.println("addNodeAtTail");
        int value = 0;
        LinkedList instance = new LinkedList();
        instance.addNodeAtTail(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNodeAtPosition method, of class LinkedList.
     */
    @Test
    public void testAddNodeAtPosition() {
        System.out.println("addNodeAtPosition");
        int value = 0;
        int position = 0;
        LinkedList instance = new LinkedList();
        instance.addNodeAtPosition(value, position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reverseALinkList method, of class LinkedList.
     */
    @Test
    public void testReverseALinkList() {
        System.out.println("reverseALinkList");
        Node node = null;
        LinkedList instance = new LinkedList();
        Node expResult = null;
        Node result = instance.reverseALinkList(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeadNode method, of class LinkedList.
     */
    @Test
    public void testGetHeadNode() {
        System.out.println("getHeadNode");
        LinkedList instance = new LinkedList();
        Node expResult = null;
        Node result = instance.getHeadNode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTailNode method, of class LinkedList.
     */
    @Test
    public void testGetTailNode() {
        System.out.println("getTailNode");
        LinkedList instance = new LinkedList();
        Node expResult = null;
        Node result = instance.getTailNode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNodeAtPosition method, of class LinkedList.
     */
    @Test
    public void testDeleteNodeAtPosition() {
        System.out.println("deleteNodeAtPosition");
        int position = 0;
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.deleteNodeAtPosition(position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayList method, of class LinkedList.
     */
    @Test
    public void testDisplayList() {
        System.out.println("displayList");
        LinkedList instance = new LinkedList();
        instance.displayList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNegative method, of class LinkedList.
     */
    @Test
    public void testIsNegative() {
        System.out.println("isNegative");
        int dataToBeChecked = 0;
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.isNegative(dataToBeChecked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCyclic method, of class LinkedList.
     */
    @Test
    public void testIsCyclic() {
        System.out.println("isCyclic");
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.isCyclic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
