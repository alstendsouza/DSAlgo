/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysnStrings;

import java.util.*;

/**
 *
 * @author alsten
 */
//
class ArrayD {

    private int[] arrayA;
    private int nElems;

    public ArrayD(int maxSize) {
        arrayA = new int[maxSize];
        nElems = 0;
    }
    
    public void insert(int elem){
        arrayA[nElems++] = elem;
    }
    
    public void display(){
        for(int i = 0; i < nElems; i++){
            System.out.print(arrayA[i]+" ");
        }
        System.out.println();
    }
    
    public void mergeSort(){
        int[] workspace = new int[nElems];
        recMergeSort(workspace,0,nElems-1);
    }
    
    public void recMergeSort(int[] w, int lowerbound, int upperbound){
        if(lowerbound == upperbound){
            return;
        }else{
            int mid = (lowerbound+upperbound)/2;
            recMergeSort(w,lowerbound,mid);
            recMergeSort(w,mid+1,upperbound);
            merge(w,lowerbound,mid+1,upperbound);
        }
    }
    
    public void merge(int[] w, int lowKey, int highKey, int upperbound){
        int j = 0;
        int lowerbound = lowKey;
        int mid = highKey-1;
        int n = upperbound - lowerbound +1;
        
        while(lowKey <= mid && highKey<=upperbound){
            if(arrayA[lowKey] < arrayA[highKey]){
                w[j++] = arrayA[lowKey++];
            }else{
                w[j++] = arrayA[highKey++];
            }
        }
        
        while(lowKey <= mid ){
            w[j++] = arrayA[lowKey++];
        }
        
         while(highKey<=upperbound ){
            w[j++] = arrayA[highKey++];
        }
         
        for(j = 0; j < n; j++){
            arrayA[lowerbound+j] = w[j];
        }
    }
}

public class testapp {

    public static void main(String args[]) {

        ArrayD arr = new ArrayD(100);
        arr.insert(64);
        arr.insert(21);
        arr.insert(33);
        arr.insert(70);
        arr.insert(12);
        arr.insert(85);
        arr.insert(44);
        arr.insert(3);
        arr.insert(99);
        arr.insert(0);
        arr.insert(108);
        arr.insert(36);
        
        arr.display();
        
        arr.mergeSort();
        
        arr.display();
        
        
    }

}
