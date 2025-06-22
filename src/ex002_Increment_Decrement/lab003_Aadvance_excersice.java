package ex002_Increment_Decrement;

public class lab003_Aadvance_excersice {
    public static void main(String[] args) {

        int a =10;
        int b = 12;

        //Increment
        System.out.println(a++ + ++a);//10 >>11>>12==10+12
        System.out.println(++a + ++a); //11 >>12== 11+12


        //Decrement
        System.out.println(b-- + b); //12>>11>>11=12+11

    }
}
