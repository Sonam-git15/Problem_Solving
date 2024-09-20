package Strings;

public class Sub_String {

    public static String substring(String str, int SI, int EI){
        String substr = "";
        for(int i = SI; i < EI; i++){
            substr += str.charAt(i); 
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        
        // Print substring in a single line
        System.out.println(str.substring(4, 8));

        System.out.println(substring(str, 0, 5));
    }
    
}
