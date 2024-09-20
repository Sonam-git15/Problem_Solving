import java.util.Stack;

public class InfixtoPrefix1 {

    public static int getPrecedence(char optr){
        if(optr == '+' || optr == '-') return 1;
        if(optr == '*' || optr == '/') return 2;
        if(optr == '^') return 3;
        return 0;
    }
    public static boolean isOperater(char ch){
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }

    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6^2";
        System.out.println("Infix Exp. is : " + infix);
        Stack<String> val = new Stack<>();
        Stack<Character> optr = new Stack<>();

        for(int i = 0; i < infix.length(); i++){
            char ch = infix.charAt(i);

            if(Character.isDigit(ch))  val.push(Character.toString(ch));
            else if(ch ==  '(') optr.push(ch);

            else if(ch == ')') {
                while(optr.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char op = optr.pop();
                    String t =  op + v1 + v2;
                    val.push(t);
            }
            optr.pop(); // pop '(' from stack
            }

            else if(isOperater(ch)){
                while (!optr.isEmpty() && getPrecedence(optr.peek()) >= getPrecedence(ch)) {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char op = optr.pop();
                    String t =  op + v1 + v2;
                    val.push(t);
                }
                optr.push(ch);
            }
        }

        while (!optr.isEmpty()) {
                String v2 = val.pop();
                String v1 = val.pop();
                char op = optr.pop();
                String t =  op + v1 + v2;
                val.push(t);
        }

        String prefix = val.pop();
        System.out.println("Prefix Exp. is : " + prefix); 
   }
}

