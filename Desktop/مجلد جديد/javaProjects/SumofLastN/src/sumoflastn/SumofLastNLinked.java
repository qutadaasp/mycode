/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoflastn;

import java.util.LinkedList;

/**
 *
 * @author قتادة
 */
public class SumofLastNLinked {

    /**
     * @param args the command line arguments
     */
    public static int sum(int n,linkedlist l){
        int sum=0;
        if(n<1||n>l.getSize()){
            throw new ArrayIndexOutOfBoundsException("Not available");
        }
        else {
            Node curr=l.getHead();
            //لطباعة آخر عناصر عددهن يساوي العدد المطلوب 
            for(int i=0;i<l.getSize()-n;i++){
                curr=curr.getNext();
            }
            while(curr!=null){
                sum+=curr.data;
                curr=curr.getNext();
            }
        }
        return sum;
    }
    public static void main(String[] args) {
            linkedlist a=new linkedlist();
            a.addFirst(2);
            a.addFirst(3);
            a.addLast(3);
            System.out.println(sum(3,a));
    }
    
}
