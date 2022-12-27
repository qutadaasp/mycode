/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 *
 * @author قتادة
 */
public class ThreadOrder1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] x = new int[5];
        for(int i=0;i<x.length;i++){
            x[i]=s.nextInt();
        }
        order1 a=new order1(x);
        Thread t=new Thread( (Runnable) a);
        t.start();
    }
}
