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
public class Main extends Linkedlist {

    Linkedlist a = new Linkedlist();

    public Main() {
        a.addFirst(33);
        a.addFirst(222);
        a.addFirst(3333);
        a.addLast(444);
        SumLastN(2, a);
        System.out.println("///////");
        a.remove(2);
        System.out.println(a.Tostring());
        System.out.println("//////////");
//        Max(a);
//        System.out.println("////////");
        Dublicate(a);
    }

    public static void main(String[] assa) {
        Main as = new Main();

    }
}
