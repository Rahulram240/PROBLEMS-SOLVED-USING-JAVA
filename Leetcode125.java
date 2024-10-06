import java.util.*;
public class Leetcode125{
    public static boolean validp(String s){
       StringBuilder res = new StringBuilder();
       for(char c:s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            res.append(Character.toLowerCase(c));
        }
       }
       String r1 = res.toString();
       String r2 = res.reverse().toString();
       if(r1.equals(r2)){
        return true;
       }
       return false;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str = s.nextLine();
        System.err.println("The String is -->"+str);
        Boolean res = validp(str);
        System.err.println("The result is "+res);
    }
}
