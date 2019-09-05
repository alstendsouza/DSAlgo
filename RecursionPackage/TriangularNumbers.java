/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionPackage;

import java.io.*;
/**
 *
 * @author alsten
 */
public class TriangularNumbers {
    static int num;
    public static void main(String[] args) throws IOException{
        System.out.println("Enter a number : ");
        num = getInt();
        int result = triangle(num);
        System.out.println("Traingular is : "+ result);
    }

    private static int getInt() throws IOException {
        String i = getString();
        return Integer.parseInt(i);
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    private static int triangle(int n) {
        System.out.println("Entering "+n);
        if(n == 1){
            System.out.println("Returning 1");
            return 1;
        }else{
            int temp = n + triangle(n-1);
            System.out.println("Returning "+temp);
            return temp;
        }
    }
    
}
