import java.util.Scanner;
import java.util.Stack;
class Valid_parentheses{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        Stack<Character> st = new Stack<>();
        for(char c:str.toCharArray()){
            if(c=='('){
                st.push(c);
            }
            else{
                if(st.isEmpty() || st.pop()!='('){
                    System.err.println("Its Invalid");
                    return;
                }
            }
        }
        if(st.isEmpty()){
            System.err.println("Its Valid");
        }
        else{
            System.err.println("Its Invalid");
        }
}
}