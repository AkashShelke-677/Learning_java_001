package ex006_Switch_Statements;

import java.util.Scanner;

public class lab001_switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day 1 to 6");
        int day = sc.nextInt();

        switch (day){

            case 1:
                System.out.println();
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednsday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not allowed");
                break;


        }

    }
}
