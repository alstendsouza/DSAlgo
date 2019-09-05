/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsPackage;

import java.util.*;

/**
 *
 * @author alsten
 */

/* Queue implements FIFO but priority queue does not*/

public class QueueNPriorityQueue_App {
    public static void main(String args[]) {
        PriorityQueue<String> q = new PriorityQueue<String>(); // String and Wrapper classes are comparable by default. UserDefined class needs to implement comparable
        
        /*-------------------------ADDING ELEMENTS-----------------------------*/
        q.add("Wancy");
        q.add("Pamela");
        q.add("Alsten");
        q.add("Sharon");
        
        System.out.println(q);
        
        /*-------------------------REMOVING ELEMENTS-----------------------------*/   
        q.remove();
        
        /*-------------------------ITERATING OVER ELEMENTS-----------------------------*/   
        Iterator i = q.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+ " ");
        }
        System.out.println();
        
    }
}
