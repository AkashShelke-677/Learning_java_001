package ex_013_Constructor;

public class lab002_default_construction {
    public static void main(String[] args) {
        def s1 = new def();
        System.out.println(s1.name);

        //parameterised constructor object
        def s2 = new def("Akash",27);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}

class def {
        String name;
        int age;
       // below default constructor created
        def(){
            // write code for run before creating the object
            // we can give default data
            name = "Akash";
            age = 27;
            System.out.println("Want to read CSV file");  // write code for run before creating the object
            System.out.println("Want to fetch data from My SQL database");
            System.out.println("Want to read Xlsx file");
        }

        // parameterized constructor
        def(String name_){
            //"this" will asign value from parameterized constructor
            this.name = name_;
            //this.age = age1;
        }

        // Constructor Overloading same name but parameter diff
        def(String name_,int age1){
            //"this" will asign value from parameterized constructor
            this.name = name_;
            this.age = age1;

        }
    }



