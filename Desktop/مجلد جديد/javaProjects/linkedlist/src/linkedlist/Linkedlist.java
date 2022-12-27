/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.LinkedList;

/**
 *
 * @author قتادة
 */
public class Linkedlist {

   public static boolean remove(LinkedList<Integer> a,Integer data){
       for(int i=0;i<a.size();i++){
           if(a.get(i)==data){
               a.remove(i);
               return true;
           }
       }
       return false;
   }
    public static void main(String[] args) {
     LinkedList<Integer> a=new LinkedList<>();
     a.add(33);
     a.add(22);
     a.add(2222);
        System.out.println(remove(a,33));
    }
    
}
