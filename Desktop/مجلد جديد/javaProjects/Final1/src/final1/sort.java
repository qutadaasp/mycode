/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

import java.util.Arrays;

/**
 *
 * @author قتادة
 */
public class sort {

    static void selection(int[] a) {
        int min;
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                    int temp = a[i];
                    a[i] = a[min];
                    a[min] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {34, 22, 11, 1111, 1111, 332, 22444555};
        selection(a);
    }

    public int[] merges(int[] a) {
        if (a.length > 1) {
            int mid = a.length / 2;
            int[] left = Arrays.copyOfRange(a, 0, mid);
            int[] right = Arrays.copyOfRange(a, mid, a.length);
            int[] al = merges(left);
            int[] ar = merges(right);
            return merge(al, ar);
        }
        return a;
    }

    static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int l = 0, r = 0;
        for (int i = 0; i < res.length; i++) {
            if (l < left.length && r < right.length) {
                if (left[l] < right[r]) {
                    res[i] = left[l];
                } else {
                    res[i] = right[r];
                }

            } else {
                if (l == left.length) {
                    res[i] = res[r++];
                } else {
                    res[i] = left[l++];
                }
            }

        }
        return res;
    }
}
