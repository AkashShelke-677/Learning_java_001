package Function;

import java.util.Scanner;

public class lab005_Function_Arthmatic_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a");
        int a = 0;
        // By using hasNextInt validating the value is integer and handling the edge case
        if(sc.hasNextInt()){
           a= sc.nextInt();
        }else {
            System.out.println("Enter the valid input");
            return;
        }
        System.out.println("Enter value for b");
        int b =0;
        if (sc.hasNextInt()){
            b=sc.nextInt();
        }else {
            System.out.println("Enter the valid input");
            return;
        }


        int res = sum_of2(a,b);
        System.out.println(res);

        int div=div_of2(a,b);
        System.out.println(div);

    }

    static int sum_of2(int a, int b){
        return a+b;
    }
    static int div_of2 (int a, int b){
        if(b==0){
            // using throw throwing mathematical exception
            throw new ArithmeticException("B cant be zero");
        }
        return a/b;
    }

}
