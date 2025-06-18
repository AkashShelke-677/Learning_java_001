package Test01;

public class Casting {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;

        // Operator precedence: *, /, % have higher precedence than + and -
        int expressionResult = a + 2 * 5 + 3; // Evaluated as: 10 + (2*5) + 3 = 10 + 10 + 3 = 23
        System.out.println("Expression result: " + expressionResult);

        // Implicit casting (widening conversion): int to double
        double implicitCastingResult = a + b; // a (int) is implicitly cast to double
        System.out.println("Implicit casting (int + double): " + implicitCastingResult); // 10 + 3.5 = 13.5

        // Explicit casting (narrowing conversion): double to int
        int explicitCastingResult = (int)(a + b); // total is cast from double to int (fraction lost)
        System.out.println("Explicit casting (int): " + explicitCastingResult); // 13.5 → 13
    }
}
