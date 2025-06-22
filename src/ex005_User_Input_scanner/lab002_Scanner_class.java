package ex005_User_Input_scanner;

import java.util.Scanner;

public class lab002_Scanner_class {
    public static void main(String[] args) {
// Scanner is class available in util folder, it is inbuild class
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = sc.nextInt(); //nextInt is function which take only integer
        String name = sc.next(); // next for string

        String Can_I_Vote = age>= 18? "YES":"NO";
        System.out.println(Can_I_Vote);
    }
}
