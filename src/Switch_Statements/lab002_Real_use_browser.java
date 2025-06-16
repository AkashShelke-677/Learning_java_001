package Switch_Statements;

import java.util.Scanner;

public class lab002_Real_use_browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Browser name");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting chrome browser");
                System.out.println("executing TC1");
                System.out.println("Closing browser");
                break;

            case "edge":
                System.out.println("Starting edge browser");
                System.out.println("executing TC1");
                System.out.println("Closing browser");
                break;


            case "firefox":
                System.out.println("Starting chrome browser");
                System.out.println("executing TC1");
                System.out.println("Closing browser");
                break;

            default:
                System.out.println("Please enter the valid browser");
                break;
        }
    }
}
