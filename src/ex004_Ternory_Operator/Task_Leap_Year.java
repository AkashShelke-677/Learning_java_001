package ex004_Ternory_Operator;

import java.util.Scanner;

public class Task_Leap_Year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year = ");

        int year = sc.nextInt();
        String leap = (year% 4 ==0 && year % 100 !=0 || year % 400 ==0)? "Year is Leap Year": "Year is not leap year";
        System.out.println(leap);
    }
}
