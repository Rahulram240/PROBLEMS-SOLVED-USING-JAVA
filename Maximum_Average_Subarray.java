import java.util.Scanner;
public class Maximum_Average_Subarray {
    public static double mas(int a[],int k){
        int n=a.length;
        int s=0;
        for(int i=0;i<k;i++){
            s+=a[i];
        }
        int ms=s;
        for(int i=k;i<n;i++){
            s=s-a[i-k]+a[i];
            ms=Math.max(s,ms);
        }
        return (double)(ms)/k;
    }
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the size of the Array = ");
    int n=s.nextInt();
    int a[]=new int[n];
    System.err.print("Enter the Subarray Length = ");
    int k=s.nextInt();
    for(int i=0;i<n;i++){
        //a[i]=(int)(Math.random()*99)+1;
        a[i]=s.nextInt();
    }
    for(int i:a){
        System.err.print(i+" ");
    }
    double dr = mas(a,k);
    System.err.println("\n\nThe Maximum Average Subarray was "+dr);
}
}