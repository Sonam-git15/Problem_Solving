package Strings;

public class StringPerformance {

    public static void main(String[] args) {
        String series =  "";
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            System.out.print(ch + " ");
           
            series += ch;
        }
        System.out.println();
        System.out.println(series);
    }
    
}
