import java.util.Scanner;
public class REMOVE_PALINDROME_FROM_STRING {
    public static boolean pa(String s){
        String w=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            if(w.charAt(i)!=w.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder();
        String st[]=str.split("\\s+");
        for(String i:st){
            if(!pa(i)){
                sb.append(i).append(" ");
            }
        }
        System.err.println(sb.toString());
    }
}
