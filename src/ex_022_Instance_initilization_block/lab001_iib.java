package ex_022_Instance_initilization_block;

public class lab001_iib {

    public static void main(String[] args) {
        A a= new A();
    }
}

class A{
    A(){
    System.out.println("Default constructor");
    }
    {
        //initialization block means The block without name
        // it will call when class object is created
        // We can create multiple IIB
        System.out.println("Instance Initialization block executed");
    }
}
