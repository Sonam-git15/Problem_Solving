package Strings;

public class StringCompare {
    public static void main(String[] args) {
        //Compare
        String name1 = "Tony";
        String name2 = "Tony2";

        //1 s1 > s2 : +ve value
        //2 s1 = s2 : 0
        //3 s1 < s2 : -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("String are equal");

        }
        else{
            System.out.println("String are not equal");
        }
    }
    
}
