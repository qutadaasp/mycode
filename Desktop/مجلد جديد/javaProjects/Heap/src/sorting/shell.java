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
public class shell {

    public static void main(String[] args) {
        int[] a = {344, 11, 33, 222, 66, 44, 223};
        int piv = a.length / 2;
        System.out.println(shellSort(a, 0, piv));
    }

    private static int[] shellSort(int[] a, int start, int piv) {
        int left = start, right = piv;
        if (piv != 0) {
            while (right < a.length) {
                if (a[left] > a[right]) {
                    int temp = a[left];
                    a[left] = a[right];
                    a[right] = temp;
                    left++;
                    right++;
                } else {
                    left++;
                    right++;
                }
            }
            shellSort(a, start, piv - 1);
            return a;
        }
        return a;
    }
}
