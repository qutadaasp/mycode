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
public class MyHeap {

    static int size;

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4, 5, 22, 55, 66, 777, 214};
        MyHeap.sort(a);
    }

    private static void sort(int[] a) {
        BuildHeap(a);
        while (size != 0) {
            swap(a, 0, size);
            size--;
            heapify(a, 0);
        }
    }

    private static void BuildHeap(int[] a) {
        size = a.length - 1;
        for (int i = (size - 1) / 2; i >= 0; i--) {
            heapify(a, i);
            System.out.println(Arrays.toString(a));
        }
    }

    private static void heapify(int[] a, int p) {
        int left = p * 2 + 1;
        int right = p * 2 + 2;
        int largest = p;
        if (left < size && a[left] > a[right]) {
            largest = left;
        }
        if (right < size && a[right] > a[left]) {
            largest = right;
        }
        if (largest != p) {
            swap(a, p, largest);
            heapify(a, largest);
        }
    }

    private static void swap(int[] a, int p, int largest) {
        int temp = a[p];
        a[p] = a[largest];
        a[largest] = temp;
        System.out.println(Arrays.toString(a));
    }
}
