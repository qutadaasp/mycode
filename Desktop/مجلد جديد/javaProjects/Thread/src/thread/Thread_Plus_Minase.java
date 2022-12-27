/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Scanner;

/**
 *
 * @author قتادة
 */
public class Thread_Plus_Minase implements Runnable {

    public static void main(String[] args) {
      Thread_Plus_Minase a=new Thread_Plus_Minase();
      Thread t1=new Thread("9");
      Thread t2=new Thread("9");
      t1.start();
      t1.yield();
      t2.start();
        System.out.println("eefrrq");
    }
    String[] a = {"whats tour name ?", "How are you ?", "What is age ?"};
    int index = 0;
    Scanner s = new Scanner(System.in);

    @Override
    public void run() {
        while (index < 3) {
            System.out.println(a[1]);
            if (Thread.currentThread().equals("a")) {
                System.out.println(a[index++]);
                synchronized (this) {
                    try {
                        wait();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            } else {
                s.nextLine();
                synchronized (this) {
                    notify();
                }
            }
        }
    }
}
