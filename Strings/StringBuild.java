package Strings;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        
        //Insert 
        sb.insert(3, 'n');
          System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

          //Insert
          sb.insert(0, 'S');
          System.out.println(sb);

        //set char at index 1
        sb.setCharAt(1, 'P');
        System.out.println(sb);

        //Delete the extra 'n'
        sb.delete(3, 5);
        System.out.println(sb);
    }   
}
