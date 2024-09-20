import java.util.Stack;

public class PrefixToPostfix {

    // public static boolean isOperater(char ch){
    //     return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    // }
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        Stack<String> val = new Stack<>();
         
        for(int i =  prefix.length()-1; i >= 0; i--){
        char ch = prefix.charAt(i);
        if(Character.isDigit(ch))  val.push(ch + ""); // Character.toString(ch)
           
        else {
            String v1 = val.pop();
            String v2 = val.pop();
            String t = v1 + v2 + ch;
            val.push(t);
        }
        }
        System.out.println(val.peek());
    }  
}
