/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

/**
 *
 * @author قتادة
 */
public class adjacentmatrix {

    int v;
    int[][] m;

    public adjacentmatrix(int v) {
        this.v = v;
        m = new int[v][v];
    }

    void addEdge(int v1, int v2) {
        m[v1][v2] = 1;
        m[v2][v1] = 1;
    }

    void print() {
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < v; i++) {
            System.out.print("Vertix" + i + "connected to");
            for (int j = 0; j < v; j++) {
                if (m[i][j] == 1) {
                    System.out.print(" " + j);
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        adjacentmatrix a = new adjacentmatrix(8);
        a.addEdge(0, 3);
        a.addEdge(3, 1);
        a.addEdge(2, 4);
        a.addEdge(4, 3);
        a.addEdge(0, 1);
        a.addEdge(3, 5);
        a.addEdge(2, 6);
        a.addEdge(4, 2);
        a.addEdge(7, 3);
        a.addEdge(7, 7);
        a.print();
    }
}
