/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author قتادة
 */
import java.util.*;

public class topological {

    private int v;
    private LinkedList<Integer> adj[];

    public topological(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void topologicalSortUtil(int v, boolean visited[], Stack stack) {
        visited[v] = true;
        Integer i;

        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        stack.push(new Integer(v));
    }

    void topologicalSort() {
        Stack stack = new Stack();

        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        while (stack.empty() == false) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        topological g = new topological(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological ");
        g.topologicalSort();
    }

}
