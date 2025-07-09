package ex_019_Abstract_class;

abstract class Employee {
    private String name;
    private String address;
    private int id;

    // Constructor to initialize fields
    public Employee(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    // Abstract method
    abstract void displayDetails();
}

public class Lab001_Abstract_Class {
    public static void main(String[] args) {
        // You can't instantiate an abstract class directly
        // You’d need a subclass to provide the implementation
    }
}

