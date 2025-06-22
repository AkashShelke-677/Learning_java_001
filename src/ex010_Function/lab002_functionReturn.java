package ex010_Function;

public class lab002_functionReturn {

    // function with no return
    static void No_return(){
        System.out.println("This function not return");
    }

    //function wih with return
    static int return_fun(){
    System.out.println("This function return int");
    return 10;
    }

    //function with boolean return
    static boolean return_boolean(){
        System.out.println("This function return boolean");
        return true;
    }

    public static void main(String[] args) {
        No_return();
        return_fun();
        return_boolean();
    }
}
