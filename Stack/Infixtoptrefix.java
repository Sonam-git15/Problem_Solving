import java.util.Stack;

public class Infixtoptrefix {

    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println("Infix Exp. is : " + infix);

        Stack<String> val = new Stack<>();
        Stack<Character> opt = new Stack<>();
        for(int i = 0; i < infix.length(); i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                String s = "" + ch;
                val.push(s);
            }
            
            else if(opt.isEmpty()  || ch == '(' || opt.peek() == '(') opt.push(ch);
            
            else if(ch == ')'){
                while (opt.peek() != '(') {
                String v2 = val.pop();
                String v1 = val.pop();
                char op = opt.pop();
                String t = op + v1 + v2;
                val.push(t);
                }
                opt.pop();  // '(' remove that
            }
            else {
                if(ch == '+' || ch == '-') {
                    // work
                String v2 = val.pop();
                String v1 = val.pop();
                char op = opt.pop();
                String t = op + v1 + v2;
                val.push(t);
                opt.push(ch);
                }
                
                else if(!opt.isEmpty() &&  (ch == '*' || ch == '/')) {

                    if(opt.peek() == '*' || opt.peek() == '/'){
                           //work 
                           String v2 = val.pop();
                           String v1 = val.pop();
                           char op = opt.pop();
                           String t = op + v1 + v2;
                           val.push(t);
                           opt.push(ch);
                    }
                    else  opt.push(ch);

                }
            }
        }
        // val stack size = 1
        while (val.size() > 1) {
            String v2 = val.pop();
                String v1 = val.pop();
                char op = opt.pop();
                String t = op + v1 + v2;
                val.push(t);
        }
        String prefix = val.pop();
        System.out.println("Prefix Exp. is: " + prefix);
    }
    
}

