package Programming_Tasks;

import java.util.Scanner;

public class Task_program {

   /* **Triangle Classifier:
   * **Write a program that classifies a triangle based on its side lengths.
    Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
    isosceles (exactly two sides are equal), or scalene (no sides are equal).
    Use an if-else statement to classify the triangle.
    */

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value for a");
        int a = sc.nextInt();

        System.out.println("Enter the value for a");
        int b= sc.nextInt();

        System.out.println("Enter the value for a");
        int c = sc.nextInt();

        if (a==b && b==c){
            System.out.println("triangle is equilateral");
        }
        else if (a == b || b==c || c==a){
            System.out.println("triangle is isosceles");
        }
        else {
            System.out.println("triangle is scalene");
        }

    }
}
