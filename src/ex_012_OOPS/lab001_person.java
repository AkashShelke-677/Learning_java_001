package ex_012_OOPS;

public class lab001_person {

    // these are Attribute, Properties, instance variable
    String name;
    int age;
    Boolean married;
    int weight;
    float hight;



        // these are function, member function, methods
        void walk () {
            System.out.println("Person can walk");
        }

        void eat () {
            System.out.println("Person can eat");
        }

    public static void main(String[] args) {

        lab001_person person= new lab001_person();
        person.eat();
        person.walk();
    }
}
