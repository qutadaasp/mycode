/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author قتادة
 */
public class File_OutputStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("C:\\Users\\قتادة\\Desktop\\مجلد جديد\\مستند نصي جديد.txt");
        FileOutputStream a = new FileOutputStream(f,true);
        a.write("asw".getBytes());
        a.flush();
        a.close();
        FileInputStream a1 = new FileInputStream(f);
        int data = a1.read();
        while (data != -1) {
            System.out.println((char) data);
            data = a1.read();
        }
        a.close();
    }
}
