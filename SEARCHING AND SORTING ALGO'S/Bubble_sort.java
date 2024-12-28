import java.util.Scanner;
import java.util.*;
public class Bubble_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size = ");
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=1+(int)(Math.random()*99);
        }
        System.err.println("The array elements = ");
        for(int i:a){
            System.err.print(i+" ");
        }
        System.err.println();
        bub(a);
        System.err.println("The new sorted array = ");
        for(int i:a){
            System.err.print(i+" ");
        }   
    }
    public static void bub(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){//or(int j=i;j>0;j--) and in the next line(a[j]<a[j-1])
                if(a[j]>a[j+1]){//If we change the sign to < then array will be sorted in Decending order instead of reversing it
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    sw=true;
                }
            }
        }
    }
}
