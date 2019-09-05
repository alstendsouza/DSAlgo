/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysnStrings;

/**
 *
 * @author alsten
 */
public class backupcode {
    
}
//        String str = "alsten";
//        str = str.toLowerCase();
//        
//        boolean charArr[] = new boolean[128];
//        for(int i = 0 ; i < str.length(); i++){
//            int j = str.charAt(i);
//            if(charArr[j]){
//                return ;
//            }
//            charArr[j] = true;
//        }
//
//        char[] charArray = str.toCharArray();
//        Arrays.sort(charArray);
//        str = new String(charArray);
//        System.out.println("The String is:  "+ str );
//
//        boolean unique = true;
//        outerloop:
//        for(int i = 0 ; i < str.length()-1; i++){
//            for(int j = i+1; j < str.length(); j++){
//                if(str.charAt(i) == str.charAt(j)){
//                    unique = false;
//                    break outerloop;
//                }
//            }
//        }
//        if(unique){
//            System.out.println("The String "+ str + " is unique");
//        }else{
//            System.out.println("The String "+ str + " is NOT unique");
//        }

//class Avengers{
//    private String name;
//    private int power;
//    
//    public Avengers(String n, int p){
//        name = n;
//        power = p;
//    }
//    
//    public void displayAvenger(){
//        System.out.println("Avenger name :"+this.name +" and Power : "+this.power);
//    }
//}
//
//class MyArrayList{
//    private Object[] objArray;
//    private int actualSize;
//    
//    public MyArrayList(){
//        objArray = new Object[3];
//        actualSize = 0;
//    }
//    
//    public void add(Object o){
//        if(objArray.length - actualSize <= 5){
//            increaseArrayLength();
//        }
//        objArray[actualSize++] = o;
//    }
//    
//    private void increaseArrayLength(){
//        objArray = Arrays.copyOf(objArray, objArray.length*2);
//    }
//    
//    public Object remove(int index){
//        if(index < actualSize){
//            Object obj =  objArray[index];
//            objArray[index] = null;
//            int temp = index;
//            for(int i = temp ; i < actualSize; i++){
//                objArray[i] = objArray[i+1];
//                objArray[i+1] = null;
//            }
//            actualSize--;
//            return obj;
//        }else{
//            throw new ArrayIndexOutOfBoundsException();
//        }
//    }
//    
//    public Object get(int index){
//        if(index < actualSize){
//            return objArray[index];
//        }else{
//            throw new ArrayIndexOutOfBoundsException();            
//        }
//    }
//    
//    public int size(){
//        return actualSize;
//    }
//    
//}
//       String avenger = "avenger";
//        System.out.println(avenger);
//        char[] charArray = new char[]{'a','v','e','n','g','e','r'};
//        String avenger_obj = new String(charArray);
//                System.out.println(avenger_obj);
//
//                System.out.println();
//
//        
//           MyArrayList avengers = new MyArrayList();
//           avengers.add(new Avengers("Iron Man",80));
//           avengers.add(new Avengers("Thor",95));
//           avengers.add(new Avengers("Captain America",80));
//           avengers.add(new Avengers("Spider Man",50));
//           avengers.add(new Avengers("Black Widow",65));
//           avengers.add(new Avengers("Hawk Eye",30));
//           avengers.add(new Avengers("Hulk",75));
//
//           for(int i=0; i < avengers.size(); i++){
//            Avengers avn = (Avengers)avengers.get(i);
//            avn.displayAvenger();
//           }
//           
//           avengers.remove(4);
//           System.out.println();
//            for(int i=0; i < avengers.size(); i++){
//            Avengers avn = (Avengers)avengers.get(i);
//            avn.displayAvenger();
//           }

//        
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello");
////        sb.append("Java");
////        System.out.println(sb);
////        sb.insert(1, "World");
////                System.out.println(sb);
////                sb.replace(1, 6, "Wancy");
////                System.out.println(sb);
////                sb.delete(1, 6);
////                                System.out.println(sb);
////sb.reverse();
//
//                                        System.out.println(sb.capacity());


//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Wancy");
//        list.add("Pamela");
//        list.add("Alsten");
//        list.add("Sharon");
//        list.add(1,"Alsten");
//        System.out.println(list);
        
//        
//        
//        System.out.println("Regular for loop");
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println("---------------------------");
//        
//        System.out.println("Enhanced for loop");
//        for(String names:list){
//            System.out.println(names);
//        }
//        System.out.println("---------------------------");
//        
//        System.out.println("Using the Iterator interface");
//
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//                    System.out.println(itr.next());
//
//        }
//        System.out.println("---------------------------");
//        
//        System.out.println("Using the ListIterator interface from back");
//
//        ListIterator<String> iterator = list.listIterator(list.size());
//        while(iterator.hasPrevious()){
//            System.out.println(iterator.previous());
//        }
//        System.out.println("---------------------------");
//        System.out.println("Using the ListIterator interface from front");
//        System.out.println("---------------------------");
//
//        ListIterator<String> itr1 = list.listIterator(2);
//        while(itr1.hasNext()){
//            System.out.println(itr1.next());
//        }
//        System.out.println("Using the ListIterator interface");
//        System.out.println("---------------------------");
//        System.out.println("Using the foreach ");
//        list.forEach(a->{
//                    System.out.println(a);
//
//        });
//
//    private boolean isPerm(String a, String b){
//        
//        if(a.length() != b.length()){
//            return false;
//        }
//        
//        HashMap <Character,Integer>  map = new HashMap<Character,Integer>();
//        
//        for(int i = 0 ;i< a.length(); i++){
//            char c = a.charAt(i);
//            if(map.containsKey(c)){
//                Integer freq = map.get(c);
//                map.put(c, ++freq);
//            }else{
//                map.put(c, 1);
//            }
//        } 
//        System.out.println(map);
//        for(int i = 0; i <b.length(); i++){
//            char c = b.charAt(i);
//            if(!map.containsKey(c)){
//                return false;
//            }
//            Integer freq = map.get(c);
//            if(freq <= 0 ){
//                return false;
//            }
//            map.put(c, --freq);
//            
//        }
//        System.out.println(map);
//        return true;
//    }
    
//    private String urlify(String s, int length){
//        int truelength = length;
//        int spaceCount = 0;
//        char charArr[] = s.toCharArray();
//        for(int  i = 0; i < truelength; i++){
//            if(charArr[i]== ' '){
//                spaceCount++;
//            }
//        }
//        
//        int index = truelength + (spaceCount * 2);
//        
//        for(int i = truelength-1; i >=0; i--){
//            if(charArr[i] == ' '){
//                charArr[index-1] =  '0';
//                charArr[index-2] =  '2';
//                charArr[index-3] =  '%';
//                index = index-3;               
//            }else{
//                charArr[index-1] = charArr[i];
//                index--;
//            }
//        }
//        return new String(charArr);
//        
//    }
//private boolean isPermPalin(String s){
//        HashMap <Character, Integer> map = new HashMap<Character, Integer>();
//        int countOdd = 0;
//        for(int i=0; i <s.length(); i++){
//            char c = s.charAt(i);
//            if(map.containsKey(c)){
//                Integer freq = map.get(c);
//                map.put(c,++freq);
//            }else{
//                map.put(c, 1);
//            }
//            Integer freq = map.get(c);
//            if(freq%2 == 1){
//                countOdd++;
//            }else{
//                countOdd--;
//            }        
//        }
//        System.out.println(map);
//        return countOdd <= 1;
//    }
