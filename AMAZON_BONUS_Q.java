import java.util.*;
public class AMAZON_BONUS_Q{
    public static void result(int[] a){
        int res=0;
        for(int i=1;i<a.length;i++){
            a[i] = a[i] + a[i-1];
        }
        System.err.println("\nAfter the Change");
        for(int i:a){
            System.err.print(i+" ");
        }
        for(int i:a){
            res+=i;
        }
        System.err.println("\nThe sum of the elements in the array "+res);
    }
    public static void main(String[] ar){
        Scanner s= new Scanner(System.in);
        System.err.print("Enter the size of the Array = ");
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = 1+(int)(Math.random()*10);
        }
        System.err.println("\nThe Elements in the array are:");
        for(int i:a){
            System.err.print(i+" ");
        }
        result(a);
    }
}