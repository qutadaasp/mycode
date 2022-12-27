/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myheap;

import java.util.Arrays;

public class MyHeap {

    static int heapsize;

    public static void main(String[] args) {
        int[] a = {1, 4, 7, 12, 16, 19};
        System.out.println(Arrays.toString(a));
        MyHeap.sort(a);
        System.out.println(Arrays.toString(a));

    }

    private static void buildheap(int[] a) {
        heapsize = a.length - 1;
        for (int i = 0; i < heapsize; i++) {
            MyHeap.heapify(a, i);
            System.out.println(Arrays.toString(a));
        }
        
    }

    private static void heapify(int[] a, int p) {
        int left = p * 2 + 1;
        int right = p * 2 + 2;
        int largest = p;
        if (left <heapsize && a[left] > a[right]) {
            largest = left;
        }
        if (right <heapsize && a[right] > a[left]) {
            largest = right;
        }
        if (largest != p) {

            MyHeap.swap(a, p, largest);
            MyHeap.heapify(a, largest);
        }

    }

    private static void swap(int[] a, int p, int largest) {
        int temp = a[p];
        a[p] = a[largest];
        a[largest] = temp;
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a) {
        MyHeap.buildheap(a);
        while (heapsize != 0) {
            MyHeap.swap(a, 0, heapsize);
            heapsize--;
            MyHeap.heapify(a, 0);
        }
    }
}
