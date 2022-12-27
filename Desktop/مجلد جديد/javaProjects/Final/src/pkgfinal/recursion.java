package pkgfinal;

public class recursion {

    public static int fib(int n) {
    if(n==0){
        return 0;
    }
    else {
        int []a=new int[n+1];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<n+1;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[a.length-1];
    }
    }
    public static void main(String []sasd){
        System.out.println(fib(6));
    }
}
