/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author قتادة
 */
public class Thread7 {

    static volatile int a = new AtomicInteger(1).get();

    public static void main(String[] args) throws InterruptedException {
        second s = new second();
        s.run();
        for (int i = 0; i < 50; i++) {
            while (true) {
                if (a == 1) {
                    System.out.println("main");
                    a = 2;
                }
                if (a == 2) {
                    break;
                }
            }
        }
    }
     public void run(){
        for(int i=0;i<50;i++){
            if(Thread7.a==2){
                System.out.println("Main");
                Thread7.a=1;
                break;
            }
        }
    }
}
