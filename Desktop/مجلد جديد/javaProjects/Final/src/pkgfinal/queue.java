package pkgfinal;

import java.util.LinkedList;

public class queue {
    LinkedList<Integer> a=new LinkedList<>();
    void enqueue(Integer data){
        a.add(a.size()-1);
    }
    Integer dequeue(){
        return a.remove(0);
    }
}
