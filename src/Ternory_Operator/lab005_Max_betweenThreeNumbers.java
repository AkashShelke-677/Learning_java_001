package Ternory_Operator;

public class lab005_Max_betweenThreeNumbers {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 22;
        int n3 = -25;

        //Find the max number

        int Max = (n1 > n2)? (n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println(Max);
          /*
          max = (n1>n2)?A:B
          A : n1>n3?n1:n3
          B : n2>n3?n2:n3

           */

    }
}
