/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revstring;

/**
 *
 * @author قتادة
 */
public class RevString {
public static String revs(String st){
    return rev(st);
}
   public static String rev(String str){
       if(str.length()<=1){
           return str;
       }
       else {
           return str.substring(str.length()-1)+rev(str.substring(0, str.length()-1));
       }
   }
    public static void main(String[] args) {
           String st="alisa";
           st=revs(st);
           System.out.println(st);
    }
    
}
