package ex11_Strings;

public class lab001_string_immutable {
    public static void main(String[] args) {
        String name = "Akash";
        name.toUpperCase(); //converting ito the uppercase AKASH
        System.out.println(name);//Checking which string will point

        // below it will create another string Bcoz we are assigning the new value (Akash -> AKASH)
        name=name.toUpperCase();
        System.out.println(name);//Checking which string will point

    }
}
