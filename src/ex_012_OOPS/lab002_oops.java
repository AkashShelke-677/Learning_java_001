package ex_012_OOPS;

import java.net.StandardSocketOptions;

public class lab002_oops {
    // public class have main method and it can run
    public static void main(String[] args) {

        cat c1 = new cat(); //object created for cat class
        new cat();  // object created for cat class
        cat c2; // object not created for cat class

        c1.running(); // we can call the behaviour or method
        new cat().running(); // we can call the behaviour or method

    }
}

class cat {

    void running(){
        System.out.println("cat class");
    }
}
