/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import static java.lang.Thread.sleep;

/**
 *
 * @author قتادة
 */
public class Thread2 implements Runnable{

    @Override
    public void run() {
      for(int i=0;i<5;i++){
          System.out.println(i);
      }
    }
    public static void main(String[] args) {
        Thread t=new Thread(new Thread2());
        t.start();
    }
    
}
