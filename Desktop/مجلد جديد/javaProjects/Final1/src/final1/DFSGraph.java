/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

import java.util.*;

public class DFSGraph {

    private int V;   // No. of vertices 
    private boolean[] visited;
    private LinkedList<Integer> adj[];

    DFSGraph(int v) {
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
        Stack<Integer> st = new Stack<>();
        st.push(v);
        while (!st.isEmpty()) {
            v = st.pop();
            System.out.print(v + " ");
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }
    }

    void DFS(int v) {
        visited = new boolean[V];
        DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        System.out.println("Following is Depth First Traversal and starting from vertex 2");
        g.DFS(2);
//        System.out.println(g.isConnected(0));
    }

    boolean isConnected(int s) {
        DFS(s);
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) {
                return false;
            }
        }
        return true;
    }
}
