package pkgfinal;

import java.util.ArrayList;

public class stack {
    ArrayList<Integer> a=new ArrayList<>();
    public void push(Integer data){
        a.add(data);
    }
    Integer pop(){
        return a.remove(0);
    }
    Integer peek(){
        return a.get(a.size()-1);
    }
}
