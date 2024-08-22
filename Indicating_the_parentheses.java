import java.util.Scanner;
import java.util.Stack;
public class Indicating_the_parentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        Stack<Integer> st = new Stack<>();
        int go = 0;

        for(char c:str.toCharArray()){
            if(c=='('){
                st.push(++go);
                System.out.print(go+" ");
            }
            else{
                System.out.print(st.pop()+" ");
            }
        }
    }
}
