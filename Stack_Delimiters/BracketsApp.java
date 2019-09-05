/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Delimiters;

import java.io.*;

/**
 *
 * @author alsten
 */

class StackX{
    private int maxSize;
    private char[] StackArray;
    private int top;
    
    public StackX(int s){
        maxSize = s;
        StackArray = new char[maxSize];
        top = -1;
    }
    
    public void push(char c){
        StackArray[++top] = c;
    }
    
    public char pop(){
        return StackArray[top--];
    }
    
    public char peek(){
        return StackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
}

class BracketChecker{
    private String input;
    public BracketChecker(String in){
        input = in;
    }
    
    public void check(){
        int StackSize = input.length();
        StackX s = new StackX(StackSize);
        for(int j = 0; j < StackSize; j++){
            char ch = input.charAt(j);
            
            switch(ch){
                case '{':
                case '[':
                case '(':
                    s.push(ch);
                    break;
                    
                case '}':
                case ']':
                case ')':
                    if(!s.isEmpty()){
                        char chx = s.pop();
                        if((ch=='}'&& chx != '{') || (ch==']'&& chx != '[') || (ch==')' && chx!='(')){
                            System.out.println("error "+ch+" at "+ j);
                        }
                    }else{
                        System.out.println("error "+ch+" at "+ j);
                    }
                    break;
                default:
                    break;
            }
                   
        }
        if(!s.isEmpty()){
            System.out.println("missing right delimiter");
        }
    }

}

class BracketsApp {
    public static void main(String[] args) throws IOException{
        String input;
        while(true){
            System.out.println("Enter you Delimiter String");
            System.out.flush();
            input = getString();
            if(input.equals("")){
                break;
            }
            BracketChecker b = new BracketChecker(input);
            b.check();
        }
    }
    
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
}
