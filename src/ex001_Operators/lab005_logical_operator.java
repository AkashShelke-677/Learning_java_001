package ex001_Operators;

public class lab005_logical_operator {

    public static void main(String[] args) {
        boolean a= true;
        boolean b= false;

        boolean b1= a&&b;
        System.out.println(b1);

        boolean b2= a||b;
        System.out.println(b2);

        System.out.println(!!a);

    }
}
