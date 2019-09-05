/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeapsPackage;

import java.io.IOException;

/**
 *
 * @author alsten
 */
class Node{
    private int iData;
    
    public Node(int i){
        iData = i;
    }
    
    public int getKey(){
        return iData;
    }
    
    public void setData(int key){
        iData = key;
    }
}

class Heap{
    private int maxSize;
    private int currentSize;
    private Node[] heapArray;
    
    public Heap(int m){
        maxSize = m;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }
    
    public boolean isEmpty(){
        return currentSize == 0;
    }
    
    public boolean insert(int key){
        if(currentSize == maxSize){
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;
    }
    
    public void trickleUp(int index){
        Node bottom = heapArray[index];
        int parent = (index-1)/2;
        
        while(index > 0 && heapArray[parent].getKey() < bottom.getKey()){
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent-1)/2;
        }
        heapArray[index] = bottom;
    }
    
    public Node remove(){
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }
    
    public void trickleDown(int index){
        Node top = heapArray[index];
        int largerChild;
        
        while(index < currentSize/2){
        int leftChild = (2*index)+1;
        int rightChild = leftChild + 1;
        
        if(rightChild > currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()){
            largerChild = rightChild;
        }
        else{
            largerChild = leftChild;
        }
        
        if(top.getKey() >= heapArray[largerChild].getKey()){
            break;
        }
        heapArray[index] = heapArray[largerChild];
        index = largerChild;
        }
        heapArray[index] = top;
    }
    
    public boolean change(int index, int newValue){
        if(index < 0 || index>=currentSize){
            return false;
        }
        int oldValue = heapArray[index].getKey();
        heapArray[index].setData(newValue);
        if(oldValue < newValue){
            trickleUp(index);
        }else{
            trickleDown(index);
        }
        return true;
    }
}
public class heapApp {
    public static void main(String[] args) throws IOException{
        Heap h = new Heap(31);
    }
}
