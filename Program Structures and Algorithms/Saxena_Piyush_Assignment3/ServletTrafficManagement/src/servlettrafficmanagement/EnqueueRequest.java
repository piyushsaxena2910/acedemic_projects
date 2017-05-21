/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettrafficmanagement;

import QueueUsingLinkedListImplementation.Node;
import QueueUsingLinkedListImplementation.QueueUsingLinkedListOperations;
import java.util.ArrayList;
import java.util.TimerTask;

/**
 *
 * @author Piyush
 */
public class EnqueueRequest implements Runnable{
    private int totalExecutionTime;
    private QueueUsingLinkedListOperations qll;
    private ArrayList<Node> nodeList;
    
    public EnqueueRequest(int totalExecutionTime,QueueUsingLinkedListOperations qll, ArrayList<Node> nodeList){
        this.totalExecutionTime = totalExecutionTime;
        this.qll = qll;
        this.nodeList =  nodeList;
    }
    @Override
    public void run(){
        try{
            while(totalExecutionTime>0){
            RandomNumberGernerator rng = new RandomNumberGernerator();
            int randomNumber = rng.generateRandomNumber(4, 1);
                System.out.println("Adding " + randomNumber + " number of requests in the queue!");
            for(int i = 0; i < randomNumber; i++){
            qll.enqueue("request");
            qll.getRear().setStartTime(System.currentTimeMillis());
            qll.getRear().setInQueue(true);
            nodeList.add(qll.getRear());
        }
            Thread.sleep(1000);
            totalExecutionTime--;
            System.out.println("Size of Queue at Enqueue -> " + qll.queueSize());
            }
    }
    
    catch(Exception e){
    System.out.println(e);
}
    }
}
