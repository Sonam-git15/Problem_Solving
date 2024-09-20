import java.util.Stack;

public class Prefix_Eval {

    public static int applyOperator(int v1, char ch, int v2) {
        switch (ch) {
            case '+': return v1 + v2;
            case '-': return v1 - v2;
            case '*': return v1 * v2;
            case '/': return v1 / v2;
            default: return 0;
        }
    }

    public static boolean isOperater(char ch){
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }
    
    public static void main(String[] args) {
        String Exp = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for(int i = Exp.length() - 1; i >= 0 ; i--){
            char ch = Exp.charAt(i);

            if(Character.isDigit(ch)) val.push(ch - '0');
            
            else if(isOperater(ch)){
                    int v1 = val.pop();
                    int v2 = val.pop();
                    val.push(applyOperator(v1, ch, v2));
            }
        }
        System.out.println(val.pop());
    }
}

