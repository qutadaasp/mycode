package midterm;
public class Recursion {
         public Integer fibArr(int n){
             if(n==0){
                 return n;
             }
             else {
                 int []a=new int[n+1];
                 a[0]=0;
                 a[1]=1;
                 for(int i=0;i<n+1;i++){
                     a[i]=a[i-1]+a[i-2];
                 }
                 return a[a.length-1];
             }
         }
         int fiboOn(int n){
             return fiboOn(1,0,n);
         }
         int fiboOn(int curr,int prev,int n){
             if(n<=1){
                 return curr;
             }
             else {
                 return fiboOn(curr+prev,curr,n-1);
             }
         }
         static int []a=new int [1000];
         private int fibm(int n){
             if(a[n]==0){
                 if(n==1||n==2){
                     a[n]=1;
                 }
                 else {
                     a[n]=fibm(n-1)+fibm(n-2);
                 }
             }
             return a[n];
         }
         public static void main(String []asss){
             Recursion as=new Recursion();
             System.out.println(as.fibm(3));
             System.out.println(as.fibArr(0));
             System.out.println(as.fiboOn(3));
             System.out.println(as.fiboOn(1, 2, 5));
         }
}
