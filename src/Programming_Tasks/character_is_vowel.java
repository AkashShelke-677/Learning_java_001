package Programming_Tasks;

import java.util.Scanner;

public class character_is_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().toLowerCase().charAt(0);

        /*
        if (ch=='a'||ch =='e'||ch =='i'||ch=='o'||ch=='u'){
            System.out.println(ch + " Character is vowel");
        } else if (ch >='a'&& ch<= 'z') {
            System.out.println(ch + " Character is Consonant");
        } else {
            System.out.println(ch + " is Invalid ");
        }
        */

        switch (ch){
            case 'a','e','i','o','u' : System.out.println("Is Vowel");
            break;
            default: System.out.println("Is Consonant");
            break;
        }

    }
}
