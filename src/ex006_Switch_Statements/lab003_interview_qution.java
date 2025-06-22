package ex006_Switch_Statements;

public class lab003_interview_qution {
    public static void main(String[] args) {
      /* is it allowed ? =  Yes allowed int
       int a =10;
        switch (a){

        }*/
        char ch ='A';
        switch (ch) // charchter alo allowed and it will take as integer (boolean and duplicate not allowed)
        {
            case 65:
                System.out.println("IS ASCII");
                break;
            default:
                System.out.println("IS NOT ASCII");
                break;
        }

    }
}
