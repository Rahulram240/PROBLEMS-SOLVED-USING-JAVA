import java.util.*;
public class Longest_Number_In_the_String_Array{
    public static int getB(String a[]){
        int max = 0 ;
        for(String i:a){
            String res[]=i.split("_");
            max = Math.max(max,Integer.valueOf(res[1]));
            //max = Math.max(max,Integer.parseInt(res[1]));
        }
        return max;
    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in); 
       System.err.print("Enter the array size = ");
       int n = s.nextInt();
       String a[]=new String[n];
       for(int i=0;i<n;i++){
        a[i]=s.next();
       }
       System.err.println("\nThe Strings in the array were ");
       for(String i:a){
        System.err.print(i+" ");
       }
       int res = getB(a);
       System.err.println("\nThe maximum value is "+res);
    }
}
