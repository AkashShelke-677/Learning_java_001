package Function;

public class lab004_Function_types {

    public static void main(String[] args) {
        //1
        WP_WR_greet();
        //2
        String msg = WP_wr_greeting_hello();
        System.out.println(msg);
        //3
        wp_WR_employeeDetail("Akash", 28, 52);

        //4
        int sum2= wp_wr_sum_of_2(55,78);
        System.out.println(sum2);

    }
    //1. without parameter without return
    static void WP_WR_greet(){
    System.out.println("Hello");
    }

    //2. without parameter with return
    static String WP_wr_greeting_hello(){
        System.out.println("Hey");
        return "Hi How are you ?";
    }
    //3.  with parameter without return
    static void wp_WR_employeeDetail(String name, int age, double salary){
        System.out.println("employee_name " + name+ "\n_age"+age+ "\n_salary is "+salary);
    }

    //4.  with parameter with return

    static int wp_wr_sum_of_2(int a, int b){
        return a+b;
    }

}
