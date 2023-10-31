package Graphs_01;

import java.util.ArrayList;

public class Bridge_Tarjans_Algorithms {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(0,1));
        graph[1].add(new Edge(0,1));

        graph[2].add(new Edge(0,1));
        graph[2].add(new Edge(0,1));

        graph[3].add(new Edge(0,1));
        graph[3].add(new Edge(0,1));
        graph[3].add(new Edge(0,1));

        graph[4].add(new Edge(0,1));
        graph[4].add(new Edge(0,1));

        graph[5].add(new Edge(0,1));
        graph[5].add(new Edge(0,1));
    }
    public static void main(String[] args) {
        int V= 6;

        ArrayList<Edge> graph[]= new ArrayList[V];
        createGraph(graph);
    }
}
