/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TowerOfHanoiPackage;

/**
 *
 * @author alsten
 */
public class TowerOfHanoiApp {
    
    static int nDisks;
    
    public static void main(String[] args){
        nDisks = 5;
        doHanoi(nDisks, 'A' , 'B', 'C');
    }
    
    public static void doHanoi(int n, char from,char inter, char to){
        if(n == 1){
            System.out.println("Disk 1 from "+ from + " to "+ to);
        }else{
            doHanoi(n-1,from,to,inter);
            System.out.println("Disk "+ n +" from "+from+ " to "+to);
            doHanoi(n-1,inter,from,to);
        }
    }
    
}
