/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCD_Recursion;

/**
 *
 * @author قتادة
 */
public class GCD_Recursion {

    public static int GCD(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd(a, b);
        } else {
            return gcd(b, a);
        }
    }

    private static int gcd(int a, int b) {
        int great = 0;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0) {
                if (b % i == 0) {
                    great = i;
                }
            }
        }
        return great;
    }
    public static void main(String[] args) {
        System.out.println(GCD(9, 6));
    }

}
