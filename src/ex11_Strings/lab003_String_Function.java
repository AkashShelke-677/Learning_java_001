package ex11_Strings;

import java.sql.SQLOutput;

public class lab003_String_Function {
    public static void main(String[] args) {

        String name = "Ak@sh";
        System.out.println(name.length()); // gives the length of the string
        System.out.println(name.charAt(4)); //gives the charter present in index
        System.out.println(name.concat("_Shelke")); // join in the end
        System.out.println(name.contains("sh")); //check the character is available in string or not
        System.out.println(name.equals("Ak@sh")); // checking value is same or not
        System.out.println(name.equalsIgnoreCase("ak@sh")); //ignore the case-sensitive and check the value is same or not
        System.out.println(name.indexOf("a")); // gives the index number for 1st matching
        System.out.println(name.replace("k","ak")); // it will replace the Stargate character

        String q = "HELLO";
        String s2 = q.toLowerCase(); // "hello" Converts all characters to lowercase.
        System.out.println(s2);

        String s = "hello";
        String s3 = s.toUpperCase(); // "HELLO"  Converts all characters to Uppercase
        System.out.println(s3);


        String name_ = "Akash@Shelke";
        String  [] split_name= (name_.split("S")); //cut the string array only from regix and store in index
        System.out.println(split_name[0]);
        System.out.println(split_name[1]);

        String roar = "I a the KING Warriar";
        System.out.println(roar.length());
        String extract = roar.substring(4,12); // it will extract the string from index 3 and ends with index (12-1)
        System.out.println(extract);

        //Concatination By" +"
        String S1 = "name";
        String S2 = "_Sirname";
        String res1= S1+S2;
        System.out.println(res1);

        String A = "  Hello  ";
        String B= A.trim(); // it will remove the space from string
        System.out.println(B);

        int i = 674;
        String s4 = String.valueOf(i); // return the int or long argument Convert value to string
        System.out.println(s4);


        String d = "ABCDEF";
        char [] arr= d.toCharArray(); // Converts the string to a new character array.













    }
}
