/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author قتادة
 */
import java.util.*;

public class stack {

    /**
     * @param args the command line arguments
     */
    public static Stack<Integer> addstack(Stack<Integer> a, int index, Integer Value) {
        try {
            if (index <= a.size()) {
                return addStack(a, index, Value);
            } else {
                return a;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return a;
    }

    public static Stack<Integer> addStack(Stack<Integer> s, int index, Integer value) {
        Stack<Integer> a = new Stack<>();
        for (int i = 0; i < index; i++) {
            a.add(s.get(i));
        }
        a.add(value);
        for (int j = index; j < s.size(); j++) {
            a.add(s.get(j));
        }
        s = a;
        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(3);
        s.add(4);
        s.add(5);
        s = addstack(s, 3, 4);
        System.out.println(s.toString());
    }

}
