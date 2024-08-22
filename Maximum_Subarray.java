import java.util.Scanner;
public class Maximum_Subarray {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.err.print("Enter the number =");
    int n=s.nextInt();
    int a[]=new int[n];
    System.err.print("Enter the elements =");
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    System.err.print("Enter the k =");
    int k=s.nextInt();
    System.err.println("The maximum subarray is "+Max_sub(a,k));
}
public static double Max_sub(int a[],int k){
int c=0,o=Integer.MIN_VALUE;
for(int i=0;i<k;i++){
    c+=a[i];
}
o=c;
for(int j=k;j<a.length;j++){
    c=c-a[j-k]+a[j];
    o=Math.max(o, c);
}
return (double)o/4;
}
}