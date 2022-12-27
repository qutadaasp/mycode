package sorting;

import java.util.Arrays;

public class Heap {

    static int heapsize;

    //o(nlogn)
    public static void main(String[] args) {
        int[] a = {2, 1, 4, 5, 3, 12, 55, 22};
        System.out.println(Arrays.toString(a));
        Heap.sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a) {
        BuildHeap(a);
        while (heapsize != 0) {
            swap(a, 0, heapsize);
            heapsize--;
            heapify(a, 0);
        }
    }

    private static void BuildHeap(int[] a) {
        heapsize = a.length - 1;
        for (int i = ((heapsize - 1) / 2); i >= 0; i--) {
            heapify(a, i);
            System.out.println(Arrays.toString(a));
        }
    }

    private static void heapify(int[] a, int p) {
        int left = p * 2 + 1;
        int right = p * 2 + 2;
        int largest = p;
        if (left < heapsize && a[left] > a[right]) {
            largest = left;
        }
        if (right < heapsize && a[right] > a[left]) {
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
