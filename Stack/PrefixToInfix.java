import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String postfix = "-9/*+5346";
        Stack<String> val = new Stack<>();
         
        for(int i = postfix.length()-1; i >= 0; i--){
        char ch = postfix.charAt(i);
        if(Character.isDigit(ch))  val.push(ch + ""); // Character.toString(ch)
           
        else {
            String v1 = val.pop();
            String v2 = val.pop();
            String t = '(' + v1 + ch + v2  + ')';
            val.push(t);
        }
        }
        System.out.println(val.peek());
    }
    
}
