package ex_021_Static_;

public class lab002_Static_variables {
    public static void main(String[] args) {
        A ref1 = new A(10);
        A ref2 = new A(11);

        System.out.println(ref1.a);
        System.out.println(A.b);

        ref1.display();
        ref1.value();

        A.display(); // Static method can call direct


    }



}

class A{

    int a ; // Non static variable
    static int b = 20; // Static variable = shared betw object

    A(int a){
        this.a =a;
    }

    void value(){
        System.out.println();
    }

    static void display(){
        System.out.println("Static method called when class is loaded");
       // System.out.println(this.a); // static method can nt access the non-static variables or members

    }
}