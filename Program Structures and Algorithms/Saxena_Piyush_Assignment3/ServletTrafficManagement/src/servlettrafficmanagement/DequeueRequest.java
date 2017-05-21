/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettrafficmanagement;

import QueueUsingLinkedListImplementation.QueueUsingLinkedListOperations;
import QueueUsingLinkedListImplementation.Node;
import java.util.ArrayList;


/**
 *
 * @author Piyush
 */
public class DequeueRequest implements Runnable{
    private int totalExecutionTime;
    private int dequeueStartTime;
    private int dequeueEndTime;
    private QueueUsingLinkedListOperations qll;

    public DequeueRequest(int totalExecutionTime,int dequeueStartTime, int dequeueEndTime, QueueUsingLinkedListOperations qll) {
        this.totalExecutionTime = totalExecutionTime;
        this.dequeueStartTime = dequeueStartTime;
        this.dequeueEndTime = dequeueEndTime;
        this.qll = qll;
    }
    
    @Override
    public void run() {
        RandomNumberGernerator rng = new RandomNumberGernerator();
        int counter = 0;
        while(totalExecutionTime>counter){
        try {
            int randomNumber = rng.generateRandomNumber(dequeueEndTime + 1, dequeueStartTime);
            System.out.println("Will dequeue in " + randomNumber + " number of seconds!");
            Thread.sleep(randomNumber*1000);
            counter = counter + randomNumber;
            System.out.println("Dequeuing -> "+qll.peek());
            qll.peek().setEndTime(System.currentTimeMillis());
            qll.peek().setInQueue(false);
            qll.dequeue();
            System.out.println("Size of Queue at Dequeue -> " + qll.queueSize());
        
        }
        catch(Exception e){
            System.out.println("Queue is Empty!");
        }
        }
        
        System.out.println("Size of Queue at the end -> " + qll.queueSize());
    }
}
