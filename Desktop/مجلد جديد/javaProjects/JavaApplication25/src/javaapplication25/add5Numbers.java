/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author قتادة
 */
//إدخال خمس أرقام و طباعتها مرتبة
public class add5Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("C:\\Users\\قتادة\\Desktop\\مجلد جديد\\مستند نصي جديد.txt");
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        try (PrintWriter fout = new PrintWriter(f);) {
            for(int j=0;j<a.length;j++){
                fout.println(a[j]);
            }
            
        } catch (Exception e) {
        }
    }
    
}
