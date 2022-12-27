
package midterm;

import java.util.NoSuchElementException;
public class Linkedlist {

    Node tail, head;
    int size;

    void addFirst(Integer data) {
        Node temp = new Node(data);
        if (size == 0) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void Dublicate(Linkedlist a) {
        int count = 0;
        Node temp = head;
        Node curr=head;
        for (int i = 0; i < a.size; i++) {
         if(curr.data==temp.data){
             count++;
         }
         curr=curr.next;
        }
        System.out.println(head.data+" "+"count = "+count);
        a.remove(0);
        Dublicate(a);
    }

    String Tostring() {
        String res = "";
        Node curr = head;
        while (curr != null) {
            res += curr.data + " ";
            curr = curr.next;
        }
        return res;
    }

    Integer first() {
        if (head == null) {
            throw new NoSuchElementException("3433");
        }
        return head.data;

    }

    Integer removeFirst() {

        if (head == null) {
            throw new NoSuchElementException("no");
        }
        Integer temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    void addLast(Integer data) {
        Node temp = new Node(data);
        if (tail == null) {
            addFirst(data);
        } else {
            tail.next = temp;
            tail = temp;

        }
        size++;
    }

    Integer removeLast() {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Integer temp = tail.data;
        if (size == 1) {
            head = tail = null;
            size = 0;
            return temp;
        } else {
            Node curr = head;
            while (curr != tail) {
                curr = curr.next;
            }
            tail = curr;
            tail.next = null;
            size--;
            return temp;
        }
    }

    void add(int index, Integer data) {
        if (index < 0 || index > size) {
            throw new NoSuchElementException();
        } else {
            if (index == 0) {
                addFirst(data);
            } else if (index == size) {
                addLast(data);
            } else {
                Node temp = new Node(data);
                Node curr = head;
                for (int i = 0; i < index; i++) {
                    curr = curr.next;
                }
                Node curr1 = curr.next;
                curr.next = temp;
                temp.next = curr1;
                size++;
            }
        }
    }

    int SumLastN(int n, Linkedlist l) {
        int sum = 0;
        if (n < 1 || n > l.size) {
            throw new NoSuchElementException();
        } else {
            Node temp = head;
            for (int i = 0; i < size - n; i++) {
                temp = temp.next;
            }
            while (temp != null) {
                sum += temp.data;
                temp = temp.next;
            }
            return sum;
        }
    }

    Integer remove(int index) {
        if (index < 0 || index > size) {
            throw new NoSuchElementException();
        } else {
            if (size == 1) {
                Integer temp = head.data;
                head = tail = null;
                return temp;
            } else {
                Node curr = head;
                for (int i = 0; i < index; i++) {
                    curr = curr.next;
                }
                Integer re = curr.next.data;
                Node tem = curr.next.next;
                curr.next = tem;
                size--;
                return re;
            }
        }
    }

    Integer Max(Linkedlist a) {
        if (size == 0) {
//            throw new NoSuchElementException("333");
            return null;
        } else {
            Node temp = head;
            for (int i = 0; i < size; i++) {
                if (temp.data < temp.next.data) {
                    temp = temp.next;
                }
            }
            return temp.data;
        }
        
    }

    void Rotate(Linkedlist l, int n) {
        for (int i = 0; i < n; i++) {
            rotate(l);
        }
    }

    private void rotate(Linkedlist l) {
        Node temp = head.next;
        Node prev = head;
        Node pr = null;
        Node sr;
        while (pr != null) {
            sr = prev;
            pr = temp;
            pr.next = sr;
            temp = temp.next;
            prev = prev.next;

        }
        head = tail;
        tail.next = null;

    }
    public static void main(String[] ase) {
        Linkedlist a = new Linkedlist();
        a.addFirst(33);
        a.addFirst(222);
        a.addFirst(3333);
        a.addLast(444);
//        SumLastN(2, a);
        System.out.println("///////");
        a.remove(2);
        System.out.println(a.Tostring());
        System.out.println("//////////");
//        Max(a); Dublicate(a); SumLastN(2, a);
        System.out.println("////////");
    }
}
