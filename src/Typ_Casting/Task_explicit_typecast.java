package Typ_Casting;

//Explicit Typecasting (Narrowing)
//Description: Casts a double to an int, cutting off decimals value.

public class Task_explicit_typecast {
    public static void main(String[] args) {
        double x = 12.06;
        int b = (int)x;
        System.out.println(b);
    }

}
