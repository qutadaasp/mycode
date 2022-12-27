package arraylistmethods;

import java.util.ArrayList;

public class ArrayListMethods {

    static int[] elements;
    static int size =3;
    public ArrayListMethods() {
        elements = new int[size];
    }
    public void rev(){
        for(int i=size-1;i>=0;i--){
            for(int j=0;j<size;j++){
                elements[i]=elements[j];
            }
        }
    }
    public void removed(){
        int c=0;
        int []f=new int[size];
        for(int i=0;i<size;i++){
            int ind=elements[i];
            for(int j=0;j<size;j++){
                if(elements[i]==elements[j]){
                    c++; 
                    if(c>1){
                    rem(ind,f,c);
                }
                }
            }
            c=0;
        }           
    }
    public void rem(int a,int[]b,int c){
        for(int i=0;i<size-1;i++){
            if(elements[i]!=a){
                b[i]=elements[i];
            }
            else{
                b[i]=elements[i+1];
            }
        }
        elements=b;
    }
    public static void main(String[] args) {
        ArrayListMethods s = new ArrayListMethods();
         s.rev();
         s.removed();
         for(int x=0;x < elements.length;x++){
             System.out.print(elements[x]+" ");  
         }
    }

}
