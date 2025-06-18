package Test01;

public class Increment_Decrement {
    public static void main(String[] args) {
        int number = 5;

        // Original value
        System.out.println("Original: " + number);

        // Pre-increment: increment first, then use
        int preIncrement = ++number;
        System.out.println("Pre-increment: " + preIncrement); // Should print 6

        // Post-increment: use first, then increment
        int postIncrement = number++;
        System.out.println("Post-increment: " + postIncrement + " (number now: " + number + ")");

        // Pre-decrement: decrement first, then use
        int preDecrement = --number;
        System.out.println("Pre-decrement: " + preDecrement); // Should print 5

        // Post-decrement: use first, then decrement
        int postDecrement = number--;
        System.out.println("Post-decrement: " + postDecrement + " (number now: " + number + ")");
    }
}
