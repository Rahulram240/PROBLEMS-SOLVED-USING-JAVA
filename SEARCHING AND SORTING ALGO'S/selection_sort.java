import java.util.Scanner;

public class selection_sort {
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
    sel_sort(a);
    System.err.println("\nAfter sorting:");
    for(int i:a){
        System.err.print(i+" ");
    }
 }   
 public static void sel_sort(int a[]){
    int n=a.length;
    boolean sw=false;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]>a[j]){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                sw=true;
            }
        }
        if(!sw){
            break;
        }
    }
 }
}
