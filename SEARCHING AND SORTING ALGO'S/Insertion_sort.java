import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    System.err.print("Enter the size = ");
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=1+(int)(Math.random()*99);
    }
    System.err.println("Before sorting:");
    for(int i:a){
        System.err.print(i+" ");
    }
    ins_sort(a);
    System.err.println("\nAfter sorting:");
    for(int i:a){
        System.err.print(i+" ");
    }
    }
    public static void ins_sort(int a[]){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(a[j-1]>a[j]){
                    int t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                }
                else{
                    break;
                }
            }
        }
     }
}
