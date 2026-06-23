import java.util.Scanner;
public class Binary_Search {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.err.print("Enter the number = ");
    int n=s.nextInt();
    int a[]=new int[n];
    System.err.print("Enter the numbers =");
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    System.err.print("Enter the search element = ");
    int se=s.nextInt();
    int p = bs(se,a);
    System.err.println("This is the position = "+p);
}

public static int bs(int x,int[] a){
    int st=0,e=a.length-1;
    while (st<=e) {
        int m=st+(e-st)/2;
        if(x<a[m]){
            e=m-1;
        }
        else if(x>a[m]){
            st=m+1;
        }
        else{
            return m;
        }
    }
    return -1;
}
}