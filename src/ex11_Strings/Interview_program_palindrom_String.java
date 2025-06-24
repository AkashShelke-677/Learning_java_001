package ex11_Strings;

public class Interview_program_palindrom_String {
    public static void main(String[] args) {

        // String s1= ma'am -> reverse it = ma'am it is palindrome

        String A= "mtt";
        String rev ="";

        for(int i =A.length()-1;i >=0;i--){
            rev= rev+A.charAt(i);
        };

        if(rev.equals(A)){System.out.println("Palindromic");
        } else {
            System.out.println("Not Palindromic");
        }

    }
}
