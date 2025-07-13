package ex_025_Exception;

public class lab001_Unchecked_Exception {
    public static void main(String[] args) {
        System.out.println("Starting the Aplication....!");
        String int_a= args[0];
        Integer a = Integer.parseInt(int_a);
        Integer Operation = 100/a; // it will give index out of bound exception (run time exception Unchecked exception)
        System.out.println(Operation);
        System.out.println("Ending the Aplication....!");

    }
}
