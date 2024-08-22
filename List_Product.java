import java.util.*;
public class List_Product {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        System.err.print("Enter the Size of list = ");
        int n=s.nextInt();
        System.err.print("Enter the elements = ");
        for(int i=0;i<n;i++){
            l.add(s.nextInt());
        }
        System.err.println("The elements are ");
        for(int i:l){
            System.err.print(i+" ");
        }
        System.err.println();
        if(res(l)>0){
            System.err.println("The result is "+res(l));
        }
        else{
            System.err.println("Its odd");
        }
    }
    public static int res(List<Integer> l){
        boolean f=false;
        int s=0;
        for(int i:l){
            s+=i;
            if(i%2==0){
                f=true;
            }
        }
        return f ? s:0;
    }
}
