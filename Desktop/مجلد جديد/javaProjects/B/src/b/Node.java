package b;
public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        right=null;
        left=null;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getData() {
        return data;
    }
    
    
}
