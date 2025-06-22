package ex002_Increment_Decrement;

public class lab008_interview {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a; //12

        System.out.println("a: " + a); // Output: ?

        System.out.println("b: " + b); // Output: ?



        int x = 5;

        int y = x++ + ++x + x++ + ++x; //5+7+7+9=28

        System.out.println("x = " + x + ", y = " + y); //9 28

        int w = 5;

        int v = w++ + ++w + w++ + ++w; //5+6+6+7=24

        System.out.println("w = " + w + ", v = " + v); //9  28




    }
}
