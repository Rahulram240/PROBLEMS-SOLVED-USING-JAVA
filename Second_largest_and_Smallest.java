import java.util.*;
public class Second_largest_and_Smallest {
    public static void seclandsecs(int a[]){
        TreeSet<Integer> tr = new TreeSet<>();
        for(int i:a){
            tr.add(i);
        }
        System.err.println("Now the sorted was ");
        for(int i:tr){
            System.err.print(i+" ");
        }
        int e[] = tr.stream().mapToInt(Integer::intValue).toArray();
        int secg = e[e.length-2];
        int secl = e[1];
        System.err.println();
        System.err.println("Second greatest = "+secg+"\n"+"Second Lowest =  "+secl);
    }
    public static void main(String[] args) {
        int n = (int)(Math.random()*10);
        System.err.println("\nThe size of the array = "+n);
        int a[] = new int[n];
        if(n<=2){
            return;
        }
        for(int i=0;i<n;i++){
            a[i] = 1+(int)(Math.random()*10);
        }
        System.err.println("\nThe array elements are :");
        for(int i:a){
            System.err.print(i+" ");
        }
        System.err.println();
        seclandsecs(a);
    }
}
