import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Finding_Anagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        int m=s.length(),n=p.length();
        List<Integer> a=new ArrayList<>();
        if(m<n){
            return a;
        }
        int c1[]=new int[26];
        int c2[]=new int[26];
        for(int i=0;i<n;i++){
            c1[p.charAt(i)-'a']++;
        }
        for(int c:c1){
            System.err.print(c+" ");
        }
        System.err.println("\n\n");
        for(int i=0;i<n-1;i++){
            c2[s.charAt(i)-'a']++;
        }
        for(int i=n-1;i<m;i++){
            c2[s.charAt(i)-'a']++;
            for(int z:c2){
                System.err.print(z+" ");
            }
            if(Arrays.equals(c1,c2)){
                a.add(i-n+1);
                System.err.print(" <-Its was same");
            }
            System.out.println();
            c2[s.charAt(i-n+1)-'a']--;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.print("Enter the Main String = ");
        String u=s.next();
        System.err.print("Enter the Substring = ");
        String p=s.next();
        List <Integer> r=new ArrayList<>();
        r=findAnagrams(u,p);
        System.err.println(r);
    }
}
