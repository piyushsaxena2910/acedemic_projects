/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

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
public class QueueImplementationUsingStackTest {
    
    public QueueImplementationUsingStackTest() {
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
     * Test of enqueue method, of class QueueImplementationUsingStack.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        int value = 0;
        Stack stack1 = null;
        Stack stack2 = null;
        QueueImplementationUsingStack instance = new QueueImplementationUsingStack();
        instance.enqueue(value, stack1, stack2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dequeue method, of class QueueImplementationUsingStack.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        Stack stack1 = null;
        Stack stack2 = null;
        QueueImplementationUsingStack instance = new QueueImplementationUsingStack();
        Object expResult = null;
        Object result = instance.dequeue(stack1, stack2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class QueueImplementationUsingStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Stack stack1 = null;
        Stack stack2 = null;
        QueueImplementationUsingStack instance = new QueueImplementationUsingStack();
        Object expResult = null;
        Object result = instance.peek(stack1, stack2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
