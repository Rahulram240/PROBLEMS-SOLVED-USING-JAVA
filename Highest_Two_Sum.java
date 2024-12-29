import java.util.Scanner;
public class Highest_Two_Sum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.err.print("\nEnter the size of the array = ");
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = 1+(int)(Math.random()*10);
        }
        System.err.print("The elements are : ");
        for(int i:a){
            System.err.print(i+" ");
        }
        System.err.println("The product of the highest two are "+HT(a));
    }
    public static int HT(int a[]){
        int m1 = Integer.MIN_VALUE,m2 = Integer.MIN_VALUE,res=0;
        for(int i:a){
            if(i>m1){
                m2 = m1;
                m1 = i;
            }
            else if(i>m2){
                m2 = i;
            }
        }
        res = (m1)*(m2);
        System.err.println("\nThe maximum no's are "+m1+" "+m2);
        return res;
    }
}