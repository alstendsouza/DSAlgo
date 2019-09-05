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
////
////class Link{
////    public int iData;
////    public double dData;
////    public Link next;
////    
////    public Link(int i, double d){
////        iData = i;
////        dData = d;
////    }
////    
////    public void displayLink(){
////        System.out.print("{ "+iData+", "+dData+" }");
////    }
////}
////
////class LinkList{
////    private Link first;
////    
////    public LinkList(){
////        first = null;
////    }
////    
////    public boolean isEmpty(){
////        return first == null;
////    }
////    
////    public void insertFirst(int i, double d){
////        Link newLink = new Link(i,d);
////        newLink.next = first;
////        first = newLink;        
////    }
////    
////    public Link deleteFirst(){
////        Link temp = first;
////        first = first.next;
////        return temp;
////    }
////    
////    public void displayList(){
////        System.out.print("Linked List (first --> last)");
////        Link current = first;
////        while(current != null){
////            current.displayLink();
////            current = current.next;
////        }
////        System.out.println();
////    }
////}
//public class SimpleLinkedList {
//    
//    public static void main(String[] args){
//        LinkList ll = new LinkList();
//        ll.insertFirst(1, 1.2);
//        ll.insertFirst(3, 8.3);
//        ll.insertFirst(2, 3.0);
//        ll.insertFirst(4, 7.6);
//        
//        ll.displayList();
//        
//        while(!ll.isEmpty()){
//            Link a = ll.deleteFirst();
//            System.out.print("Deleted : ");
//            a.displayLink();
//            System.out.println();
//        }
//        
//        ll.displayList();
//    }
//    
//}
