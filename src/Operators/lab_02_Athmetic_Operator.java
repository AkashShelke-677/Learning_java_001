package Operators;

import java.net.StandardSocketOptions;

public class lab_02_Athmetic_Operator {
    public static void main(String[] args) {

        int a = 22;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);

        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println(a%b);

        //the o/p of these will be "a+b=14, a-b=6, bcz these are not in double quotes and are not considered as string

//here the values are in integers, so the o/p will be in integers

        System.out.println("a+b");
        System.out.println("a-b");
        System.out.println("a*b");
//the o/p of these will be "a+b, a-b, bcz these are in string format - Double qoutes

        float c=12.1f;
        float d=7.0f;
        int e=5;

        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*e);
        System.out.println(c/d);
        System.out.println(c%d);


    }

}
