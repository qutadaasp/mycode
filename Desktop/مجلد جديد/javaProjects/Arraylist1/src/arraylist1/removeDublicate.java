/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

import java.util.ArrayList;

/**
 *
 * @author قتادة
 */
public class removeDublicate {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(22);
        a.add(22);
        a.add(3);
        a.add(3);
        a.add(4);
        a=removed(a, 2);
        System.out.println(a.toString());
    }

    private static ArrayList<Integer> removeD(ArrayList<Integer> a) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) != a.get(j)) {

                }
            }
        }

        return a;
    }

    public static ArrayList<Integer> removed(ArrayList a, int index) {
        ArrayList<Integer> as = new ArrayList<>();
        if (a.size() >= 1) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != a.get(index)) {
                    as.add((Integer) a.get(i));
                }
            }
        }
        return as;
    }
}
