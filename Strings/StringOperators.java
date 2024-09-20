package Strings;

import java.util.ArrayList;

public class StringOperators {

    public static void main(String[] args) {
        //Add this ASCII values
        System.out.println('a' + 'b');

        // Simply Concatinate
        System.out.println("a" + "b");

        //Use ASCII Sum
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));

        //integer will be converted to Integer that  will call toString()
        System.out.println("a" + 1);

        //Integer will be converted to Integer that will call toString()
        System.out.println("Sonam" + new ArrayList<>());
        System.out.println("Sonam" + new Integer(56));

        
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);


    }
    
}
