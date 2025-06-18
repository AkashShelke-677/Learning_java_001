package Programming_Tasks;

import java.util.Scanner;

public class Factorial_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        if(!sc.hasNextInt()){
            System.out.println("Please enter valid value");
            return;
        }

        int num = sc.nextInt();

        int fact= 1;

        if(num<=0){
            System.out.println("Factorial");
        }
        else {
            for(int i = 1; i<=num; i++){
                fact = fact* i;
            }
        }
        System.out.println(fact);
    }
}
