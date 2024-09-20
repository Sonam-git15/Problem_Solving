package Strings;

import java.util.Scanner;
public class String_Palin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String inputString = scanner.nextLine();
        scanner.close();
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " Is a palindrome.");
        } else {
            System.out.println(inputString + " Is not a palindrome.");
        } }
    public static boolean isPalindrome(String inputString) {
        int length = inputString.length();
        for (int i=0; i<length/2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length-i - 1)) {
                return false;
            } }
        return true;
    }  }