


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
class StackMakerDelimiter{
    private int maxSize;
    private int top;
    private char[] a;
    
    public StackMakerDelimiter(int max){
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

class DelimiterChecker{
    private String input;
    
    public DelimiterChecker(String in){
        input = in;
    }

    public void checkDelimiters(){
        StackMakerDelimiter s = new StackMakerDelimiter(input.length());
        boolean flag = true;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
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
                        if((chx=='{' && ch !='}') || (chx=='[' && ch !=']') || (chx=='(' && ch !=')')){
                            System.out.println("Error at index "+i+" for character "+ ch);
                            flag = false;
                        }
                    }else{
                        System.out.println("Error at index "+i+" for character "+ ch);
                        flag = false;
                    }
                    break;
                default:
                    break;      
            }           
        }
        
        if(!s.isEmpty()){
            System.out.println("missing right parenthesis");
        }else{
            if(flag){
                System.out.println("all cool");
            }
        }

    }
}

public class DelimiterCheckApp {
    
    public static void main(String[] args) throws IOException{
        String input;
        while(true){
            System.out.println("Enter the String: ");
            input = getInput();
            
            DelimiterChecker r = new DelimiterChecker(input);
            r.checkDelimiters();
        }

    }
    
    public static String getInput() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
}
