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
public class Thread3 extends Thread{
    public void run(){
        System.out.println("Hello from "+this.getName());
    }
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            new Thread3().start();
        }
        System.out.println("Hello from"+Thread.currentThread().getName());
    }
}
