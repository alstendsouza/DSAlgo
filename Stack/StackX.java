/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author alsten
 */
class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;
    
    public StackX(int s){
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
    
    public void push(char c){
        stackArray[++top] = c;
    }
    
    public char pop(){
        return stackArray[top--];
    }
    
    public char peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return ( top == maxSize - 1);
    }
    
} 