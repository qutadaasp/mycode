package tree;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class BST {

    static int sum;
    static Queue<Node> s1;
    static Node root;
    static ArrayList<Integer> s;
    static int[] arr;

    public BST() {
        root = null;
    }

    void add(int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = add(root.left, data);
        } else {
            root.right = add(root.right, data);
        }

    }

    void BFS() {
        s1 = new LinkedList<>();
        if (root == null) {
            return;
        }
        s1.add(root);
        while (!s1.isEmpty()) {
            Node n = s1.remove();
            System.out.print(" " + n.data);
            if (n.left != null) {
                s1.add(n.left);
            }
            if (n.right != null) {
                s1.add(n.right);
            }
        }
    }

    public static void main(String[] sadqaf) {
        BST a = new BST();
        a.insert(4);
        a.insert(3);
        a.insert(0);
        a.insert(2);
        a.insert(22);
//        a.inorder();
//        System.out.println("////////////////");
//        a.preorder();
//        System.out.println("///////////////");
//        a.postorder();
//        a.BFS();
        System.out.println(a.sumOfleavs(root));
    }

    private Node add(Node curr, int data) {
        if (curr == null) {
            curr = new Node(data);
        } else if (data < curr.data) {
            add(curr.left, data);
        } else {
            add(curr.right, data);
        }
        return curr;
    }

    void inorder() {
        inorder(root);
    }

    private void inorder(Node curr) {
        if (curr != null) {
            inorder(curr.left);
            System.out.println(curr.data);
            inorder(curr.right);
        }
    }

    void preorder() {
        preorder(root);
    }

    private void preorder(Node curr) {
        if (curr != null) {
            System.out.println(curr.data);
            inorder(curr.left);
            inorder(curr.right);
        }
    }

    void postorder() {
        postorder(root);
    }

    private void postorder(Node curr) {
        if (curr != null) {
            inorder(curr.left);
            inorder(curr.right);
            System.out.println(curr.data);
        }

    }

    public void insert(int data) {
        root = insertrec(root, data);
    }

    private Node insertrec(Node curr, int data) {
        if (curr == null) {
            curr = new Node(data);
        } else if (data < curr.data) {
            curr.left = insertrec(curr.left, data);
        } else {
            curr.right = insertrec(curr.right, data);
        }
        return curr;
    }

    boolean doSearch(int data) {
        return doSearchrec(root, data);
    }

    private boolean doSearchrec(Node curr, int data) {
        if (curr.data == data) {
            return true;
        } else if (data < curr.data) {
            return doSearchrec(curr.left, data);
        } else {
            return doSearchrec(curr.right, data);
        }
    }

    void delete(int data) {
        deleterec(root, data);
    }

    private Node deleterec(Node curr, int data) {
        if (curr == null) {
            return null;
        } else if (data < curr.data) {
            curr.left = deleterec(curr.left, data);
        } else if (data > curr.data) {
            curr.right = deleterec(curr.left, data);
        } else if (curr.left == null) {
            return curr.right;
        } else if (curr.right == null) {
            return curr.left;
        } else {
            curr.data = min(curr.right);
        }
        return curr;
    }

    private int min(Node curr) {
        if (curr.right != null) {
            return min(curr.right);
        }
        return curr.data;
    }

    void LCA(int a, int b) {
        s = new ArrayList<>();
        if (root == null) {
            return;
        } else {
            s.add(root.data);
            LCArec(root);
        }
    }

    private void LCArec(Node curr) {
        if (curr.left != null) {
            s.add(curr.left.data);
        }
        if (curr.right != null) {
            s.add(curr.right.data);
        }
        LCArec(curr.left);
        LCArec(curr.right);
    }

    static int MaxDepth(Node curr) {
        if (curr == null) {
            return 0;
        } else {
            int ldepth = MaxDepth(curr.left);
            int rdepth = MaxDepth(curr.right);
            if (ldepth > rdepth) {
                return ldepth + 1;
            } else {
                return rdepth + 1;
            }
        }
    }

    void toArray(Node curr) {

        try {
            int dep = (int) pow(2, MaxDepth(curr) + 1);
            arr = new int[dep];
            print(curr, 0);
        } catch (Exception e) {

        }

    }

    private void print(Node curr, int c) {
        try {
            arr[(2 * c) + 1] = curr.left.data;
            arr[(2 * c) + 2] = curr.right.data;
            c++;
            print(curr.left, c);
            print(curr.right, c);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, c);
        }
    }

    public int sumOfleavs(Node curr) {
        sum = 0;
        if (curr != null) {
            if (curr.left == null && curr.right == null) {
                sum += curr.data;
            } else {
                sum += sumOfleavs(curr.left);
                sum += sumOfleavs(curr.right);
            }
        }
        return sum;
    }
}
