package ex_023_Enumes;

public class lab001_enumes {

    public static void main(String[] args) {

        System.out.println(Locator.Xpath_for_Button.getLocators()); // this value can use from enum
        System.out.println(Locator.Xpath_for_login.getLocators());


    }
}

enum day {

    // Enums will store value which are constant
     Monday,Tuesday, Thursday, Friday
}

