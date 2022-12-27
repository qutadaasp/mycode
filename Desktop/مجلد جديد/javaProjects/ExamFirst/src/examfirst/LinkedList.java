/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfirst;

/**
 *
 * @author قتادة
 */
public class LinkedList {
    Node head;
    Node tail;
    int size;
    void addFirst(Integer data){
        Node temp=new Node(data);
        if(size==0){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
}
