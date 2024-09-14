import java.util.*;
public class Number_in_array {
    public static int cali(int a[],int q,int d,int r){
        int res = q*d+r;
        for(int i=0;i<a.length;i++){
            if(a[i] == res){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=(int)(Math.random()*100)+1;
            //a[i]=s.nextInt();
        }
        System.err.print("The Elements in the array were ");
        for(int i:a){
            System.err.print(i+" ");
        }
        System.err.println();
        System.err.print("Enter the Divisor , Quotient and Remainder =");
        int q=s.nextInt();
        int d=s.nextInt();
        int r=s.nextInt();
        int resi = cali(a,q,d,r); 
        System.err.println("The element was at "+resi);
    }
}
