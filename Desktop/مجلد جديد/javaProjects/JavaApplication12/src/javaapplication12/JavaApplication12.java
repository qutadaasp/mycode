/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author قتادة
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter size ");
        int size = new Scanner(System.in).nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        System.out.println("Enter elements for first");
        for (int s = 0; s < size; s++) {
            a[s] = new Scanner(System.in).nextInt();
        }
        System.out.println("Enter elements for second");
        for (int s = 0; s < size; s++) {
            b[s] = new Scanner(System.in).nextInt();
        }
        System.out.println("Enter The operation and 0 to exit");
        int x = new Scanner(System.in).nextInt();
        while (x != 0) {
            if (x == 1) {
                res(a, b);
                x = 0;
            } else if (x == 2) {
                prod(a, b);
                x = 0;
            } else {
                System.out.println("Enter one more or 0 to exit");
                x = new Scanner(System.in).nextInt();
            }
        }
    }

    public static void prod(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
        }
        for (int s = 0; s < c.length; s++) {
            System.out.print(c[s] + ",");
        }
    }

    public static void res(int[] a, int[] b) {
        int pos = a.length;
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int h = 0; h < b.length; h++) {
            c[pos] = b[h];
            pos++;
        }
        for (int s = 0; s < c.length; s++) {
            System.out.print(c[s] + ",");
        }

    }

}
