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
public class ArrayList_App {

    public static void main(String args[]) {

        /*-------------------------CREATING ARRAYLIST-----------------------------*/
        // ArrayList Declaration : Non-Generic
        ArrayList al_generic = new ArrayList();

        // ArrayList Declaration : Generic (String here) (Integer, Student etc types can be created)
        ArrayList<String> al1 = new ArrayList<String>();//Creating arraylist  

        /*-------------------------ADDING ELEMENTS-----------------------------*/
        // 1: Adding objects in arraylist (simple add)
        al1.add("Wancy");
        al1.add("Pamela");
        al1.add("Wancy");
        System.out.println(al1);

        // 2: ArrayList index addition
        al1.add(1, "Alsten");
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<String>();         //Creating a new ArrayList al2
        al2.add("Sharon");
        al2.add("Levin");

        //3: Adding ALL al2 to al1
        al1.addAll(al2);
        System.out.println(al1);

        ArrayList<String> al3 = new ArrayList<String>();        //Creating a new ArrayList al3
        al3.add("Derrick");
        al3.add("Janet");

        //4 : Adding ALL al3 to al1 with index addition
        al1.addAll(1, al3);
        System.out.println(al1);

        /*-------------------------REMOVING ELEMENTS-----------------------------*/
        //1: Remove object with index
        al1.remove(1);
        System.out.println(al1);

        //2: Remove object itself (REMOVES ONLY FIRST OCCURANCE)
        al1.remove("Wancy");
        System.out.println(al1);

        //3: Remove object satisfying condition
        al1.removeIf(str -> str.contains("Jan")); // CASE-SENSITIVE and removes PART OF STRING also
        System.out.println(al1);

        //4: Remove ALL one arrayList from Another
        al1.removeAll(al2);
        System.out.println(al1);

        //5: Empties elements from ArrayList
        al1.clear();
        System.out.println(al1);

        /*-------------------------IS EMPTY-----------------------------*/
        System.out.println(al1.isEmpty());

        /*-------------------------RETRIEVING AN ELEMENT (get).... FINDING: contains() is used for check -----------------------------*/
        al1.add("Wancy");
        al1.add("Pamela");
        al1.add("Alsten");
        System.out.println(al1.get(0));
        
        /*-------------------------SIZE-----------------------------*/
        System.out.println("The size of arrayList is : " +al1.size());

        al1.set(2, "Sharon"); // SETTING AN ELEMENT REPLACES THE CURRENT ELEMENT IN POSITION
        System.out.println(al1);
        al1.add("Alsten");
        System.out.println(al1);

        /*-------------------------ITERATION OVER AN ARRAYLIST-----------------------------*/
        // 1: Iterator method (only forward iteration)
        Iterator itr = al1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 2: ListItertor method (forward and backward iteration)
        ListIterator<String> litr = al1.listIterator(al1.size()); // need size else it doesnt iterate backward
        while (litr.hasPrevious()) {
            System.out.print(litr.previous()+ " ");
        }
        System.out.println();
        
        while (litr.hasNext()) {
            System.out.print(litr.next()+ " ");
        }
        System.out.println();
        
        //3: simple for
        for(int i = 0 ; i < al1.size(); i++){
            System.out.print(al1.get(i)+" ");
        }
        System.out.println();
        
        //4: shorthand for
        for(String a:al1){
            System.out.print(a+" ");
        }
        System.out.println();

        
    }

}
