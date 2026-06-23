import java.util.Scanner;
public class Trailing_zeros_of_a_fac {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.print("Enter the num to find the trailing zeros of the factorial of that number =");
        int n=s.nextInt();
        int r=0;
        while(n>=5){
            r=r+(n/5);
            n/=5;
        }
        System.err.println("The result is "+r);
    }
}
