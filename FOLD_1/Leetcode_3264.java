package FOLD_1;
import java.util.*;
public class Leetcode_3264 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.err.print("Enter the size of the Array = ");
    int n = s.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        a[i] = 1+(int)(Math.random()*10);
    }
    System.err.println("Elements of the array :");
    for(int i:a){
        System.err.print(i+" ");
    }
    System.err.println();
    System.err.print("Enter the k = ");
    int k = s.nextInt();
    System.err.print("Enter the multipiler = ");
    int multi = s.nextInt();
    fun(a,k,multi);
    // System.err.println("The result is ");
    // for(int i:res){
    //     System.err.print(i+" ");
    // }
}

public static void fun(int a[],int k,int m){
    for(int i=0;i<k;i++){
        int minI=0;
        for(int j=0;j<a.length;j++){
            if(a[j]<a[minI]){
                minI = j;
            }
        }
        a[minI]*=m;
        for(int z:a){
            System.err.print(z+" ");
        }
        System.err.println();
    }
    // return a;
}
}