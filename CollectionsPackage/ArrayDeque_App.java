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

/*  Array Deque means Double Ended Queue and has a resizable array.
    Unlike Queue, we can add or remove elements from both sides.
    Doesnt Allow Null
    ArrayDeque is faster than LinkedList and Stack.
    Same like Queue (FIFO default) but offerFirst and pollLast()
*/
public class ArrayDeque_App {

    public static void main(String args[]) {
        ArrayDeque<String> aq = new ArrayDeque<String>(); // String and Wrapper classes are comparable by default. UserDefined class needs to implement comparable

        /*-------------------------ADDING ELEMENTS (all adds behind)-----------------------------*/
        aq.add("Wancy");
        aq.add("Pamela");
        aq.add("Alsten");
        
        aq.offerFirst("Sharon"); // adding from from

        System.out.println(aq);

        /*-------------------------REMOVING ELEMENTS ( all from front)-----------------------------*/
        aq.remove();
        System.out.println(aq);
        
        aq.pollLast();
        System.out.println(aq);

        /*-------------------------ITERATING OVER ELEMENTS-----------------------------*/
        Iterator i = aq.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();

    }
}
