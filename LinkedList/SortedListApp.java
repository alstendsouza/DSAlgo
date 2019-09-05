///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package LinkedList;
//
///**
// *
// * @author alsten
// */
//
//class Link{
//    public long dData;
//    public Link next;
//    
//    public Link(long l){
//        dData = l;
//    }
//    
//    public void displayLink(){
//        System.out.print(dData+" ");
//    }
//}
//
//class SortedList{
//
//    private Link first;
//    
//    public SortedList(){
//        first = null;
//    }
//    
//    public boolean isEmpty(){
//        return first == null;
//    }
//    
//    public long remove(){
//        long temp = first.dData;
//        first = first.next;
//        return temp;
//    }
//    
//    public void insert(long key){
//        
//        Link newLink = new Link(key);
//        Link current = first;
//        Link previous = null;
//        
//        while(current != null && key > current.dData){
//            previous = current;
//            current = current.next;
//        }
//        if(previous == null){
//            first = newLink;
//        }else{
//            previous.next = newLink;
//        }
//        newLink.next = current;
//    }
//    
//    public void displayLinkedList(){
//        Link current = first;
//        System.out.print("first => link : ");
//        while(current != null){
//            current.displayLink();
//            current = current.next;
//        }
//        System.out.println("");
//    }
//}
//
//public class SortedListApp {
//    public static void main(String[] args){
//        
//        SortedList sl = new SortedList();
//        sl.insert(10);
//        sl.insert(20);
//        sl.displayLinkedList();
//        sl.insert(40);
//        sl.insert(50);
//        sl.insert(30);
//        sl.displayLinkedList();
//        sl.remove();
//        sl.displayLinkedList();
//    }
//    
//}
