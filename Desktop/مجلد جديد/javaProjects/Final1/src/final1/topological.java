package final1;

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

    void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }
        stack.push(v);
    }

    void topologicalSort() {
        Stack<Integer> stack = new Stack<>();

        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        while (!stack.empty()) {
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
//        0 1 2 5 4 3
        System.out.println("Following is a Topological ");
        g.topologicalSort();
    }

}
