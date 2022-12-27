/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfirst;

/**
 *
 * @author قتادة
 */
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

    public void setNext(Node head) {
        this.next = head;
    }
       
}
