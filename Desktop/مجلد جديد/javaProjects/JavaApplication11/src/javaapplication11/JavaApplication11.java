/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author قتادة
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows: "); 
        int i, j, rows;
        rows = in.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
