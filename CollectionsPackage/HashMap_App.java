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
    HashMap implements map interface by using a hashTable.
    key-value pairs
    the insertion order is not maintained (based on hashcode)
    have only unique keys (one null allowed) 
    multiple nulls allowed in values
    The initial default capacity of Java HashMap class is 16
*/
class Book{
    int id;
    String name, author;
    
    public Book(int i, String n, String a){
        id = i;
        name = n;
        author = a;
    }
}

public class HashMap_App {
    
    public static void main(String[] args){
        
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        
        /*-------------------------ADDING/ITERATING ELEMENTS-----------------------------*/

        hm.put(1,"Wancy"); // simple put
        hm.put(3,"Alsten");
        hm.put(2, "Sharon");

        hm.putIfAbsent(4, "Pamela"); // put if absent
        
        System.out.println(hm);
        
        Set s = hm.entrySet(); // converts map to a set coz maps are not iterable MAP => SET
        System.out.println(s);
        
        Iterator i = s.iterator();
        while(i.hasNext()){
            Map.Entry m = (Map.Entry)i.next();
            System.out.println(m.getKey()+ " "+m.getValue());
        }
        HashMap<Integer,String> hm2 = new HashMap<Integer,String>(); // new way of creating Map
        hm2.put(6,"Janet");
        hm2.put(7,"Marshal");
        hm2.put(8, "Shalini");
        hm2.put(null,"Allan");
        System.out.println(hm2);
        
        hm.putAll(hm2); // put all
        System.out.println("Test "+ hm);

        /*-------------------------REMOVING ELEMENTS-----------------------------*/
        
        hm.remove(4);
        System.out.println(hm);
        
        hm.remove(null,"Allan");
        System.out.println(hm);   
        
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue()); // foreach way of iterating
        }
             
        System.out.println(hm.containsKey(2));
        System.out.println(hm.containsValue("Alsten"));
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        System.out.println(hm.keySet());
        
        /*-------------------------ITERATING OBJECTS-----------------------------*/
       
        HashMap<Integer,Book> books_hm = new HashMap<Integer,Book>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar");    
        Book b2=new Book(102,"Data Communications & Networking","Forouzan");    
        Book b3=new Book(103,"Operating System","Galvin");
        
        books_hm.put(1, b1);
        books_hm.put(2, b2);
        books_hm.put(3, b3);
        
        System.out.println(books_hm);
        System.out.println(books_hm.entrySet()); 
        for(Map.Entry<Integer,Book> m : books_hm.entrySet()){
            int key = m.getKey();
            Book b = m.getValue();
            System.out.println(key+" "+b.id+" "+b.name+" / "+b.author);
        }
        
    }
}
