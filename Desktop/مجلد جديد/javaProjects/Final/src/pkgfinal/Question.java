package pkgfinal;
import java.util.*;
public class Question {
  
     public static void main(String[] args) {
          Stack<Integer> a=new Stack<>();
          a.push(22);
          a.push(44);
          Stack<Integer> b=new Stack<>();
          for(int i=0;i<a.size();i++){
          b.push(a.pop());
          }
          a=b;
     }
}
