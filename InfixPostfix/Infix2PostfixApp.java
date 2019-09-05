/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfixPostfix;

/**
 *
 * @author alsten
 */

import java.io.*;


class StackX{
    private int maxSize;
    private char stackArray[];
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
    
    public int size(){
        return top+1;
    }
    
    public char peekN(int n){
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

class InfixPostfix{
    private String input;
    private String output= "";
    private StackX s;
    
    public InfixPostfix(String in){
        input = in;
        int inputLength = input.length();
        s = new StackX(inputLength);
    }
    
    public String doTrans(){
        for(int j = 0; j < input.length(); j++){
            char ch = input.charAt(j);
            s.displayStack("For "+ ch + " ");
            switch(ch){
                case '+' :
                case '-' :
                    gotOper(ch,1);
                    break;
                case '*' :
                case '/' :
                    gotOper(ch,2);
                    break;
                case '(':
                    s.push(ch);
                    break;
                case ')':
                    gotParen();
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while(!s.isEmpty()){
            s.displayStack("While ");
            output = output + s.pop();
        }
        s.displayStack(" End ");
        return output;
    }
    
    private void gotOper(char opThis, int prec1){
        while (!s.isEmpty()){
            char opTop = s.pop();
            if(opTop == '('){
                s.push(opTop);
                break;
            }else{
                int prec2;
                if(opTop == '+' || opTop =='-'){
                    prec2 = 1;
                }else{
                    prec2 = 2;
                }
                
                if(prec2 < prec1){
                    s.push(opTop);
                    break;
                }else{
                    output = output + opTop;
                }
            }
        }
        s.push(opThis);
        
    }

    private void gotParen() {
        while(!s.isEmpty()){
            char chx = s.pop();
            if(chx == '('){
                break;
            }else{
                output = output + chx;
            }
        }
    }
}

public class Infix2PostfixApp {
    public static void main(String[] args) throws IOException{
        String input,output;
        while(true){
            System.out.println("Enter your Infix expression");
            input = getString();
            if(input == ""){
                break;
            }
            
            InfixPostfix ip = new InfixPostfix(input);
            output = ip.doTrans();
            System.out.println("The Postfix expression is "+ output);
        }
        }        
    
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
}
