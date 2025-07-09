package ex013_Array;

import java.util.Scanner;

public class Interview_Multiplication_table_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
      int n = sc.nextInt(); // Size of table
        for (int i = 0; i< n;i++){
            for (int j = 0; j<n; j++){
                System.out.print(i*j);
            }
            System.out.println();
        }
    }
}
