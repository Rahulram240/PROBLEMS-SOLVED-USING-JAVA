import java.util.Scanner;
public class Square_root_using_Binary_Search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.err.println("Square root of the number is "+sqr(n));
    }
    public static int sqr(int n){
        int r=0;
        if(n==0 || n==1){
            return n;
        }
        int s=2,l=n/2;
            while (s<=l) {
                int m=s+(l-s)/2;
                if(m*m==n){
                    return m;
                }
                else if(m*m<n){
                    s=m+1;
                    r=m;//We've to update the result because it might be the correct answer
                }
                else{
                    l=m-1;
                }
                r=m;
            }
        return r;
    }
}
