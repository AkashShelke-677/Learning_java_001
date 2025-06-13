package User_Input;

import java.util.Scanner;

public class lab002_Scanner_class {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = sc.nextInt();

        String Can_I_Vote = age>= 18? "YES":"NO";
        System.out.println(Can_I_Vote);
    }
}
