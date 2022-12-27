
package midterm;
public class Node {
    Node next;
    Integer data;

    public Node(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public Integer getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(Integer data) {
        this.data = data;
    }
    
}
