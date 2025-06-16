package Switch_Statements;

public class lab004_interview_multipleMatch {
    public static void main(String[] args) {
         int a= 001;

         switch (a){

             case 001,002,003: //multiple cases
                 System.out.println("Is from first group");
                 break;
             case 004,005,006:
                 System.out.println("Is from Second group");
                 break;
             default:
                 System.out.println("Is not from group");
                 break;

         }
    }
}
