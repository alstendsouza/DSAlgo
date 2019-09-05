/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTablePackage;

import java.io.IOException;

/**
 *
 * @author alsten
 */

class DataItem{

    private int item;
    
    public DataItem(int i){
        item = i;
    }
    
    public int getItem(){
        return item;
    }
}

class HashTable{
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem noItem;
    
    public HashTable(int size){
        arraySize = size;
        hashArray = new DataItem[arraySize];
        noItem = new DataItem(-1);
    }
    
    public int hashFunc(int key){
        return key % arraySize;
    }
    
    public DataItem find(int key){
        
        int hashVal  = hashFunc(key);
        
        while(hashArray[hashVal] != null){
            if(hashArray[hashVal].getItem() == key){
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }
    
    public void insert(DataItem item){
        int key = item.getItem();
        
        int hashVal = hashFunc(key);
        
        while(hashArray[hashVal] != null && hashArray[hashVal].getItem() != -1){
            ++hashVal;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item;
    }
    
    public DataItem delete(int key){
        int  hashVal = hashFunc(key);
        while(hashArray[hashVal] != null){
            if(hashArray[hashVal].getItem() == key){
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = noItem;
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }
    
    public void displayTable(){
        for(int i = 0 ; i <arraySize; i++){
            if(hashArray[i] != null){
                System.out.print(hashArray[i].getItem()+" ");
            }else{
                System.out.print("** ");
            }
        }
    }
}
public class HashTableApp {
    
    public static void main(String[] args) throws IOException{
        
    }
    
}
