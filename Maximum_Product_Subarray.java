import java.util.*;
public class Maximum_Product_Subarray {
    public static int mps(int a[]){
        int r=a[0],maxp=a[0],minp=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<0){
                int t=maxp;
                maxp=minp;
                minp=t;
            }
            maxp = Math.max(a[i],a[i]*maxp);
            minp = Math.min(a[i],a[i]*minp);
            r = Math.max(r,maxp);
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.print("Enter the Size of the Array = ");
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            //a[i]=s.nextInt();
            a[i]=(int)(Math.random()*99)+1;
        }
        for(int i:a){
            System.err.print(i+" ");
        }
        System.err.println();
        int res = mps(a);
        System.err.println("The Maximum Product of the Subarray was "+res);
    }
}
