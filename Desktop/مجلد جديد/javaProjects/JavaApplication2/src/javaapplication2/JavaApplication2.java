package javaapplication2;

import java.util.ArrayList;

public class JavaApplication2 {

    Integer elements[];
    private int s = 0;

    public JavaApplication2() {
        elements = new Integer[3];
    }

    public void add(Integer data) {
        if (elements.length <= s) {
            ensurecapacity();
        }
        elements[s] = data;
        s++;
    }

    public String tostring() {
        String res = "";
        for (int i = 0; i < s; i++) {
            res += elements[i];
        }
        return res;
    }

    public void ensurecapacity() {
        int newsize = elements.length;
        Integer[] newelements = new Integer[newsize];
        for (int j = 0; j< elements.length; j++) {
            newelements[j] = elements[j];
        }
        elements = newelements;

    }
      public Integer get(Integer index){
          throw new ArrayIndexOutOfBoundsException();
      }
    public static void main(String[] args) {
        JavaApplication2 a = new JavaApplication2();
        a.add(23);
        a.add(22);
        a.add(23);
        System.out.println(a.tostring());
        a.add(34);
        System.out.println(a.tostring());

    }

}
