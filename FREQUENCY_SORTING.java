import java.util.Scanner;
public class FREQUENCY_SORTING {
    public static void arrp(int a[]){
        System.err.print("The elements are = ");
        for(int i:a){
            System.err.print(i+" ");
        }
    }
    public static void ars(int a[],int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    ars(a,j,j+1);
                }
            }
        }
        arrp(a);
    }
}
