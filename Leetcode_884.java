import java.util.*;
public class Leetcode_884 {
    public static void getuncommonWords(String s1,String s2){
        Map<String,Integer> m = new HashMap<>();
        for(String r:(s1+" "+s2).split(" ")){
            m.put(r,m.getOrDefault(r,0)+1);
        }
        List<String> l=new ArrayList<>();
        // for(String r:m.keySet()){
        //     if(m.get(r)==1){
        //         l.add(r);
        //     }
        // }
        for(Map.Entry<String,Integer> e:m.entrySet()){
            if(e.getValue()==1){
                l.add(e.getKey());
            }
        }
        System.out.print(l);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.print("Enter the String 1 =");
        String s1=s.nextLine();
        System.err.print("Enter the String 2 =");
        String s2=s.nextLine();
        getuncommonWords(s1,s2);
    }
}
