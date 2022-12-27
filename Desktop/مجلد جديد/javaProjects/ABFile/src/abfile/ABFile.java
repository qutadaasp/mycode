/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class ABFile extends Thread {

    public static void add(tr a) throws FileNotFoundException, IOException {
        FileOutputStream a1 = new FileOutputStream("C:\\Users\\قتادة\\Desktop\\مستند نصي جديد.txt");
        
    }

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\قتادة\\Desktop\\مستند نصي جديد.txt");
        tr a = new tr("sad", 22, 33);
        tr b = new tr("sda", 44, 55);
        add(a);
    }

}
