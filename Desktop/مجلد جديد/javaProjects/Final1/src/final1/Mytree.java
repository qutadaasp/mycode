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
import java.util.*;

public class Mytree {

    public static void BFS(Node curr) {
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(curr);
        while (!nodes.isEmpty()) {
            System.out.print(curr.data + " ");
            Node node = nodes.remove();
            if (curr.left != null) {
                nodes.add(curr.left);
            }
            if (curr.right != null) {
                nodes.add(curr.right);
            }
        }
    }

    static Node root;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mytree a = new Mytree();
        a.root = new Node(3);
        BFS(root);
    }

}
