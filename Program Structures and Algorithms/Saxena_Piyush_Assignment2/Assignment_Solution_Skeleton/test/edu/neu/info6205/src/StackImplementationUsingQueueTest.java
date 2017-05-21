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
public class StackImplementationUsingQueueTest {
    
    public StackImplementationUsingQueueTest() {
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
     * Test of push method, of class StackImplementationUsingQueue.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int value = 0;
        Queue queue1 = null;
        Queue queue2 = null;
        StackImplementationUsingQueue instance = new StackImplementationUsingQueue();
        instance.push(value, queue1, queue2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackImplementationUsingQueue.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Queue queue1 = null;
        Queue queue2 = null;
        StackImplementationUsingQueue instance = new StackImplementationUsingQueue();
        Object expResult = null;
        Object result = instance.pop(queue1, queue2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class StackImplementationUsingQueue.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Queue queue1 = null;
        Queue queue2 = null;
        StackImplementationUsingQueue instance = new StackImplementationUsingQueue();
        Object expResult = null;
        Object result = instance.peek(queue1, queue2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
