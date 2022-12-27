 package Project_Data;
public class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
