import java.util.Scanner;
public class Latin_Sqr{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        char re='A';
        char a[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=(char)(re+(i+j)%n);
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