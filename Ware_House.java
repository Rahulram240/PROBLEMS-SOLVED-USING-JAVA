import java.util.*;
public class Ware_House {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.print("Size of Array 1 = ");
        int m=s.nextInt();
        System.err.print("Size of Array 2 = ");
        int n=s.nextInt();
        int a1[]=new int[m+n];
        int a2[]=new int[n];
        for(int i=0;i<m;i++){
            a1[i]=s.nextInt();
        }
        for(int j=0;j<n;j++){
            a2[j]=s.nextInt();
        }
        res(a1,m,a2,n);
        Arrays.sort(a1);
        System.err.println("The resultant array is "+Arrays.toString(a1));
    }
    public static void res(int a1[],int m,int a2[],int n){
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(a1[i]<a2[j]){
                a1[k--]=a2[j--];
            }
            else {
                a1[k--]=a1[i--];
            }
        }
        while(j>=0){
            a1[k--]=a2[j--];
        }
    }
}
