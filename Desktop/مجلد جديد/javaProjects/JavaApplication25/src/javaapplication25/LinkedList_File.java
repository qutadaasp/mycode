/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author قتادة
 */
public class LinkedList_File {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        LinkedList<Integer> a = new LinkedList<>();
        File f = new File("C:\\Users\\قتادة\\Desktop\\مجلد جديد\\مستند نصي جديد.txt");
        Scanner in = new Scanner(f);
        try {
            while (true) {
                int s = in.nextInt();
                a.add(s);
                System.out.println(s);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
