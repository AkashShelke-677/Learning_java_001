package Test01;

public class Comparison_logical {
    public static void main(String[] args) {
        // Declare and initialize two integers
        int a = 10;
        int b = 5;

        // Comparison operators
        System.out.println("a == b: " + (a == b));     // Checks if a is equal to b
        System.out.println("a != b: " + (a != b));     // Checks if a is not equal to b
        System.out.println("a > b: " + (a > b));       // Checks if a is greater than b
        System.out.println("a < b: " + (a < b));       // Checks if a is less than b
        System.out.println("a >= b: " + (a >= b));     // Checks if a is greater than or equal to b
        System.out.println("a <= b: " + (a <= b));     // Checks if a is less than or equal to b

        // Logical operators
        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));  // true if both conditions are true
        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));  // true if at least one condition is true
        System.out.println("!(a > b): " + (!(a > b)));                      // negates the result of a > b
    }
}
