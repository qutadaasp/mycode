package slowsort;

import java.util.*;

public class Slowsort {

    static int[] a = {12, 13, 10, 5, 6, 8};
    static int[] b = {12, 13, 10, 5, 6, 8};
    static int[] c = new int[a.length];

    public static void main(String[] args) {
        SlowSort(a);
    }

    private static void SlowSort(int[] a) {
        Random r = new Random();
        a = c;

        for (int j = 0; j < b.length; j++) {
            int n = r.nextInt(20) + 1;
            for (int g = 0; g < b.length; g++) {
                if (b[g] == n) {
                    a[g] = n;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        Check(a, b);
    }

    private static boolean Check(int[] a, int[] b) {
        for (int k = 0; k < b.length - 1; k++) {
            for (int f = k + 1; f < b.length; f++) {
                if (b[k] > b[f]) {
                    int temp = b[k];
                    b[k] = b[f];
                    b[f] = temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (a[i] != b[i]) {
                a = b;
                SlowSort(a);
            }
        }

        return true;
    }
}
