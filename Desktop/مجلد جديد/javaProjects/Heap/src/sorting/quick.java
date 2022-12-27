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
public class quick {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 1, 5, 8, 6};
        quicksort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void quicksort(int[] a, int start, int end) {
        try {
            int pivot = a[start + (end - start) / 2];
            int left = start;
            int right = end;
            while (left < right) {
                while (a[left] < pivot) {
                    left++;
                }
                while (a[right] > pivot) {
                    right--;
                }
                if (left <= right) {
                    swap(a, left++, right--);
                }
            }
            if (left < end) {
                quicksort(a, left, end);
            }
            if (start < right) {
                quicksort(a, start, right);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
