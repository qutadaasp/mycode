/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author قتادة
 */
public class printwriter {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\قتادة\\Desktop\\مجلد جديد\\مستند نصي جديد.txt");
        try (PrintWriter a=new PrintWriter(f);){
            a.println("sadfa");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
