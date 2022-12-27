/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author قتادة
 */
public class Thread4 extends Thread {

    public void run() {
        for (int i = 0; i < 544; i++) {
            try {
                Thread.sleep(1);
                System.out.println("i= " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread4 a = new Thread4();
        Thread4 b = new Thread4();
        a.start();
        a.join();
        System.out.println("eeeeeedADF");
        b.start();
    }
}
