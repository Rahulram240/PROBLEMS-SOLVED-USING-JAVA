import java.util.Scanner;
public class Leetcode_2379 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.print("Enter the String (CONSISTS OF 'W' AND 'B' ONLY)= ");
        String str = s.next();
        System.err.print("Enter a number while is less than length of the String = ");
        int n = s.nextInt();
        int res = mrb(str,n);
        System.err.println("The result returns the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks and it is "+res);
    }
    public static int mrb(String s,int k){
        int n = s.length();
        int res=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int m = 0;
            for(int j=i;j<i+k;j++){
                if(s.charAt(j)=='W'){
                    m++;
                }
            }
            res = Math.min(res, m);
        }
        return res;
    }
}
