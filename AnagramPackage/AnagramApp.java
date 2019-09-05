/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnagramPackage;

/**
 *
 * @author alsten
 */
import java.io.*;

public class AnagramApp {
    
    static int size;
    static char[] a;
    public static void main(String[] args) throws IOException{
        
        a = new char[]{'c','a','t'};
        size = a.length;
        doAnagram(size);
    }
    
    public static void doAnagram(int newSize){
        if(newSize == 1){
            return;
        }else{
            for(int i = 0; i < newSize; i++){
                doAnagram(newSize-1);
                if(newSize == 2){
                    displayWord();
                }
                rotate(newSize);                
            }
        }
    }
    
    public static void rotate(int s){
        int position = size - s;
        char temp = a[position];
        int i; 
        for(i = position +1 ; i < size; i++){
            a[i-1] = a[i];
        }
        a[i-1]  = temp;
    }
    
    public static void displayWord(){
        for(int i = 0; i < size; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }






    
}
