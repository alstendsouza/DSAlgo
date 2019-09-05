/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alsten
 */





public class ReverseApp {
    
    public static void main(String args[]) throws IOException{
        String input,output;
        while(true){
            System.out.println("Please enter the string");
            System.out.flush();
            input = getString();
            
            if(input.length() == 0){
                break;
            }
            ReverseStack r = new ReverseStack(input);
            output = r.doRev();
            System.out.println(output);
        }
        
    }
    
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
}
