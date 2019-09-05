////*
//// * To change this license header, choose License Headers in Project Properties.
//// * To change this template file, choose Tools | Templates
//// * and open the template in the editor.
//// */
//package LinkedList;
////
/////**
//// *
//// * @author alsten
//// */
////
//
//class Link{
//    private int dData;
//    public Link next;
//            
//    public Link(int d){
//        dData = d;
//    }
//    
//    public int getData(){
//        return dData;
//    }
//}
//
//class SortedList{
//    private Link first;
//    
//    public SortedList(){
//        first = null;
//    }
//    
//    public SortedList(Link[] linkArr){
//        first = null;
//        for(int i = 0 ; i < linkArr.length; i++){
//            insert(linkArr[i]);
//        }
//    }
//    
//    public void insert(Link k){
//        Link current = first;
//        Link previous = null;
//        
//        while(current != null && k.getData() > current.getData()){
//            previous = current;
//            current = current.next;
//        }
//        
//        if(previous == null){
//            first = k;
//        }else{
//            previous.next = k;
//        }
//        k.next = current;
//
//    }
//    
//    public Link remove(){
//        Link temp = first;
//        first = first.next;
//        return temp;
//    }
//}
//
//public class SortedInsertionLinkApp {
//    
//    public static void main(String[] args){
//        
//        int size = 10;
//        Link[] linkArray = new Link[size]; // create the array of Links
//        
//        // for each position in array create a link and add it to that position
//        for(int j = 0 ; j < linkArray.length; j++){
//            int n = (int)(java.lang.Math.random()*99); // get random number for the link 
//            linkArray[j] = new Link(n); // create actual link object and add to array position
//        }
//     
//        //unsorted array display
//        System.out.print("Unsorted : ");
//        for(int j = 0 ; j < linkArray.length; j++){
//           System.out.print(linkArray[j].getData()+" ");
//        }
//        
//        //now copy the array elements into a link list
//        SortedList s = new SortedList(linkArray);
//        for(int j = 0 ; j < linkArray.length; j++){
//           linkArray[j] = s.remove();
//        }
//        System.out.println();
//
//        System.out.print("Sorted : ");
//        for(int j = 0 ; j < linkArray.length; j++){
//           System.out.print(linkArray[j].getData()+" ");
//        }
//    }
//    
//}
