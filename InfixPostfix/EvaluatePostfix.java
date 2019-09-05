/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfixPostfix;

import java.io.*;

/**
 *
 * @author alsten
 */

class StackXP{
    private int maxSize;
    private int stackArray[];
    private int top;
    
    public StackXP(int s){
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }
    
    public void push(int c){
        stackArray[++top] = c;
    }
    
    public int pop(){
        return stackArray[top--];
    }
    
    public int peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public int size(){
        return top+1;
    }
    
    public int peekN(int n){
        return stackArray[n];
    }
    
    public void displayStack(String s){
        System.out.print(s);
        System.out.print("Stack : (bottom => top) : ");
        for(int j = 0; j <size(); j++){
            System.out.print(peekN(j)+ " ");            
        }
        System.out.println();
    }
    
}

class EvaluateHelper{
    private String input;
    private StackXP s;
    
    public EvaluateHelper(String in){
        input = in;
    }
    
    public int evaluatePost(){
        s = new StackXP(20);
        for(int j = 0; j<input.length();j++){
            char ch = input.charAt(j);
            s.displayStack(""+ ch + " ");
            if(ch >='0' && ch<='9'){
                s.push((int)(ch - '0'));
            }else{
                int num2 = s.pop();
                int num1 = s.pop();
                int interAns;
                switch(ch)
                {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;  
                    case '*':
                        interAns = num1 * num2;
                        break; 
                    case '/':
                        interAns = num1 / num2;
                        break;     
                    default:
                        interAns = 0;
                        break;
                }   
                s.push(interAns);
            }           
        }
        return s.pop();
        
    }
}

public class EvaluatePostfix {
    public static void main(String[] args) throws IOException{
        String input;
        int output;
        
        while(true){
            System.out.println("Enter your postfix expression");
            input = getString();
            if(input == ""){
                break;
            }
            EvaluateHelper eh = new EvaluateHelper(input);
            output = eh.evaluatePost();
            System.out.println("The evaluated expression is "+ output);
        }
    }
        

    
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
