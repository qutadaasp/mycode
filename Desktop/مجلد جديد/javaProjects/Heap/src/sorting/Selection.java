/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author قتادة
 */
public class Selection {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 1, 9, 8};
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    int temp=a[min];
                    a[min]=a[j];
                    a[j]=temp;
                    min=j;
                    
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
