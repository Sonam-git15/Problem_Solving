package Strings;

public class StringReverse {
    public static void main(String[] args) {
         StringBuilder sb=new StringBuilder("HELLO");
         System.out.println("String is : " + sb);
         for(int i=0; i<sb.length()/2; i++)
         {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 = > 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
            
         }
         System.out.println("Reverse String is : " + sb);
    }
    
}
