package examfirst;

import java.util.ArrayList;
public class rec extends LinkedList{

    static String g = "";

    public static String revS(String a) {
        if (a.length() == 0) {
            return "";
        } else {
            if (a.length() == 1) {
                g += a.charAt(0);
                return g;
            }
            if (!a.equals(null)) {
                g += a.charAt(a.length() - 1);
                revS(a.substring(0, a.length() - 1));
            }
        }
        return g;
    }

    public static String revA(ArrayList a) {
        if (a.size() == 0) {
            return null;
        } else if (a.size() == 1) {
            return (String) a.get(0);
        } else {
            g += a.get(a.size() - 1);
            s(a);
            revA(a);
        }
        return g;
    }

    public static void s(ArrayList e) {
        ArrayList s = new ArrayList<>();
        for (int i = 0; i < e.size(); i++) {
            s.add(e.get(i));
        }
        e = s;
    }
    public static void Pa(LinkedList a){
        boolean s=P(a);
        if(P(a)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static boolean P(LinkedList a){
        Node curr=a.head;
        String s="";
        while(curr!=null){
            s+=curr.data;
            curr=curr.next;
        }
        String s1="";
            for(int j=s.length()-1;j>=0;j--){
                s1+=s.charAt(j);
            }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s1.charAt(i)){
                return false;
            }
        }
        return true;
    }
//    public static int Len(L a) {
//        int c = 0;
//        Node curr=a.head;
//      if(curr.data.equals(null)){
//          return c;
//      }
//      else{
//          curr.next=curr;
//          c++;
//      }
//      return c;
//    }

    public static void main(String[] qa) {
        String s = "sa4";
        System.out.println(revS(s));
        LinkedList a=new LinkedList();
        a.addFirst(2);
        a.addFirst(4);
        a.addFirst(2);
        Pa(a);
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(3);
//        a.add(2);
//        System.out.println(revA(a));
//        L a1=new L();
//        System.out.println(Len(a1));
    }
}
