import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Alternate_Sorting {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    int a[]=new int[x];
    for(int i=0;i<x;i++){
            a[i]=(int)(Math.random()*9)+1;
    }
    System.err.print("The array is ");
    for(int i=0;i<x;i++){
        System.err.print(a[i]+" ");
    }
    System.err.println();
    Arrays.sort(a);
    System.err.print("Sorted array is ");
    for(int i=0;i<x;i++){
        System.err.print(a[i]+" ");
    }
    System.err.println();
    System.err.print("The alternative Sorting is ");
    alsort(a);
   } 
   public static void alsort(int a[]){
    int n=a.length;
    int i=0,j=n-1;
    while(i<j){
        System.err.print(a[j--]+" ");
        System.err.print(a[i++]+" ");
    }
    if(n%2!=0){
        System.err.print(a[n/2]);/*or a[i] or a[j] cause after the while loop 
        both points to the middle element*/
    }
   }
}
