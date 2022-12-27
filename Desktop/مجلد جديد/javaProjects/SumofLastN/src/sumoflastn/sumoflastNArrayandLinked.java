/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoflastn;

import java.util.*;

/**
 *
 * @author قتادة
 */
public class sumoflastNArrayandLinked {

    public static int sum(int n, List l) {
        int sum = 0;
        if (n < 1 || n > l.size()) {
            throw new ArrayIndexOutOfBoundsException("Not available");
        } else {
            ListIterator<Integer> i1 = l.listIterator();
            for (int i = 0; i < l.size() - n; i++) {

            }
            int count = 0;
            int s = l.size();
            //لطباعة آخر عناصر عددهن يساوي العدد المطلوب 
            for(int i=s-n;i<s;i++){
               sum += i1.next();
            }            
            return sum;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Numbers for Array");
        System.out.println("Enter Length");
        int count = in.nextInt();
        int count1 = 0;
        while (count1 != count) {
            arr.add(in.nextInt());
            count1++;
        }
        System.out.println("Enter Numbers for Linked");
        System.out.println("Enter Length");
        int countl = in.nextInt();
        int count1l = 0;
        while (count1l != countl) {
            l.add(in.nextInt());
            count1l++;
        }
        System.out.println(sum(2, arr));
        System.out.println("///////////");
        System.out.println(sum(1, l));
    }
}
