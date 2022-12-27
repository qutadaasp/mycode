
package javaapplication23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication23 {

    public static void main(String[] args) throws FileNotFoundException {
       File f=new File("C:\\Users\\قتادة\\Desktop\\مجلد جديد\\مستند نصي جديد.txt");
       Scanner s=new Scanner(f);
        PrintWriter p=null;
        Integer []ar=new Integer [2];
        for(int i=0;i<ar.length;i++){
            int a=s.nextInt();
            ar[i]=new Integer(a);
        }
       Integer []a=new Integer [2];
       for(int i=ar.length-1;i>=0;i++){
           
       }
       ar=a;
        try {
            String element="";
            for(int j=0;j<ar.length;j++){
                element+=ar[j]+" ";
                p.println(element);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
