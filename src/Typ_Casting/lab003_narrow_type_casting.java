package Typ_Casting;

public class lab003_narrow_type_casting {
    public static void main(String[] args) {
       /* int a = 300;
        byte b = a; // Not Allowed the implicit casting into the narrow type casting
        System.out.println(b);

        */

        int c = 300;
        byte d = (byte)c; // Narrow Typecasting ( int >> byte), Explicit is allowed but need tto mention data type and also loose the data
                            // it will convert into binary number then from there 8 bits will take and show for byte
        System.out.println(d);


        int item_price = 100;
        float gst = 18.22f;
        // int total= item_price + gst ; // Narrow Implicit casting, Not allowed
        int total= item_price + (int)gst ; // Narrow Explicit casting, Allowed but data loss.
        System.out.println("Total item price is = "+ total);

        float total2 = item_price + gst; // Widening auto implicit
        float total3 = (float)item_price + gst; // Widening Explicit
        System.out.println("Total item price is = "+ total2);
        System.out.println("Total item price is = "+ total3);





    }
}
