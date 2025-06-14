package Ternory_Operator;


/**
 * Ternary Operators: it is conditional operator, very similar to if-else.
 *  Syntax - Result =  Condition? expression1: expression 2
 *      Condition : Boolean expression that is evaluated
 *      expression 1 - this executes when condition is true
 *      expression 2 - this executes when condition is false
 *  ex - variable = expression1? expression2: expression3
 *      (if expression1 is true then expression2 will print OR if expression1 is false then expression3 will print)
 */
public class lab001_ternoryOperator {
    public static void main(String[] args) {
         int age = -18;
         String Can_I_Vote = (age<0) ? "invalid age":(age>= 18)? "YES":"NO";
         System.out.println(Can_I_Vote);
    }
    
}
