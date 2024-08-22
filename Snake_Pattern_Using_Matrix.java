import java.util.Scanner;
public class Snake_Mat {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][n];
        int x=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    a[i][j]=x++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    a[i][j]=x++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.err.print(a[i][j]+" ");
            }
            System.err.println();
        }
    }
}
