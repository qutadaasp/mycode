package pkgfinal;

public class AVL {

    Node root;

    int height(Node n) {
        if (n == null) {
            return 0;
        }
        return n.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Node rightrotate(Node curr) {
        Node x = curr.left;
        Node y = x.right;
        x.right = curr;
        curr.left = y;
        curr.height = max(height(curr.left), height(curr.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }

    Node leftrotate(Node curr) {
        Node x = curr.right;
        Node y = x.left;
        x.left = curr;
        curr.right = y;
        x.height = max(height(x.left), height(x.right)) + 1;
        curr.height = max(height(curr.left), height(curr.right)) + 1;
        return x;
    }

    int getBalance(Node x) {
        if (x == null) {
            return 0;
        }
        return height(x.left) - height(x.right);
    }

//    Node insert(Node node, int data) {
//        if (node == null) {
//            return (new Node(data));
//        }
//        if (data < node.data) {
//            node.left = insert(node.left, data);
//        } else if (data > node.data) {
//            node.right = insert(node.right, data);
//        } else {
//            return node;
//        }
//        node.height = 1 + max(height(node.left), height(node.right));
//        int balance = getBalance(node);
//        //Left Left Case
//        if (balance > 1 && data < node.left.data) {
//            return rightrotate(node);
//        }
//        // Right Right Case 
//        if (balance < -1 && data > node.right.data) {
//            return leftrotate(node);
//        }
//        // Left Right Case 
//        if (balance > 1 && data > node.left.data) {
//            node.left = leftrotate(node.left);
//            return rightrotate(node);
//        }
//
//        // Right Left Case 
//        if (balance < -1 && data < node.right.data) {
//            node.right = rightrotate(node.right);
//            return leftrotate(node);
//        }
//        return node;
//    }
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
        tree.preOrder(tree.root);
        System.out.println(tree.root.height);
    }

    private Node insert(Node currroot, int data) {
        if (currroot == null) {
            return (new Node(data));
        }
        if (data < currroot.data) {
            currroot.left = insert(currroot.left, data);
        } else if (data > currroot.data) {
            currroot.right = insert(currroot.right, data);
        } else {
            return currroot;
        }
        int balance = getBalance(currroot);
        if (balance > 1 && data < currroot.left.data) {
            return rightrotate(currroot);
        }
        if (balance < -1 && data > currroot.right.data) {
            return leftrotate(currroot);
        }
        if (balance > 1 && data > currroot.left.data) {
            currroot.left = leftrotate(currroot.left);
            return rightrotate(currroot);
        }
        if (balance < -1 && data < currroot.right.data) {
            currroot.right = rightrotate(currroot.right);
            return leftrotate(currroot);
        }
        return currroot;
    }
}
