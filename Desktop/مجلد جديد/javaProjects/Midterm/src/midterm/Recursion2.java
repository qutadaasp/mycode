package midterm;

import java.util.*;

public class Recursion2 {

    static Stack<Integer> st = new Stack<>();

    public void Middle(Linkedlist a) {
        int c = 0;
        Middle(a, c);
    }

    private void Middle(Linkedlist a, int c) {
        Node cur1;
        Node cur2;
        if (a.size == 1) {
            System.out.println("Hasnot Middle");
        }
        if (a.size % 2 != 0) {
            cur1 = a.head;
            while (c != ((a.size - 1) / 2 + 1)) {
                cur1 = cur1.next;
                c++;
            }
            System.out.println("Middle is " + cur1.getData());
        } else if (a.size % 2 == 0) {
            c = 0;
            cur1 = a.head;
            cur2 = a.head;
            while (c != a.size / 2) {
                cur1 = cur1.next;
                c++;
            }
            c = 0;
            while (c != a.size / 2 + 1) {
                cur2 = cur2.next;
                c++;
            }
            System.out.println("Middle is " + cur1.getData() + "," + cur2.getData());
        } else {
            System.out.println("List hasnot Middle");
        }
    }

    public static void main(String[] args) {
        Recursion2 a = new Recursion2();
        Linkedlist a1 = new Linkedlist();
//        a1.addFirst(3);
//        a1.add(0, 3);
//        a1.addFirst(5);
//        a1.addFirst(4);
//        a.Middle(a1);

        st.push(34);
        st.push(3);
        st.push(44);
        sort(st);
        System.out.println("st ="+st);
//        reverse();
//        System.out.println(st);
    }

    static void insert_at_bottom(Integer x) {

        if (st.isEmpty()) {
            st.push(x);
        } else {

            Integer a = st.peek();
            st.pop();
            insert_at_bottom(x);

            st.push(a);
        }
    }

    static void reverse() {
        if (st.size() > 0) {

            Integer x = st.peek();
            st.pop();
            reverse();

            insert_at_bottom(x);
        }
    }

    static void sort(Stack a) {
       
        Stack<Integer> b = new Stack<>();
         sort1(a,b);
    }

    private static void sort1(Stack<Integer> a,Stack<Integer> b) {
        Integer temp=a.peek();
        a.pop();
        if((Integer)b.peek()<=temp){
            b.push(temp);
        }
        else {
            Integer temp1=b.peek();
            b.pop();
            a.push(temp);
            sort1(a,b);
        }
        a=b;
    }
}
