package ex009_Function;

public class lab003_userDefinedFunction {
    public static void main(String[] args) {
    int result = sum_of_Two_num(5,8); //defining the argument value and calling
    System.out.println(result);

    }
    static int sum_of_Two_num(int a , int b){
        return a+b;
    }
    static void sum_of_2_num_without_return(int d, int c){
        System.out.println(d +c);
    }
}
