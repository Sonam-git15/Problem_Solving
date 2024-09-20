package Strings;

import java.util.Scanner;

public class String_Palindrom {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(isPalindrom(str));

        in.close();
    }

    static boolean isPalindrom(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0; i<=str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
    
}
