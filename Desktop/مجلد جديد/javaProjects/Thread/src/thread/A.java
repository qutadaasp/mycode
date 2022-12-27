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
public class A extends Thread{
    String name;
    int flag=1;
    public A(String name) {
        this.name = name;
    }
}
