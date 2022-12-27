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
public class SUMAR {

    public static int sum(ArrayList<Integer> a) {
        int sum=0;
        if(a.size()>=1){
         sum = suma(a);
        }
        return sum;
    }

    public static void main(String[] args) {
           ArrayList<Integer> a=new ArrayList<>();
           a.add(33);
           a.add(22);
           a.add(222);
           System.out.println(sum(a));
    }

    private static int suma(ArrayList<Integer> a) {
        int sum = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
        }
        return sum;
    }
}
