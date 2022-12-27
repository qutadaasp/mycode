/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author قتادة
 */
public class HashMap_File {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\قتادة\\Desktop\\مجلد جديد\\مستند نصي جديد (2).txt");
        HashMap<String, String> a = new HashMap<>();
        try {
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                a.put(s.next(), s.next());
            }
            System.out.println(a.toString());
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
