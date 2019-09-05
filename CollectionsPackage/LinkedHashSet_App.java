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
public class LinkedHashSet_App {

    public static void main(String args[]) {

        /*-------------------------CREATING HASHSET-----------------------------*/
        // HashSet Declaration : Generic (String here) (Integer, Student etc types can be created)
        LinkedHashSet<String> al1 = new LinkedHashSet<String>();//Creating HashSet  

        /*-------------------------ADDING ELEMENTS-----------------------------*/
        // 1: Adding objects in LinkedHashSet (simple add)
        al1.add("Wancy");
        al1.add("Pamela");
        al1.add("Wancy"); // Ignores duplicates
        al1.add(null);
        al1.add(null); // Ignores duplicates

        System.out.println(al1);

        LinkedHashSet<String> al2 = new LinkedHashSet<String>();         //Creating a new LinkedHashSet al2
        al2.add("Sharon");
        al2.add("Alsten");

        //3: Adding ALL al2 to al1
        al1.addAll(al2);
        System.out.println(al1);

        HashSet<String> al3 = new HashSet<String>();        //Creating a new HashSet al3
        al3.add("Derrick");
        al3.add("Janet");

        //4 : Adding arraylist collection al3 to LinkedHashSet al4
        LinkedHashSet<String> al4 = new LinkedHashSet<String>(al3);
        System.out.println(al4);

        /*-------------------------REMOVING ELEMENTS-----------------------------*/
        //1: Remove object itself (REMOVES ONLY FIRST OCCURANCE)
        al1.remove("Wancy");
        System.out.println(al1);

        //2: Remove object satisfying condition
        al4.removeIf(str -> str.contains("Jan")); // CASE-SENSITIVE and removes PART OF STRING also
        System.out.println(al4);

        al1.add("Derrick");
        System.out.println(al1);

        //3: Remove ALL one Hashset from Another
        al1.removeAll(al4);
        System.out.println(al1);

        //4: Empties elements from HashSet
        al1.clear();
        System.out.println(al1);

        /*-------------------------IS EMPTY-----------------------------*/
        System.out.println(al1.isEmpty());

        /*-------------------------FINDING AN ELEMENT (contains)-----------------------------*/
        al1.add("Wancy");
        al1.add("Pamela");
        al1.add("Alsten");
        System.out.println(al1);
        System.out.println(al1.contains("Wancy"));

        /*-------------------------SIZE-----------------------------*/
        System.out.println("The size of LinkedHashSet is : " + al1.size());


        /*-------------------------ITERATION OVER AN HashSet-----------------------------*/
        // 1: Iterator method (only forward iteration)
        Iterator itr = al1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // shorthand for
        for (String a : al1) {
            System.out.print(a + " ");
        }
        System.out.println();

        /*-------------------------ADDING OBJECTS TO LINKEDHASHSET OF TYPE FAMILY AND ITERATING OVER IT-----------------------------*/
        Family f1 = new Family("Wancy", 60);
        Family f2 = new Family("Pamela", 56);
        Family f3 = new Family("Alsten", 27);

        LinkedHashSet<Family> familySet = new LinkedHashSet<Family>();
        familySet.add(f1);
        familySet.add(f2);
        familySet.add(f3);
        familySet.add(f2); // added duplicate and ignored therefore (next comment)

        // shorthand for
        for (Family fam : familySet) {
            System.out.println("My name is " + fam.name + " and age is " + fam.age);
        }
        System.out.println(familySet.size()); // therefore size still 3

        Iterator f_itr = familySet.iterator();
        
        while (f_itr.hasNext()) {
            Family f_itr_o = (Family) f_itr.next();
            System.out.println("My name is " + f_itr_o.name + " and age is " + f_itr_o.age);
        }

    }
}
