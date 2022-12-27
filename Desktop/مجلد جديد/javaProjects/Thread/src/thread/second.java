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
public class second extends Thread{
    @Override
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
