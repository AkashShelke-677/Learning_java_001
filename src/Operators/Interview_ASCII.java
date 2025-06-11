package Operators;

public class Interview_ASCII {
    public static void main(String[] args) {
        char a='A';
        char b='B';
// charecters are always intergers
        // Its takes the ASCII values
        //A-- 65
        // B-- 66
        System.out.println(a+b);


        // What is output for below statement
        System.out.println('A'==65);
        System.out.println(!!('A'==65));
        System.out.println(!('A'==65));


        char c= 'A';
        String s= "A";
        System.out.println(c+c);
        System.out.println(c+s);
    }
}
