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
//class Link {
//
//    public long dData;
//    public Link next;
//
//    public Link(long l) {
//        dData = l;
//    }
//
//    public void displayLink() {
//        System.out.print(dData + " ");
//    }
//}
//
//class LinkedList {
//
//    public Link first;
//
//    public LinkedList() {
//        first = null;
//    }
//
//    public boolean isEmpty() {
//        return first == null;
//    }
//
//    public void insertFirst(long l) {
//        Link newLink = new Link(l);
//        newLink.next = first;
//        first = newLink;
//    }
//
//    public long deleteFirst() {
//        long temp = first.dData;
//        first = first.next;
//        return temp;
//    }
//
//    public void displayLinkList() {
//        Link current = first;
//        System.out.print("first => last ");
//        while (current != null) {
//            current.displayLink();
//            current = current.next;
//        }
//        System.out.println("");
//    }
//
//}
//
//class LinkedListStack {
//
//    LinkedList ll = null;
//
//    public LinkedListStack() {
//        ll = new LinkedList();
//    }
//
//    public void push(long l) {
//        ll.insertFirst(l);
//    }
//
//    public long pop() {
//        return ll.deleteFirst();
//    }
//
//    public boolean isEmpty() {
//        return ll.isEmpty();
//    }
//
//    public void displayLinkedList() {
//        ll.displayLinkList();
//    }
//}
//
//public class LinkStackApp {
//
//    public static void main(String[] args) {
//        LinkedListStack ls = new LinkedListStack();
//        ls.push(10);
//        ls.push(20);
//        ls.push(30);
//        ls.push(40);
//        ls.push(50);
//        ls.displayLinkedList();
//
//        ls.pop();
//        ls.pop();
//        ls.pop();
//        ls.pop();
//
//System.out.println(ls.isEmpty());
//
//        ls.displayLinkedList();
//    }
//
//}
