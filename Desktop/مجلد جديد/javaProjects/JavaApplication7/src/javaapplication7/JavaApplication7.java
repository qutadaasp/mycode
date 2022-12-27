
package javaapplication7;
import java.util.LinkedList;
import javafx.scene.Node;
public class JavaApplication7 {
    public static void main(String[] args) {
    }
    int sumLastNum(int n,LinkedList<String>l){
        int sum=0;
        if(n<1||n>l.size()){
            throw new ArrayIndexOutOfBoundsException("not");
        }
        else {
           String curr=l.getFirst();
        }
        return sum;
    }
}
