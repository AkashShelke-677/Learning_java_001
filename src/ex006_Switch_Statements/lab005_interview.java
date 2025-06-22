package ex006_Switch_Statements;

public class lab005_interview {
    public static void main(String[] args) {
        int a = 11;
    // a is given but not used in switch
        switch (-1) // this -1 will match with case
        {

            case 9: //multiple group
                System.out.println("11");
                break;
            case -1:
                System.out.println("10");
                break;
            default:
                System.out.println("Is not from group");
                break;

        }
    }
}
