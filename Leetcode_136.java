import java.util.*;
public class Leetcode_136{
    public static int singlenumber(int a[],int n){
        int r = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i:a){
            if(hs.contains(i)){
                hs.remove(i);
            }
            else{
                hs.add(i);
            }
        }
        for(int i:hs){
            r+=i;
        }
        return r;
    }
        public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int n = s.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            int r = singlenumber(a,n);
            System.err.println(r+" is the Single");
        }
}