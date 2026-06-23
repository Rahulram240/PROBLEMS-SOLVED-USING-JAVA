import java.util.*;
public class Leetcode_2558 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int st = (int)System.currentTimeMillis();
        System.err.print("Enter the Size of array = ");
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = (int)(Math.random()*10);
        }
        System.err.println("The elements in array are");
        for(int i:a){
            System.err.print(i+" ");
        }
        System.err.println();
        System.err.print("Enter the total sec's = ");
        int no = s.nextInt();
        long re = GIFNI(a,n);
        System.err.println("The Total no.of gifts remaining is "+re);
        int et = (int)System.currentTimeMillis();
        System.err.println("Total running time = "+(et-st)/1000);
    }
    public static long GIFNI(int[] e,int n){
        for(int i=0;i<n;i++){
            Arrays.sort(e);
            e[e.length-1] = (int)(Math.sqrt(e[e.length-1] ));
        }
        long res = 0;
        for(long i:e){
            res+=i;
        }
        return res;
    } 
}
