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
    TreeSet is just like HashSet only that it doesnt allow duplicates and null as well. 
    Keeps the elements in sorted order
    Has a descending Iterator
    User Defined dataTypes neeed to implement Comparable in order to compare elements and sort them while iterating
    Search is faster
*/
public class TreeSet_App {

    public static void main(String args[]) {

        /*-------------------------CREATING TreeSet-----------------------------*/
        // HashSet Declaration : Generic (String here) (Integer, Student etc types can be created)
        TreeSet<String> al1 = new TreeSet<String>();//Creating TreeSet  

//        /*-------------------------ADDING ELEMENTS-----------------------------*/
        // 1: Adding objects in TreeSet (simple add)
        al1.add("Wancy");
        al1.add("Pamela");
        al1.add("Wancy"); // Ignores duplicates
//      al1.add(null); - (Doesnt let you add a null only . It throws an error)

        System.out.println(al1);

        TreeSet<String> al2 = new TreeSet<String>();         //Creating a new TreeSet al2
        al2.add("Sharon");
        al2.add("Alsten");

        //3: Adding ALL al2 to al1
        al1.addAll(al2);
        System.out.println(al1);

        HashSet<String> al3 = new HashSet<String>();        //Creating a new HashSet al3
        al3.add("Derrick");
        al3.add("Janet");

        //4 : Adding arraylist collection al3 to TreeSet al4
        TreeSet<String> al4 = new TreeSet<String>(al3);
        System.out.println(al4);

//        /*-------------------------REMOVING ELEMENTS-----------------------------*/
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
        System.out.println("The size of TreeSet is : " + al1.size());


        /*-------------------------ITERATION OVER AN TreeSet-----------------------------*/
        // 1: Iterator method (only forward iteration)
        Iterator itr = al1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 2: descendingIterator method (only backward iteration)
        Iterator itr1 = al1.descendingIterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");
        }
        System.out.println();

        // shorthand for
        for (String a : al1) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");

        /*-------------------------GETTING THE SET, SUBSET, HEADSET, TAILSET ETC-----------------------------*/
        
        TreeSet<Integer> numerals = new TreeSet<Integer>();
        numerals.add(2);
        numerals.add(4);
        numerals.add(3);
        numerals.add(5);
        numerals.add(1);

        
        System.out.println("Set is :"+ numerals);
        System.out.println("Descending Set is :"+ numerals.descendingSet());
        
        System.out.println("HeadSet of 3 is  :"+ numerals.headSet(3));
        System.out.println("HeadSet of 3 is  :"+ numerals.headSet(3,true));

        System.out.println("Tailset of 3 is  :"+ numerals.tailSet(3));
        System.out.println("Tailset of 3 is  :"+ numerals.tailSet(3,false));
        
        System.out.println("Subset :"+ numerals.subSet(1,5));
        System.out.println("Subset :"+ numerals.subSet(1,false,5,true));
        
        System.out.println("Lowest:"+ numerals.pollFirst()); //removes element from set
        System.out.println("Highest: "+numerals.pollLast()); // removes element from set
        
         System.out.println("Set now is :"+ numerals);

        /*-------------------------ADDING OBJECTS TO TREESET OF TYPE FAMILY AND ITERATING OVER IT-----------------------------*/
        Family f1 = new Family("Wancy", 60);
        Family f2 = new Family("Pamela", 56);
        Family f3 = new Family("Alsten", 27);

        TreeSet<Family> familySet = new TreeSet<Family>();
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
