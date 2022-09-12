package Algorithms;

import java.awt.*;
import java.util.LinkedList;

public class Graph {
    int vertices;
    LinkedList<Integer> adjList[];
    public Graph(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices;i ++){
            adjList[i] = new LinkedList<>();

        }
    }
    void addEdge(int source,int destination){
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    void displayGraph(){
        for(int i = 0; i < vertices; i ++){
            if (adjList[i].size() >0){
                System.out.println("Vertex "+ i + "is connected to : -");
                for (int j =0; j < adjList[i].size(); j ++){
                    System.out.println(adjList[i].get(j) + " ");
                }

                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Graph g = new Graph(3);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,0);


        g.displayGraph();
    }
}
