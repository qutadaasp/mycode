/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author قتادة
 */
public class Merge {

    public static void main(String[] args) {
        int []a={3,2,4,1,5,88,112,34};
        int []b={3,2,42,1,5,78,66,54};
    }

    public int[] mergeTA(int[] a, int[] b) {
        int l = 0, r = 0;
        int[] res = new int[a.length + b.length];
        for (int i = 0; i < res.length; i++) {
            if (l < a.length && r < b.length) {
                if (a[l] < a[r]) {
                    res[i] = a[l++];
                } else {
                    res[i] = b[r++];
                }
                if (l == a.length) {
                    res[i] = b[r++];
                } else {
                    res[i] = a[l++];
                }
            }
        }
        return res;
    }

    public int[] mergesort(int[] a) {
        if (a.length > 1) {
            int mid = a.length / 2;
            int[] left = Arrays.copyOfRange(a, 0, mid);
            int[] right = Arrays.copyOfRange(a, mid, a.length);
            int[] al = mergesort(left);
            int[] ar = mergesort(right);
            return mergeTA(al, ar);
        }
        return a;
    }
}
