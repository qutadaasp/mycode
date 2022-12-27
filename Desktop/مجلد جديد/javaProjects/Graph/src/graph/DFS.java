/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.*;

public class DFS {

    private int V;   // No. of vertices 

    private LinkedList<Integer> adj[];

    DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {

        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {

        boolean visited[] = new boolean[V];

        DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        DFS g = new DFS(8);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 5);
        g.addEdge(3, 3);
        g.addEdge(4, 3);
        g.addEdge(6, 32);
        g.addEdge(5, 4);
        System.out.println("Following is Depth First Traversal and starting from vertex 1");

        g.DFS(1);
    }
}
