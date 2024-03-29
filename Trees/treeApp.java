/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;
import java.io.*;
import java.util.*;

/**
 *
 * @author alsten
 */

class Node {

    public int iData;
    public double dData;
    public Node leftChild;
    public Node rightChild;
    
    public void displayNode(){
        System.out.print("{");
        System.out.print(iData);
        System.out.print(", "+dData);
        System.out.print("} ");        
    }
}

class Tree{
    
    private Node root;
    
    public Tree(){
        root = null;
    }
    
    public Node find(int key){      
        Node current = root;
        while(current.iData != key){
            if(key < current.iData){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }
            
            if(current == null){
                return null;
            }
        }
        return current;
    }
    
    public void insert(int id, double dd){
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;
        
        if(root == null){
            root = newNode;
        }else{
            Node current = root;
            Node parent;
            
            while(true){
                parent = current;
                
                if(id < current.iData){
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean delete(int key){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        
        
        //first search for the element (with parent tracking)
        while(current.iData != key){
            parent = current;
            if(key < current.iData){
                isLeftChild = true;
                current = current.leftChild;
            }else{
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null){
                return false;
            }
        }
        
        //found the node to be deleted
        
        //case 1 where current (not to be deleted) has no children
        if(current.leftChild == null && current.rightChild == null){
            if(current == root){
                root = null; //root case
            }else if(isLeftChild){
                parent.leftChild = null;
            }else{
                parent.rightChild = null;
            }
        }
        
        // current (delete node) has one child 
        
        else if(current.rightChild == null){                // right child is empty
            if(current == root){
                root = current.leftChild; // root case
            }else if(isLeftChild){
                parent.leftChild = current.leftChild;
            }else{
                parent.rightChild = current.leftChild;
            }
        }
        
        else if(current.leftChild == null){                 //left child is empty
            if(current == root){
                root = current.rightChild;
            }else if(isLeftChild){
                parent.leftChild = current.rightChild;
            }else{
                parent.rightChild = current.rightChild;
            }
        }
        
        // case where current has 2 children (find successor)
        else{
            Node successor = getSuccessor(current);
            
            if(current == root){
                root = successor;
            }else if(isLeftChild){
                parent.leftChild = successor;
            }else{
                parent.rightChild = successor;
            }
            
            successor.leftChild = current.leftChild;
        }
        return true;
    }
    
    private Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        
        while(current != null){
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        
        if(successor != delNode.rightChild){
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
        
    }
    
    public void traverse(int traverseCode){
        switch(traverseCode){
            case 1: System.out.print("\n InOrder traversal :");
                    inOrder(root);
                    break;
                    
            case 2: System.out.print("\n PreOrder traversal");
                    preOrder(root);
                    break;
            
            case 3: System.out.print("\n PostOrder traversal");
                    postOrder(root);
                    break;
        }
        System.out.println();
    }
    
    private void inOrder(Node localRoot){
        if(localRoot != null){
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData+ " ");
            inOrder(localRoot.rightChild);
        }
    }
    
    private void preOrder(Node localRoot){
        if(localRoot != null){
            System.out.print(localRoot.iData+" ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);          
        }
    }
    
    private void postOrder(Node localRoot){
        if(localRoot != null){
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData+" ");            
        }
    }
}

public class treeApp {
    public static void main(String[] args) throws IOException{
        
    }
    
}
