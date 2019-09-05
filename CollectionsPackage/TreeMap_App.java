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
Treemap just like hashmap but SORTS in ascending order
no nulls
can have null values though
descending Map
headMap, tailMap, subMap with booleans
*/
public class TreeMap_App {
          
    public static void main(String[] args){
        
        TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
        
        /*-------------------------ADDING/ITERATING ELEMENTS-----------------------------*/

        hm.put(2,"Wancy"); // simple put
        hm.put(1,"Alsten");
        hm.put(3, "Sharon");

        hm.putIfAbsent(4, "Pamela"); // put if absent
        
        System.out.println(hm);
        
        Set s = hm.entrySet(); // converts map to a set coz maps are not iterable MAP => SET
        System.out.println(s);
        
        Iterator i = s.iterator();
        while(i.hasNext()){
            Map.Entry m = (Map.Entry)i.next();
            System.out.println(m.getKey()+ " "+m.getValue());
        }
        
        
        System.out.println("Descending"+ hm.descendingMap());
        System.out.println("headmap"+ hm.headMap(3));
        System.out.println("headmap with true"+ hm.headMap(3,true));
        System.out.println("tailmap"+ hm.tailMap(3));
        System.out.println("tailmap with false"+ hm.tailMap(3,true));
        System.out.println("SubMap"+ hm.subMap(2,4));
        System.out.println("SubMap with flags"+ hm.subMap(2,false,4,true));
        
        HashMap<Integer,String> hm2 = new HashMap<Integer,String>(); // new way of creating Map
        hm2.put(6,"Janet");
        hm2.put(7,"Marshal");
        hm2.put(8, "Shalini");
//        hm2.put(null,"Allan"); // causes errorcoz null not allowed
        System.out.println(hm2);
        
        hm.putAll(hm2); // put all
        System.out.println("Test "+ hm);

        /*-------------------------REMOVING ELEMENTS-----------------------------*/
        
        hm.remove(4);
        System.out.println(hm);
        
        hm.remove(7,"Marshal");
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
       
        TreeMap<Integer,Book> books_hm = new TreeMap<Integer,Book>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar");    
        Book b2=new Book(102,"Data Communications & Networking","Forouzan");    
        Book b3=new Book(103,"Operating System","Galvin");
        
        books_hm.put(3, b1);
        books_hm.put(1, b2);
        books_hm.put(2, b3);
        
        System.out.println(books_hm);
        System.out.println(books_hm.entrySet()); 
        for(Map.Entry<Integer,Book> m : books_hm.entrySet()){
            int key = m.getKey();
            Book b = m.getValue();
            System.out.println(key+" "+b.id+" "+b.name+" / "+b.author);
        }
      
    }
}
