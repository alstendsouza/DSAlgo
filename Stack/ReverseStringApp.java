/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.io.*;

/**
 *
 * @author alsten
 */
class StackMaker{
    private int maxSize;
    private int top;
    private char[] a;
    
    public StackMaker(int max){
        maxSize = max;
        a = new char[maxSize];
        top = -1;
    }
    
    public void push(char c){
        a[++top] = c;
    }
    
    public char pop(){
        return a[top--];
    }
    
    public boolean isFull(){
        return (top == maxSize - 1 );
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
}

class Reverser{
    private String input;
    private String output;
    
    public Reverser(String in){
        input = in;
    }

    public String doReverse(){
        StackMaker s = new StackMaker(input.length());
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            s.push(c);
        }
        output = "";
        while(!s.isEmpty()){
            output = output + s.pop();
        }
        return output;
    }
}

public class ReverseStringApp {
    
    public static void main(String[] args) throws IOException{
        String input, output;
        while(true){
            System.out.println("Enter the String: ");
            input = getInput();
            
            Reverser r = new Reverser(input);
            output = r.doReverse();
            System.out.println("The reverse of the string is : "+output);
        }

    }
    
    public static String getInput() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
}
