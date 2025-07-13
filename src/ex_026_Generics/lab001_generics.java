package ex_026_Generics;

public class lab001_generics {
    public static void main(String[] args) {
        Display(3.4,4);
        Display("Akash","True" );

    }
     static <T> T Display(T a ,T b){
        System.out.println(a);
         System.out.println(b);
            return  null;


     }
}
