package ex007_For_loop;

public class lab003_Even_Odd_number {
    public static void main(String[] args) {
        for(int i = 1 ; i<50; i++){
            if(i%2==0){
                System.out.println("even number = "+ i);
            }
            else {
                System.out.println("Odd number = " + i);
            }
        }
    }
}
