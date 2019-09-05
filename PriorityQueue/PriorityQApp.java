/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueue;

/**
 *
 * @author alsten
 */

class PriorityQ{
    private int maxSize;
    private long[] queueArr;
    private int nElems;
    
    public PriorityQ(int s){
        maxSize = s;
        queueArr = new long[maxSize];
        nElems = 0;
    }
    
    public void insert(long l){
        int j;
        if(nElems == 0){
            queueArr[nElems++] = l;
        }else{
            for(j=nElems-1;j>=0;j--){
                if(l > queueArr[j]){
                    queueArr[j+1] = queueArr[j]; 
                }
                else{
                    break;
                }
            }
            queueArr[j+1] = l;
            nElems++;
        }
    }
    
    public long remove(){
        return queueArr[--nElems];
    }
    
    public long peekMin(){
        return queueArr[nElems-1];
    }
    
    public boolean isEmpty(){
        return (nElems == 0);
    }
    
    public boolean isFull(){
        return (nElems == maxSize);
    }

}
public class PriorityQApp {
    public static void main(String[] args){
        
        PriorityQ q = new PriorityQ(5);
        q.insert(30);
        q.insert(50);
        q.insert(10);
        q.insert(40);
        q.insert(20);
        
        while(!q.isEmpty()){
            long item = q.remove();
            System.out.print(item + " ");
        }
    }
    
}
