/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

import java.util.LinkedList;
import java.util.Queue;

public class Bi {

    Node root;

    public Bi() {
        root = null;
    }

    void insert(int data) {
        insert(root, data);
    }

    void add(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Node cur = root;
            while (true) {
                if (data < cur.data) {
                    if (cur.left == null) {
                        cur.left = new Node(data);
                        break;
                    } else {
                        cur = cur.left;
                    }
                } else {
                    if (cur.right == null) {
                        cur.right = new Node(data);
                        break;
                    } else {
                        cur = cur.right;
                    }
                }
            }
        }
    }

    void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node curr) {
        if (curr != null) {
            inOrder(curr.left);
            System.out.println(curr.data);
            inOrder(curr.right);
        }

    }

    void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node curr) {
        if (curr != null) {
            System.out.println(curr.data);
            preOrder(curr.left);
            preOrder(curr.right);
        }
    }

    void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node curr) {
        if (curr != null) {
            postOrder(curr.left);
            postOrder(curr.right);
            System.out.println(curr.data);
        }
    }

    boolean search(Node curr, int data) {
        if (curr == null) {
            return false;
        } else {
            if (data < curr.data) {
                return search(curr.left, data);
            }
            if (data > curr.data) {
                return search(curr.right, data);
            }
        }
        return true;
    }

    public static void main(String[] saf) {
        Bi a = new Bi();
        a.add(5);
        a.add(0);
        a.add(3);
        a.add(22);
        a.insert(23);
//        a.inOrder();
//        a.postOrder();
//        a.preOrder();
//       
        a.BFS();
        a.remove(3);
        a.inOrder();
    }

    private Node insert(Node curr, int data) {
        if (curr == null) {
            curr = new Node(data);
        } else {
            if (curr.data > data) {
                curr.left = insert(curr.left, data);
            } else {
                curr.right = insert(curr.right, data);
            }
        }
        return curr;
    }

    void BFS() {
        if (root == null) {
            return;
        }
        Queue<Node> nodes = new LinkedList<>();
        while (!nodes.isEmpty()) {
            Node node = nodes.remove();
            System.out.print(" " + node.data);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    void remove(int data) {
        remove(root, data);
    }

    private Node remove(Node curr, int data) {
        if (curr == null) {
            return null;
        } else if (data < curr.data) {
            curr.left = remove(curr.left, data);
        }
        else if(data>curr.data){
            curr.right = remove(curr.right, data);
        }
        else if(curr.right==null){
            return curr.left;
        }
        else if(curr.left==null){
            return curr.right;
        }
        else {
            curr.data=min(curr.right);
            curr.right=remove(curr.right,curr.data);
        }
        return curr;
    }
    private int min(Node curr) {
        if (curr.left != null) {//الصغير دائما في اليسار
            return min(curr.left);
        }
        return curr.data;
    }
}
