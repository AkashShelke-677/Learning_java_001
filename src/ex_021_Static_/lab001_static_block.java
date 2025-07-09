package ex_021_Static_;

public class lab001_static_block {

    public static void main(String[] args) {
        B a= new B();  // when class is load then static block will execute
    }

}

class B{


    //Static block
    B() {

        // this is static block
        // it will call whenever class is loaded
        // Can not create multiple static block
        System.out.println("Static block 1 executed");

    }

}