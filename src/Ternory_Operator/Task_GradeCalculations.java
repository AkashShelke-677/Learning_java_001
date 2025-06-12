package Ternory_Operator;

public class Task_GradeCalculations {

    // Grade Calculation Using Nested Ternary
    // Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
    public static void main(String[] args) {
        //Rough Logic
        /*
        Fail = below 40
        C = 40
        B = 41 - 60
        A = 61 - 75
        A+ = 76 - 90
        O = Above 95
         */

        int marks = 89;

        String Grade = (marks < 40) ? "Fail" : (marks <= 40) ? "C" : (marks <= 60) ? "B" : (marks <= 75) ? "A" : (marks <= 90) ? "A+": "O";
        System.out.println("The grade is"+ Grade);

    }
}
