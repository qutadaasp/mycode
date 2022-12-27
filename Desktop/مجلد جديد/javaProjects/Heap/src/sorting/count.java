/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author قتادة
 */
public class count {

    public static void main(String[] args) {
        int[] a = {344, 11, 33, 22, 22, 33, 11};
        int c = 0;
        try {
            System.out.println(count(a));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static int[] count(int[] a) {
        int min = 0, max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        int[] a1 = new int[(max - min) + 1];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a1[i] = count1(a, a[j]);
            }
        }
        int[] a1new = new int[a1.length];
        a1new[0] = a1[0];
        for (int j = 1; j < a1.length; j++) {
            a1new[j] = a1new[j - 1] + a1[j];
        }
        int a2[] = new int[a.length];
        a2 = replace(a2, a1new, a);
        a = a2;
        return a;
    }

    public static int count1(int[] a, int n) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                c++;
            }
        }
        return c;
    }

    public static int[] replace(int[] a2, int[] a1new, int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            int temp = a[i];
            int temp1 = a1new[temp];
            if (temp1 != 0) {
                a2[temp1 - 1] = temp;
            } else {
                a2[temp1] = temp;
            }

            a1new[i] = a1new[i] - 1;
        }
        return replace(a2, a1new, a);
    }
}
