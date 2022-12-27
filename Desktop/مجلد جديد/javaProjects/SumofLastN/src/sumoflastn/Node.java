 package sumoflastn;
public class Node {
    Integer data;
    Node next;

    public Node(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

   
}
