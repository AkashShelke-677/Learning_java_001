package ex004_Ternory_Operator;
/*It is Used when we have multiple condition
Example :
 result = condition1? expression1 :(condition2? expression2:expression3)
 */
public class lab004_Nested_ternoryOperator {
    public static void main(String[] args) {

        int age = 77;
       //  Find age is in which category ( Minor(<18), Adult(18>65), Old>65)

        String result = age < 18? "Minor":(age<65? "Adult": "Old");
        System.out.println("Age is in "+ result);


    }
}
