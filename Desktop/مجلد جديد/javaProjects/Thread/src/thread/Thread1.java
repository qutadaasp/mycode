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
public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 530; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
       for(int i=0;i<50;i++){
           System.out.println("The End");
       }
    }
}
