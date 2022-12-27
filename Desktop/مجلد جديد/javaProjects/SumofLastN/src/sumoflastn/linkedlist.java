/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoflastn;

import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

/**
 *
 * @author قتادة
 */
public class linkedlist {

    Node head, tail;
    int size = 0;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(Integer data) {
        Node temp = new Node(data);
        if (size == 0) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public Integer First() {
        try {
            if (head == null) {
                throw new NoSuchElementException("Empty");
            } else {
                Integer res = head.data;
                return res;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public Integer removeFirst() {
        try {
            if (head == null) {
                throw new NoSuchElementException("Empty");
            }
            Integer temp = head.data;
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }

            return temp;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public String tostring() {
        String g = "";
        Node temp = head;
        while (temp != null) {
            g += " " + temp.data;
            temp = temp.next;
        }
        return g;
    }

    public void add(int index, Integer data) {
        try {
            if (index < 0 || index > size) {
                throw new NoSuchElementException("Error values");
            } else {
                if (index == 0) {
                    addFirst(data);
                } else if (index == size) {
                    addLast(data);
                } else {
                    Node temp = new Node(data);
                    Node curr = head;
                    for (int i = 0; i < index - 1; i++) {
                        curr = curr.next;
                    }
                    temp.next = curr.next;
                    curr.next = temp;
                    size++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void addLast(Integer data) {
        if (size == 0) {
            addFirst(data);
        }
        Node temp = new Node(data);
        tail.next = temp;
        temp.next = null;
        tail = temp;
        size++;
    }

    public Integer Remove(int index) {
        try {
            Integer res = null;
            if (index < 0 || index > size - 1) {
                throw new ArrayIndexOutOfBoundsException("Error values");
            } else {
                if (index == 0) {
                    return removeFirst();
                } else if (index == size - 1) {
                    removeLast();
                } else {
                    Node curr = head.next;
                    Node prev = head;
                    for (int i = 0; i < index - 1; i++) {
                        curr = curr.next;
                        prev = prev.next;
                    }
                    res = curr.data;
                    prev.next = curr.next;
                    size--;
                }
            }
            return res;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public Integer removeLast() {
        try {
            if (head == null) {
                throw new NoSuchElementException("Empty");
            } else {
                Integer temp = tail.data;
                if (size == 1) {
                    head = tail = null;
                    size = 0;
                    return temp;
                } else {
                    Node curr = head;
                    while (curr.next != tail) {
                        curr = curr.next;
                    }
                    tail = curr;
                    tail.next = null;
                    size--;
                    return temp;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
