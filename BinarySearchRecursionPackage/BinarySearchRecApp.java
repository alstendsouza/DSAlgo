/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchRecursionPackage;

/**
 *
 * @author alsten
 */

class BinarySearchRec{
    private long[] a;
    private int nElems;
    
    public BinarySearchRec(int maxSize){
        a = new long[maxSize];
        nElems = 0;
    }
    
    public int size(){
        return nElems;
    }
    
    public int find(long searchKey){
        return findRec(searchKey, 0 ,nElems - 1);
    }
    
    private int findRec(long searchKey, int lowerBound, int upperBound){
        int curr;
        curr = (lowerBound + upperBound) / 2;
        
        if(a[curr] == searchKey){
            return curr;
        } 
        else if(lowerBound > upperBound){
            return nElems;
        }
        else{
            if(a[curr] < searchKey){
                return findRec(searchKey, curr+1, upperBound);
            }else{
                return findRec(searchKey, lowerBound, curr - 1);
            }
        }
        
    }
    
    public void insert(long l){
        int i;
        int k;
        for(i = 0; i < size(); i++){
            if(l < a[i]){
                break;
            }
        }
        
        for(k = nElems; k > i; k--){
            a[k] = a[k-1];
        }
        a[k] = l;
        nElems++;
    }
    
    public void displayArr(){
        for(int j = 0; j < nElems; j++){
            System.out.print(a[j]+" ");
        }
        System.out.println("");
    }
}

public class BinarySearchRecApp {
    public static void main(String[] args){
        BinarySearchRec b = new BinarySearchRec(100);
        b.insert(20);
        b.insert(10);
        b.insert(90);
        b.insert(40);
        b.insert(30);
        b.insert(100);
        b.insert(80);
        b.insert(70);
        b.insert(50);
        b.insert(60);
        
        b.displayArr();
        
        long searchKey = 160;
        
        int res = b.find(searchKey);
        if (res != b.size()){
            System.out.println("The searchKey "+ searchKey+ " was found at index "+ res);
        }else{
            System.out.println("The searchKey was not found");
        }
    
    }
    
}
