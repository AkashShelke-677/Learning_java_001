package ex_023_Enumes;

public enum Locator {

    Xpath_for_login("Akash"),
    Xpath_for_Button("Suraj");

    private String locators;

    Locator(String locators) {
        this.locators = locators;
    }

    public String getLocators() {
        return this.locators;
    }
}

