/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

import java.util.ArrayList;

/**
 *
 * @author قتادة
 */
public class Arraylist1 {

   
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(33);
        a.add(22);
        a.add(222);
        a=revA(a);
        System.out.println(a.toString());
    }

    private static ArrayList<Integer> revA(ArrayList<Integer> a) {
             ArrayList<Integer>a1=new ArrayList<>();
             for(int i=a.size()-1;i>=0;i--){
                 a1.add(a.get(i));
             }
             return a1;
    }
    
}
