import java.util.*;
public class Binary_decimal{
 public static void pseudoBinary(int n){
   while(n!=0){
    int t=n,m=0,p=1;
    while(t!=0){
        int rem=t%10;
        t/=10;
        if(rem!=0){
            m+=p;
        }
        p*=10;
    }
    n=n-m;
    System.out.print(m+" ");
   }
   System.err.println();
 }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        pseudoBinary(n); 
    }
}
