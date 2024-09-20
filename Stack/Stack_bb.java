import java.util.Scanner;
import java.util.Stack; // Import the Stack class

public class Stack_bb {

    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n =  str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            } else if (ch == ')') {
                if(st.isEmpty()) return false;
                if(st.peek() == '(') st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(isBalanced(str));

        in.close();
    }
}
