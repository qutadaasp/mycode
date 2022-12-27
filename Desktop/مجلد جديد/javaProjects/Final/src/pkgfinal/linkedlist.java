//package pkgfinal;
//
//public class linkedlist {
//
//    Node head, tail;
//    int size;
//
//    void addFirst(Integer data) {
//        Node temp = new Node(data);
//        if (size == 0) {
//            head = tail = temp;
//        } else {
//            temp.next = head;
//            head = temp;
//        }
//        size++;
//    }
//
//    void addLast(Integer data) {
//        Node temp = new Node(data);
//        if (size == 0) {
//            head = tail = temp;
//        } else {
//            temp.next = tail.next;
//            tail.next = temp;
//            tail = temp;
//        }
//        size++;
//    }
//
//    public String tostring() {
//        String res = "";
//        Node curr = head;
//        while (curr != null) {
//            res += Integer.toString(curr.getData());
//            curr = curr.next;
//        }
//        return res;
//    }
//
//    Integer first() {
//        if (size == 0) {
//            throw new ArrayIndexOutOfBoundsException();
//        } else {
//            return head.data;
//        }
//    }
//
//    Integer removeFirst() {
//        Integer temp = head.data;
//        if (size == 0) {
//            throw new ArrayIndexOutOfBoundsException();
//        } else {
//            head = head.next;
//            size--;
//            if (size == 0) {
//                head = null;
//            }
//            return temp;
//        }
//    }
//
//    Integer removeLast() {
//        Integer temp = tail.data;
//        if (size == 0) {
//            throw new ArrayIndexOutOfBoundsException();
//        } else if (size == 1) {
//            head = tail = null;
//            size = 0;
//            return temp;
//        } else {
//            Node curr = head;
//            while (curr != tail) {
//                curr = curr.next;
//            }
//            curr.next = null;
//            tail = curr;
//            return temp;
//        }
//    }
//
//    void add(int index, Integer data) {
//        if (index < 0 || index > size) {
//            throw new ArrayIndexOutOfBoundsException();
//        } else {
//            if (index == 0) {
//                addFirst(data);
//            } else if (index == size) {
//                addLast(data);
//            } else {
//                Node curr = new Node(data);
//                Node t = head;
//                for (int i = 0; i < index; i++) {
//                    t = t.next;
//                }
//                curr.next = t.next.next;
//                t.next = curr;
//                size++;
//            }
//
//        }
//    }
//    Integer remove(int index){
//        if (index < 0 || index > size-1) {
//            throw new ArrayIndexOutOfBoundsException();
//        }
//        else if(index==size-1){
//            return removeLast();
//        }
//        else if(index==0){
//            return removeFirst();
//        }
//        else {
//            Node curr=head;
//            for(int i=0;i<index;i++){
//                curr=curr.next;
//            }
//            Integer temp=curr.next.data;
//            curr.next=curr.next.next;
//            size--;
//            return temp;
//        }
//    }
//}
