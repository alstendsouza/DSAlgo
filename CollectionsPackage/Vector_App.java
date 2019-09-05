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

/* 
Similar to ArrayList but syncronized and has legacy methods
Methods in Vector (but NOT in arrayList) => vec.addElement(), vec.capacity(); vec.firstElement(); vec.lastElement();

*/
public class Vector_App {

    public static void main(String args[]) {

        /*-------------------------CREATING VECTOR-----------------------------*/

        Vector<String> vec1 = new Vector<String>(4);//Creating vector  

        /*-------------------------ADDING ELEMENTS-----------------------------*/
        // 1: Adding objects in vector (simple add)
        vec1.add("Wancy");
        vec1.add("Pamela");
        vec1.add("Wancy");
        System.out.println(vec1);

        // 2: Vector index addition
        vec1.add(1, "Alsten");
        System.out.println(vec1);

        Vector<String> vec2 = new Vector<String>(2);         //Creating a new Vector vec2
        vec2.addElement("Sharon"); // addElement similar to add but it is syncronized
        vec2.addElement("Levin");

        //3: Adding ALL vec2 to vec1
        vec1.addAll(vec2);
        System.out.println(vec1);

        Vector<String> vec3 = new Vector<String>(2);        //Creating a new Vector vec3
        vec3.add("Derrick");
        vec3.add("Janet");

        //4 : Adding ALL vec3 to vec1 with index addition
        vec1.addAll(1, vec3);
        System.out.println(vec1);

        /*-------------------------REMOVING ELEMENTS-----------------------------*/
        //1: Remove object with index
        vec1.remove(1);
        System.out.println(vec1);

        //2: Remove object itself (REMOVES ONLY FIRST OCCURANCE)
        vec1.remove("Wancy");
        System.out.println(vec1);

        //3: Remove object satisfying condition
        vec1.removeIf(str -> str.contains("Jan")); // CASE-SENSITIVE and removes PART OF STRING also
        System.out.println(vec1);

        //4: Remove ALL one vector from Another
        vec1.removeAll(vec2);
        System.out.println(vec1);

        //5: Empties elements from Vector
        vec1.clear();
        System.out.println(vec1);

        /*-------------------------IS EMPTY-----------------------------*/
        System.out.println(vec1.isEmpty());

        /*-------------------------RETRIEVING AN ELEMENT (get), FINDING: contains() is used for check-----------------------------*/
        vec1.add("Wancy");
        vec1.add("Pamela");
        vec1.add("Alsten");
        System.out.println(vec1.get(0));

        /*-------------------------SIZE & CAPACITY-----------------------------*/
        System.out.println("The size of Vector is : " + vec1.size());
        System.out.println("The capacity of Vector is : " + vec1.capacity());

        vec1.set(2, "Sharon"); // SETTING AN ELEMENT REPLACES THE CURRENT ELEMENT IN POSITION
        System.out.println(vec1);
        vec1.add("Alsten");
        System.out.println(vec1);

        /*-------------------------ITERATION OVER AN VECTOR-----------------------------*/
        // 1: Iterator method (only forward iteration)
        Iterator itr = vec1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 2: ListItertor method (forward and backward iteration)
        ListIterator<String> litr = vec1.listIterator(vec1.size()); // need size else it doesnt iterate backward
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
        System.out.println();

        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }
        System.out.println();

        //3: simple for
        for (int i = 0; i < vec1.size(); i++) {
            System.out.print(vec1.get(i) + " ");
        }
        System.out.println();

        //4: shorthand for
        for (String a : vec1) {
            System.out.print(a + " ");
        }
        System.out.println();

    }
}
