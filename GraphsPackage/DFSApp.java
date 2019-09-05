///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package GraphsPackage;
//
///**
// *
// * @author alsten
// */
//
//class StackX{
//    private final int maxSize = 20;
//    private int top;
//    private int[] st;
//    
//    public StackX(){
//        st = new int[maxSize];
//        top = -1;
//    }
//    
//    public void push(int i){
//        st[++top] = i;
//    }
//    
//    public int pop(){
//        return st[top--];
//    }
//    
//    public int peek(){
//        return st[top];
//    }
//    
//    public boolean isEmpty(){
//        return top == -1;
//    }
//}
//
//class Vertex{
//    public char label;
//    public boolean isVisited;
//    
//    public Vertex(char lab){
//        label = lab;
//        isVisited = false;
//    }
//    
//}
//
//class Graph{
//    private int MAXVERTICES = 20;
//    private Vertex[] verticesList;
//    private int adjMat[][];
//    private int nVerts;
//    private StackX s;
//    
//    public Graph(){
//        verticesList = new Vertex[MAXVERTICES];
//        adjMat = new int[MAXVERTICES][MAXVERTICES];
//        nVerts = 0;
//        for(int j = 0; j < MAXVERTICES; j++){
//            for(int k=0; k < MAXVERTICES; k++){
//                adjMat[j][k] = 0;
//            }
//        }
//        s = new StackX();
//    }
//    
//    public void addVertex(char c){
//        verticesList[nVerts++] = new Vertex(c);
//    }
//    
//    public void addEdge(int start, int end){
//        adjMat[start][end] = 1;
//        adjMat[end][start] = 1;
//    }
//    
//    public void displayVertex(int v){
//        System.out.print(verticesList[v].label);
//    }
//    
//    public void dfs(){
//        verticesList[0].isVisited = true;
//        displayVertex(0);
//        s.push(0);
//        
//        while(!s.isEmpty()){
//            int v = getAdjacentUnvisitedVertex(s.peek());
//            if(v == -1){
//                s.pop();
//            }else{
//                verticesList[v].isVisited = true;
//                displayVertex(v);
//                s.push(v);
//        
//            }
//        }
//        
//        for(int j = 0; j < nVerts; j++){
//            verticesList[j].isVisited = false;
//        }
//        
//    }
//    
//    public int getAdjacentUnvisitedVertex(int v){
//        for(int j = 0; j < nVerts; j++){
//            if(adjMat[v][j] == 1 && verticesList[j].isVisited == false){
//                return j;
//            }
//        }
//        return -1;
//    }
//}
//
//public class DFSApp {
//    public static void main(String args[]){
//        Graph g = new Graph();
//        g.addVertex('A');
//        g.addVertex('B');
//        g.addVertex('C');
//        g.addVertex('D');
//        g.addVertex('E');
//        
//        g.addEdge(0,1);
//        g.addEdge(1,2);
//        g.addEdge(0,3);
//        g.addEdge(3,4);
//        
//        System.out.print("The Visits  : ");
//        g.dfs();
//        System.out.println();
//        
//    }
//}
