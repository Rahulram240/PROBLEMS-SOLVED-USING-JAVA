import java.util.*;
public class Snake_pattern_without_matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.err.printf("%4d",++x);
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.err.printf("%4d",x--);
                }
            }
            x+=n;
            System.err.println();
        }
    }
}
