import java.util.Stack;

public class InfixExp1 {

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character is a digit, push it to val stack
            if (Character.isDigit(ch)) {
                val.push(ch - '0');  // Convert character to integer
            }
            // If it's an opening parenthesis, push it to op stack
            else if (ch == '(') {
                op.push(ch);
            }
            // If it's a closing parenthesis, evaluate until we find the matching '('
            else if (ch == ')') {
                while (op.peek() != '(') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();
                    val.push(applyOperator(v1, v2, operator));
                }
                op.pop(); // Pop the '('
            }
            // If it's an operator
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // While precedence of the current operator is less than or equal to the operator on top of the stack, evaluate the top
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();
                    val.push(applyOperator(v1, v2, operator));
                }
                // Push the current operator to the op stack
                op.push(ch);
            }
        }

        // Final evaluation for remaining operators in the stack
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();
            val.push(applyOperator(v1, v2, operator));
        }

        // The final result is the last value in the val stack
        System.out.println(val.peek());
    }

    // Function to determine precedence of operators
    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    // Function to apply an operator to two values
    public static int applyOperator(int v1, int v2, char op) {
        switch (op) {
            case '+': return v1 + v2;
            case '-': return v1 - v2;
            case '*': return v1 * v2;
            case '/': return v1 / v2;
            default: return 0;
        }
    }
}
