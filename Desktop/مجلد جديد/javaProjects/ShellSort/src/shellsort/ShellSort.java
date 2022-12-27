package shellsort;

import java.util.Arrays;

public class ShellSort {

    public static int[] shell(int[] a, int start, int pivot) {
        int left = start;
        int right = pivot;
        if (pivot == 0) {
            return a;
        } else {
            while (right < a.length) {
                if (a[left] > a[right]) {
                    swap(a, left++, right++);
                } else {
                    left++;
                    right++;
                }
            }
            shell(a, 0, pivot - 1);
            return a;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 56, 777, 2, 5,10};
        int s = a.length / 2;
        int start = 0;
        int piv = s;
        System.out.println(Arrays.toString(a));
        shell(a, start, piv);
        System.out.println(Arrays.toString(a));
    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

}
