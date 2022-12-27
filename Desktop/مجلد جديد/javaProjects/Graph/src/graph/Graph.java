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
public class Graph {

    static int size;
    vertix[] vlist;
    int[][] matrix;
    int vcount;

    public Graph() {
    }

    //undirected+unweighted
    void addEdgeuduw(int start, int end) {
        matrix[start][end] = 1;
        matrix[end][start] = 1;
    }

    //undirected+weighted
    void addEdgeudw(int start, int end, int cost) {
        matrix[start][end] = cost;
        matrix[end][start] = cost;
    }

    //directed+weighted
    void addEdgeuduw(int start, int end, int cost) {
        matrix[start][end] = cost;
    }
}
