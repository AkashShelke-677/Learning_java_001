package ex11_Strings;

public class lab002_Strings {
    public static void main(String[] args) {
        String s1 ="Akash";  // Directly creating this will store in String consatnt pool area
        String s2 = new String("Bhumika"); //using new keyword this will store in Object area
        System.out.println(s1);
        System.out.println(s2);


    }
}
