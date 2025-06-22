package ex005_User_Input_scanner;

public class lab001_User_Input_configurationArgument {
    public static void main(String[] args) {
        // in configuration need to give argument which available in main method array type argument, this argument data type is String[]
        // So need to covert into integer BY using "Integer" class and ."parseInt()" method
        String age_arg = args [0];
        int age = Integer.parseInt(age_arg);
        String Can_I_Vote = age>= 18? "YES":"NO";
        System.out.println(Can_I_Vote);
    }
}
