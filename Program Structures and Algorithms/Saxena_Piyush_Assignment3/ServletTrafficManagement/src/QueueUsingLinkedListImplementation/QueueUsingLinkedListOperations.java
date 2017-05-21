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
public class QueueUsingLinkedListOperations {
    private Node front;
    private Node rear;
    private static int queueSize = 0;

    
    public QueueUsingLinkedListOperations() {
        front = new Node(null);
        rear = new Node(null);
    }
    
    public Node getFront(){
        return front;
    }
    
    public Node getRear(){
        return rear;
    }
    
    public void enqueue(Object data){
        if(isEmpty()){
            System.out.println("Inside IsEmpty!");
            Node newNode = new Node(data);
            newNode.setStartTime(System.nanoTime());
            front = newNode;
            rear = newNode;
            System.out.println("front->" + front + "rear->" + rear);
            queueSize++;
            System.out.println("queue size->" + queueSize);
        }
        else{
            System.out.println("Inside non empty!");
            Node newRear = new Node(data);
            newRear.setStartTime(System.nanoTime());
            System.out.println("front of non empty->" + front + "rear of non empty-" + rear);
            rear.setNext(newRear);
            rear = rear.getNext();
            queueSize++;
        }
    }

    public boolean isEmpty() {
        return (queueSize == 0);
    }
    
    public Object dequeue(){
        if(isEmpty()){
            System.out.println("No data in the list! Cannot Pop!");
            return null;
        }
        else{
            front.setEndTime(System.nanoTime());
            front.setTimeInQueue(front.endTime - front.startTime);
            Node removedNode = front;
            front = front.next;
            queueSize--;
            return removedNode;
        }
    }
    
    public Node peek(){
        if(isEmpty()){
            System.out.println("No Data in the Stack!");
            return null;
        }
        else{
        return front;
        }
    }
    
    public int queueSize(){
        return queueSize;
    }
}
