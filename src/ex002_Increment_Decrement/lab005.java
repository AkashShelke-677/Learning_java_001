package ex002_Increment_Decrement;

public class lab005 {
    public static void main(String[] args) {
        int i = 1;

        i = i++ + ++i;

        System.out.println(i); // 2+2
    }
}
