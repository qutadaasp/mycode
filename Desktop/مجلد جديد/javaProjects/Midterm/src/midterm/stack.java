/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author قتادة
 */
public class stack extends Arraylist{
         Integer data;
         Arraylist a=new Arraylist();
         void push(Integer data){
             addLast(data);
         }
         Integer pop(){
             return removeLast();
         }
         Integer peek(){
             return a.get(a.size-1);
         }
}
