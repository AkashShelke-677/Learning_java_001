package ex003_Typ_Casting;


//Typecasting in Division
//Description: int a = 10, int b = 3; now divide 10/3 and store the decimal value in the Result variable and print it.
public class Task_typecasingInDivision {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = (a/b); // implicit widening
        float d = (float)c; // explicit widening

        System.out.println(c);
        System.out.println(d);

    }
}
