/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Stack;

/**
 *
 * @author قتادة
 */
public class rev {
    public static void revS(Stack sta){
        sta=revs(sta);
        System.out.println(sta.toString());
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(22);
        s.push(82);
        s.push(222);
        revS(s);
    }

    private static Stack revs(Stack sta) {
          Stack a=new Stack();
          while(!sta.empty()){
              a.push(sta.pop());
          }
          return a;
    }
}
