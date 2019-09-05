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
//
//class Link {
//
//    public long dData;
//    public Link next;
//
//    public Link(long d) {
//        dData = d;
//    }
//
//    public void displayLink() {
//        System.out.print(dData + " ");
//    }
//}
//
//class FirstLastLink{
//    Link first;
//    Link last;
//    public FirstLastLink(){
//        first = null;
//        last = null;
//    }
//    
//    public boolean isEmpty(){
//        return first == null;
//    }
//    
//    public void insertFirst(long l){
//        Link newLink = new Link(l);
//        if(isEmpty()){
//            last = newLink;
//        }
//        newLink.next = first;
//        first = newLink;
//    }
//
//    public void insertLast(long l) {
//        Link newLink = new Link(l);
//        if (isEmpty()) {
//            first = null;
//        } else {
//            last.next = newLink;
//        }
//        last = newLink;
//    }
//    
//    public long deleteFirst(){
//        long temp = first.dData;
//        if(first.next == null){
//            last = null;
//        }
//        first = first.next;
//        return temp;
//    }
//    
//    public void displayLinkList(){
//        System.out.println("Link List: first -> last");
//        Link current = first;
//        while(current != null){
//            current.displayLink();
//            current = current.next;
//        }
//    }
//
//}
//
//public class DoubleLinkListApp {
//
//    public static void main(String[] args) {
//        
//        FirstLastLink fl = new FirstLastLink();
//        fl.insertFirst(22);
//        fl.insertFirst(33);
//        fl.insertFirst(66);
//        fl.insertLast(11);
//        fl.insertLast(44);
//        fl.insertLast(77);
//        
//        fl.displayLinkList();
//        
//        fl.deleteFirst();
//        fl.deleteFirst();
//        
//        fl.displayLinkList();
//
//
//    }
//
//}
