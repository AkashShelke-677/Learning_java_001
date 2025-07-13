package ex_025_Exception;


class lab004_Handling_Exception {

    public static void main(String[] args) {
        Integer a = 10;
        try {
            a = 10/0; // It will give Arthmatical Exception
        } catch (Exception e) {
            throw new RuntimeException("");
        }
        System.out.println(a);
    }
}
