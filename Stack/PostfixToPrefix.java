import java.util.Stack;

public class PostfixToPrefix {
    
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        Stack<String> val = new Stack<>();
         
        for(int i = 0; i < postfix.length() ; i++){
        char ch = postfix.charAt(i);
        if(Character.isDigit(ch))  val.push(ch + ""); // Character.toString(ch)
           
        else {
            String v2 = val.pop();
            String v1 = val.pop();
            String t = ch + v1 + v2;
            val.push(t);
        }
        }
        System.out.println(val.peek());
    }
}
