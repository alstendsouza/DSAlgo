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
//    public int iData;
//    public double dData;
//    public Link next;
//    
//    public Link(int i, double d){
//        iData = i;
//        dData = d;
//    }
//    
//    public void displayLink(){
//        System.out.print("{"+iData+", "+dData+" }");
//    }
//}
//
//class LinkList{
//    private Link first;
//    public LinkList(){
//        first = null;
//    }
//    
//    public void insertFirst(int i , double d){
//        Link newLink = new Link(i,d);
//        newLink.next = first;
//        first = newLink;
//    }
//    
//    public Link find(int key){
//        Link current = first;
//        while(current.iData != key){
//            if(current.next == null){
//                return null;
//            }else{
//                current = current.next;
//            }
//            
//        }
//        return current;
//    }
//    
//    public Link delete(int key){
//        Link current = first;
//        Link previous = first;
//        
//        while(current.iData !=key){
//            if(current.next == null){
//                return null;
//            }else{
//                previous = current;
//                current = current.next;
//            }
//        }
//        
//        if(current == first){
//            first = first.next;
//        }else{
//            previous.next = current.next;
//        }
//        return current;
//    }
//    
//    public void displayLink(){
//        System.out.print("List (first -> last) ");
//        Link current = first;
//        while(current != null){
//            current.displayLink();
//            current = current.next;
//        }
//        System.out.println();
//    }
//}
//
//public class LinkList2App {
//    
//    
//    public static void main(String[] args){
//        
//        LinkList l = new LinkList();
//        l.insertFirst(20, 40.13);
//        l.insertFirst(30, 70.99);
//        l.insertFirst(40, 10.03);
//        
//        l.displayLink();
//        
//        Link f = l.find(30);
//        if(f != null){
//            System.out.println("found "+f.iData);
//        }
//        
//        Link d = l.delete(30);
//        if(d != null){
//            System.out.println("deleting "+d.iData);
//        }
//                l.displayLink();
//
//        
//    }
//    
//}
