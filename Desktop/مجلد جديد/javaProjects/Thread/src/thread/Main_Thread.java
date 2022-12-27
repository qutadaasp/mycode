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
public class Main_Thread extends Thread {

    Lock m;

    public static void main(String[] args) {
        Lock s = new Lock();
        s.flag = 1;
        Main_Thread a = new Main_Thread(s);
        Thread a1 = new Thread();
        a.run();
        a1.start();
    }

    public Main_Thread(Lock m) {
        this.m = m;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (m) {
                    while (m.flag != 2) {
                        System.out.println("A");
                        m.wait();
                    }
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                    m.flag = 2;
                    while (m.flag != 1) {
                        System.out.println("B");
                    }
                    m.notifyAll();
                }
            }
        } catch (Exception e) {
        }
    }
}
