/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueUsingLinkedListImplementation;

/**
 *
 * @author Piyush
 */
public class Node {
    Node next;
    Object data;
    long timeInQueue;
    long startTime;
    long endTime;
    long waitTime;
    boolean inQueue;

    public long getWaitTime() {
        return endTime - startTime;
    }

    public void setWaitTime(long waitTime) {
        this.waitTime = waitTime;
    }
    
    public Node(Object data){
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public long getTimeInQueue() {
        return timeInQueue;
    }

    public void setTimeInQueue(long timeInQueue) {
        this.timeInQueue = timeInQueue;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public boolean isInQueue() {
        return inQueue;
    }

    public void setInQueue(boolean inQueue) {
        this.inQueue = inQueue;
    }

    
    @Override
    public String toString() {
        return String.valueOf(data);
    }
    
    
}
