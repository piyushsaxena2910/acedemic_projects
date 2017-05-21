/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettrafficmanagement;

import QueueUsingLinkedListImplementation.Node;
import QueueUsingLinkedListImplementation.QueueUsingLinkedListOperations;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Piyush
 */
public class ServletTrafficManagement{
    private int totalExecutionTime;
    private int dequeueStartTime;
    private int dequeueEndTime;

    public ServletTrafficManagement(int totalExecutionTime, int dequeueStartTime, int dequeueEndTime) {
        this.totalExecutionTime = totalExecutionTime;
        this.dequeueEndTime = dequeueEndTime;
        this.dequeueStartTime = dequeueStartTime;
    }

    public int getTotalExecutionTime() {
        return totalExecutionTime;
    }

    public void setTotalExecutionTime(int totalExecutionTime) {
        this.totalExecutionTime = totalExecutionTime;
    }

    public int getDequeueStartTime() {
        return dequeueStartTime;
    }

    public void setDequeueStartTime(int dequeueStartTime) {
        this.dequeueStartTime = dequeueStartTime;
    }

    public int getDequeueEndTime() {
        return dequeueEndTime;
    }

    public void setDequeueEndTime(int dequeueEndTime) {
        this.dequeueEndTime = dequeueEndTime;
    }

    
    public ArrayList<Node> instantiateQueue() throws InterruptedException{
        ArrayList<Node> nodeList = new ArrayList<>();
        QueueUsingLinkedListOperations qll = new QueueUsingLinkedListOperations();
        EnqueueRequest er = new EnqueueRequest(totalExecutionTime,qll,nodeList);
        Thread threadEnqueue = new Thread(er);
        threadEnqueue.start();
        
        DequeueRequest dr = new DequeueRequest(totalExecutionTime,dequeueStartTime,dequeueEndTime,qll);
        Thread threadDequeue = new Thread(dr);
        threadDequeue.start();
        
        while(!threadEnqueue.isAlive() && !threadDequeue.isAlive()){
            Thread.sleep(1000);
        }
        return nodeList;
    }

   
    
    
}
