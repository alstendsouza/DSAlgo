/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author alsten
 */

class Link{
    public long data;
    public Link next;
    public Link prev;
    
    public Link(long d){
        data = d;
        next = null;
        prev = null;
    }
    
    public void displayLink(){
        System.out.print(" "+data+" ");
    }
}

class DoublyLinkedList{
    private Link first;
    private Link last;
    
    public DoublyLinkedList(){
        first = null;
        last = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void displayListForward(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }
    
    public void insertFirst(long key){
        Link newLink = new Link(key);
        if(isEmpty()){
            last = newLink;
        }else{
            first.prev = newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    
    public void insertLast(long key){
        Link newLink = new Link(key);
        if(isEmpty()){
            first = newLink;
        }else{
            last.next = newLink;
        }
        newLink.prev = last;
        last = newLink;
    }
    
    public Link deleteFirst(){
        Link current = first;
        if(first.next == null){
            last = null;
        }else{
            first.next.prev = null;
        }
        first = first.next;
        return current;
    }
    
    public Link deletLast(){
        Link current = last;
        if(first.next == null){
            first = null;
        }else{
            last.prev.next = null;
        }
        last = last.prev;
        return last;
    }
    
    public boolean insertAfter(long key, long d){
        Link newLink = new Link(d);
        Link current = first;
        
        while(current.data != key){
            if(current == null){
                return false;
            }
            current = current.next;      
        }
        if(current.next == null){
            last = newLink;
        }else{
            current.next.prev = newLink;
        }
        newLink.next = current.next;
        
        newLink.prev = current;
        current.next = newLink;
        
        return true;
    }
    
    public Link deleteKey(long key){
        Link current = first;
        Link previous = null;
        while(current.data !=key){
            if(current == null){
                return null;
            }
            previous = current;
            current = current.next;
        }
        
        if(previous == null){
            first = current.next;
        }else{
            previous.next =  current.next;
        }
        
        if(current.next == null){
            last = previous;
        }else{
            current.next.prev = previous;
        }
       
        return current;
    }
}

public class DoublyLinkedListApp{
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);
        
        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);
        
        list.displayListForward();
        System.out.println();
      
        
        list.deleteFirst();
        list.deletLast();
        list.deleteKey(11);
        
        list.displayListForward();
        System.out.println(); 
        list.insertAfter(22, 77);
        list.insertAfter(33, 88);
        
        list.displayListForward();
    }
}