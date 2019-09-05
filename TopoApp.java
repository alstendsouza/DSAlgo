/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alsten
 */
class Vertex{
    public char label;
    
    public Vertex(char lab){
        label = lab;
    }
}

class Graph{
    private final int MAXVERTS = 20;
    private Vertex[] verticesList;
    private int[][] adjMat;
    private int nVerts;
    private char[] sortedArray;
    
    public Graph(){
        verticesList = new Vertex[MAXVERTS];
        adjMat = new int[MAXVERTS][MAXVERTS];
        nVerts = 0;
        for(int j = 0; j < MAXVERTS; j++){
            for(int k = 0; k < MAXVERTS; k++){
                adjMat[j][k] = 0;
            }
        }
        sortedArray = new char[MAXVERTS];
    }
    
    public void addVertex(char c){
        verticesList[nVerts++] = new Vertex(c);
    }
    
    public void addEdge(int start, int end){
        adjMat[start][end] = 1;
    }
    
    public void displayLabel(int i){
        System.out.print(verticesList[i].label);
    }
    
    public void topo(){
        int orig_vert = nVerts;
        
        while(nVerts > 0){
            // check for vertex with no successor
            int currentVertex = noSuccessor();
            //if no such vertex return error 
            if(currentVertex == -1){
                System.out.print("Cycles present: ERROR");
                return;
            }
            //else
            else{
                //add the vertex label to sortedArray from behind nVerts-1
                sortedArray[nVerts-1] = verticesList[currentVertex].label;
                
                //delete the vertex
                deleteVertex(currentVertex);

            }
                        
        }
        
        //from 0 to orig_vertices print the sortedArray in asc order
        System.out.println("TOPLOGICALLY SORTED ORDER: ");
        for(int j = 0; j <orig_vert; j++){
                System.out.print(sortedArray[j]+" ");
        }
    }
    
    public int noSuccessor() {
        boolean isEdge;
        for (int row = 0; row < nVerts; row++) {
            isEdge = false;
            for (int col = 0; col < nVerts; col++) {
                if (adjMat[row][col] > 0) {
                    isEdge = true;
                    break;
                }
            }
            if (!isEdge) {
                return row;
            }
        }
        return -1;
    }
    
    public void deleteVertex(int delVert){
        if(delVert != nVerts - 1){
            // delete from verticesList and move elements left
            for(int i = delVert ; i < nVerts - 1; i ++){
                verticesList[i] = verticesList[i+1];
            }
            //delete from adj mat move row up
            for(int row = delVert; row < nVerts - 1;row++){
                moveUpRow(row,nVerts);
            }
            //delete from adj mat move col left
            for(int col = delVert; col < nVerts - 1;col++){
                moveLeftCol(col,nVerts-1);
            }            
        }
        nVerts--;
    }
    
    public void moveUpRow(int row,int length){
            for(int col = 0 ; col < length; col ++){
                adjMat[row][col] = adjMat[row+1][col];
            }        
    }
    
    public void moveLeftCol(int col,int length){
            for(int row = 0 ; row < length; row ++){
                adjMat[row][col] = adjMat[row][col+1];
            }        
    }    
}


public class TopoApp {
    public static void main(String args[]){
        Graph theGraph = new Graph();
        
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');        
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addVertex('F');
        theGraph.addVertex('G');
        theGraph.addVertex('H');  
        
        theGraph.addEdge(0,3);
        theGraph.addEdge(0,4);    
        theGraph.addEdge(1,4);    
        theGraph.addEdge(2,5);    
        theGraph.addEdge(3,6);    
        theGraph.addEdge(4,6);    
        theGraph.addEdge(5,7);    
        theGraph.addEdge(6,7);    
        
        theGraph.topo();

    }
    
}
