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
//class LinkedList{
//    private Link first;
//    private Link last;
//    
//    public LinkedList(){
//        first = null;
//        last = null;
//    }
//    
//    public boolean isEmpty(){
//        return (first == null);
//    }
//    
//    public void insertLast(long l){
//        Link newLink = new Link(l);
//        if(isEmpty()){
//            first = newLink;
//        }else{
//            last.next = newLink;
//        }
//        last = newLink;
//             
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
//    public void displayLinkedList(){
//        Link current = first;
//        while(current != null){
//            current.displayLink();
//            current = current.next;
//        }
//        System.out.println("");
//    }
//}
//
//class LinkedQueue{
//    private LinkedList lq;
//    
//    public LinkedQueue(){
//        lq = new LinkedList();
//    }
//    
//    public void push(long l){
//        lq.insertLast(l);
//    }
//    
//    public long pop(){
//        return lq.deleteFirst();
//    }
//    
//    public boolean isEmpty(){
//        return lq.isEmpty();
//    }
//    
//    public void displayQueue(){
//        System.out.print("first=>last ");
//        lq.displayLinkedList();
//    }
//}
//
//public class LinkQueueApp {
//    public static void main(String[] args){
//        LinkedQueue lqu = new LinkedQueue();
//        
//        lqu.push(10);
//        lqu.push(20);
//        lqu.push(30);
//        lqu.push(40);
//        lqu.push(50);
//        
//        lqu.displayQueue();
//        
//        lqu.pop();
//        lqu.pop();
//        
//        lqu.displayQueue();
//
//        
//    }
//}
