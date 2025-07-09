package ex013_Array;

import java.util.Scanner;

public class interview_star_pattern {
    public static void main(String[] args) {

        // right angle trangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        for (int i=0; i<n;i++){
            for(int j =0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // left angle trangle
        System.out.println("Enter the num");
        int num = sc.nextInt();
        for (int i = num; i >=1; i--) {
            for (int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        };

    }
}
