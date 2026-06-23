import java.util.*;
public class AMAZON_Q{
    public static int ques1(List<Integer> l1,List<Integer> l2){
        int res=0;
        if(l1.size()!=l2.size()){
            return 0;
        }
        for(int i=0;i<l1.size();i++){
            int z = Math.abs(l2.get(i) - l1.get(i));
            res += z;
        }
        return res;
    }
    public static int ques2(List<Integer> l1){
        int res=0;
        Collections.sort(l1);
        //System.err.println("The resultant array used is "+l1);
        int a[] = new int[l1.size()];
        for(int i=0;i<a.length;i++){
            a[i] = l1.get(i);
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j] % a[i] == 0){
                    a[j] = a[i];
                }
            }
        }
        for(int i:a){
            res+=i;
        }
        return res;
    }
    public static void main(String[] ar){
        Scanner s = new Scanner(System.in);
        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            l1.add(1+(int)(Math.random()*10));
            l2.add(1+(int)(Math.random()*10));
        }
        System.err.println("The elements of the first array:");
        l1.forEach((x) -> System.err.print(x+" "));
        System.err.println();
        System.err.println("The elements of the Second array:");
        l2.forEach((x) -> System.err.print(x+" "));
        int res1 = ques1(l1,l2);
        System.err.println("\n\nFor the Ist Question "+res1);
        int res2 = ques2(l1);
        System.err.println("For the IInd Question "+res2);
    }
}