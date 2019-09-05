/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

/**
 *
 * @author alsten
 */

class Queue{
    private int maxSize;
    private long[] qStack;
    private int front;
    private int rear;
    private int nElems;
    
    public Queue(int s){
        maxSize = s;
        qStack = new long[maxSize];
        front = 0;
        rear = -1;
        nElems = 0;
    }
    
    public void insert(long l){
        if(rear == maxSize - 1){
            rear = -1;
        }
        qStack[++rear] = l;
        nElems++;
    }
    
    public long remove(){
        long temp = qStack[front++];
        if(front == maxSize){
            front = 0;
        }
        nElems--;
        return temp;
    }
    
    public long peek(){
        return qStack[front];
    }
    
    public boolean isEmpty(){
        return (nElems == 0);
    }
    
    public boolean isFull(){
        return (maxSize == nElems);
    }
    
    public int size(){
        return nElems;
    }
    
}

public class QueueApp {
    
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        
        q.remove();
        q.remove();
        q.remove();
        
        q.insert(50);
        q.insert(60);
        q.insert(70);
        q.insert(80);
        
        while(!q.isEmpty()){
            System.out.print(q.remove());
            System.out.print(" ");
        }
        
    }
    
}
