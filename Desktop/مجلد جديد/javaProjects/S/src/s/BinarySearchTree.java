/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s;

import java.util.*;

/**
 *
 * @author قتادة
 */
public class BinarySearchTree {

    static Node root;

    public BinarySearchTree() {
        root = null;
    }

    void add(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            while (true) {
                Node curr = root;
                if (data < curr.data) {
                    if (curr.left == null) {
                        curr.left = new Node(data);
                        break;
                    } else {
                        curr = curr.left;
                    }
                } else {
                    if (curr.right == null) {
                        curr.right = new Node(data);
                        break;
                    } else {
                        curr = curr.right;
                    }
                }
            }
        }
    }

    static void inOrder() {
        inorder(root);
    }

    private static void inorder(Node cur) {
        if (cur != null) {
            inorder(cur.left);
            System.out.println(cur.data);
            inorder(cur.right);
        }
    }

    static void preOrder() {
        preorder(root);
    }

    private static void preorder(Node cur) {
        if (cur != null) {
            System.out.println(cur.data);
            inorder(cur.left);
            inorder(cur.right);
        }
    }

    static void postOrder() {
        postorder(root);
    }

    private static void postorder(Node curr) {
        if (curr != null) {
            postorder(curr.left);
            postorder(curr.right);
            System.out.println(curr.data);
        }
    }

    void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node curr, int data) {
        if (curr == null) {
            curr = new Node(data);
        } else if (data < curr.data) {
            curr.left = insert(curr.left, data);
        } else {
            curr.right = insert(curr.right, data);
        }
        return curr;
    }

    public boolean doSearch(Node curr, int data) {
        if (curr == null) {
            return false;
        } else if (data < curr.data) {
            return doSearch(curr.left, data);
        } else if (data > curr.data) {
            return doSearch(curr.right, data);
        } else {
            return true;
        }

    }
//         void delete(int data){
//             System.out.println(delete(root,data));
//         }
//         private Node delete(Node curr,int data){
//             if(curr==null){
//                 return null;
//             }
//             else if(data<curr.data){
//                curr.left=delete(curr.left,data);
//             }
//             else if(data>curr.data){
//                 curr.right=delete(curr.right,data);
//             }
//             else if(curr.right==null){
//                 return curr.left;
//             }
//             else if(curr.left==null){
//                 return curr.right;
//             }
//             else {
//                 curr.data=minValue(curr.right);
//                 curr.right=delete(curr.right, data);
//             }
//             return curr;
//         }
//          private int minValue(Node node) {
// 
//        if(node.left != null) {
//            return minValue(node.left);
//        }
//        return node.data;
//    }

    void delete(int data) {
        System.out.println(delete(root, data));
    }

    private Node delete(Node curr, int data) {
        if (curr == null) {
            return null;
        } else if (data < curr.data) {
            curr.left = delete(curr.left, data);
        } else if (data > curr.data) {
            curr.right = delete(curr.right, data);
        } else if (curr.left == null) {
            return curr.right;
        } else if (curr.right == null) {
            return curr.left;
        } else {
            curr.data = min(curr.right);//نحن نبحث عن الأصغر من اليمين
            curr.right = delete(curr.right, data);
        }
        return curr;
    }

    private int min(Node curr) {
        if (curr.left != null) {//الصغير دائما في اليسار
            return min(curr.left);
        }
        return curr.data;
    }
    
    void BFS(){
        Queue<Node> nodes=new LinkedList<>();
        if(root==null){
            return;
        }
        while(!nodes.isEmpty()){
            Node node=nodes.remove();
            System.out.print(" "+node.data);
            if(node.left!=null){
                nodes.add(node.left);
            }
            if(node.right!=null){
                nodes.add(node.right);
            }
        }
    }
    public static void main(String[] asdf) {
        BinarySearchTree a = new BinarySearchTree();
//        a.add(42);
//        a.add(3);
//        a.add(55);
//        inOrder();
//        System.out.println("////////");
//        preOrder();
//        System.out.println("*******");
//        postOrder();
//        System.out.println("-------");
//        a.insert(5);
//        a.insert(0);
//        inOrder();
        int[] as = {2, 3, 4, 5, 56, 11};
        for (int i = 0; i < as.length; i++) {
            a.insert(as[i]);
        }
//        inOrder();
//        System.out.println(a.doSearch(root, 11));

    }
}
