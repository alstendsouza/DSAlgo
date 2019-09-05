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
Maps contain key value pair. Contains unique keys but can contain duplicate values
A Map is useful if you have to search, update or delete elements on the basis of a key.
2 ways to implement MAP:  Map (HashMap and LinkedHasMap) and SortedMap (TreeMap)
Map cannot be iterated therefore we have to convert to a set to iterate
Set s = map.entrySet() converts to a set
Now we can iterate over Set s by for each or iterator
to retrieve each entry we cast the set elements to Map.Entry => Map.Entry m = (Map.Entry)i.next();
now m.getKey() gets the key and m.getValue() gets value
add - put, putIfAbsent, putAll, remove(key), remove(k,v)
*/
public class Maps_App {
    public static void main(String[] args){
        
        Map map1 = new HashMap(); // old way
        map1.put(1,"Wancy");
        map1.put(3,"Alsten");
        map1.put(4, "Sharon");
        map1.put(2,"Pamela");
        
        map1.putIfAbsent(5, "Derrick"); // put if absent
        
        System.out.println(map1);
        
        Set s = map1.entrySet(); // converts map to a set coz maps are not iterable MAP => SET
        System.out.println(s);
        
        Iterator i = s.iterator();
        while(i.hasNext()){
            Map.Entry m = (Map.Entry)i.next(); // need to convert i.next() to Map.Entry
            System.out.println(m.getKey()+" "+m.getValue()); // getKey() And getValue() to retrieve key and value respectively
        }
        
        map1.remove(4);
        System.out.println(map1);
        
        Map<Integer,String> map2 = new HashMap<Integer,String>(); // new way of creating Map
        map2.put(6,"Janet");
        map2.put(7,"Marshal");
        map2.put(8, "Shalini");
        map2.put(null,"Allan");
        System.out.println(map2);
        
        map1.putAll(map2); // put all
        System.out.println("Test "+ map1);
        
        for(Map.Entry m:map2.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue()); // foreach way of iterating
        }

        map2.remove(null, "Allan"); // remove key-value
        
        System.out.println(map2.entrySet());        
        System.out.println(map2.containsKey(2));
        System.out.println(map2.containsValue("Alsten"));
        System.out.println(map2.size());
        System.out.println(map2.isEmpty());
        System.out.println(map2.keySet());
        
    }
}
