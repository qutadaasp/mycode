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
public class Thread5 extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("B");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread5 a=new Thread5();
        a.start();
        a.join();
        for(int i=0;i<50;i++){
            System.out.println("A");
        }
    }
}
