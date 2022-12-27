/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author قتادة
 */
public class File_Student {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\قتادة\\Desktop\\مجلد جديد\\مستند نصي جديد.txt");
        doWrite(f);
        doRead(f);
    }

    private static void doWrite(File f) {
        ObjectOutputStream oos = null;
        FileOutputStream fout = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\قتادة\\Desktop\\مجلد جديد\\مستند نصي جديد.txt")));
            Student s1 = new Student(23, "ahmad");
            Student s2 = new Student(234, "asdffa");
            oos.writeObject(s1);
            oos.writeObject(s2);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    private static void doRead(File f) {
        ObjectOutputStream a = null;
        FileOutputStream aw = null;
        try {
            a = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\قتادة\\Desktop\\مجلد جديد\\مستند نصي جديد.txt")));
            a.reset();
        } catch (Exception e) {
        }
    }

}
