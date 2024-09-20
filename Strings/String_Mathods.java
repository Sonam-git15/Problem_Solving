package Strings;

import java.util.Arrays;

public class String_Mathods {

    public static void main(String[] args) {
        String name = "Sonam Rai Hello";
        // Print every Characters
        System.out.println(Arrays.toString(name.toCharArray()));
        
        //Orignal
        System.out.println(name);

        // convert in Lowercase
       System.out.println( name.toLowerCase());

       // convert in UpperCase
       System.out.println(name.toUpperCase());

       // Print index of particular character
       System.out.println(name.indexOf('R'));

       //Remove extra Space
       System.out.println("        Sonam     ");
       System.out.println("      Sonam    ".strip());

       // Split String
       System.out.println(Arrays.toString(name.split(" ")));
    }
    
}
