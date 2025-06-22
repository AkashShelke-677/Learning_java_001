package ex003_Typ_Casting;
/**
 * Typecasting : Convert value from one data type to another data type, only numeric to numeric.
 * it's allowed  in compatible data type.
 * The data type should be compatible (ex- int = int or String = String)
 * Type : 1 - Widening (Explicit casing , Implicit casting )
 *        2 - Narrowing (Explicit casing , Implicit casting )
 * 1. Widening Casting - Its also known as implicit casting, converting smaller data type into larger data type.
 *     1.1 Implicit Widening : converting smaller data type into larger data type. no need to mention any data type, it will done automatically.
 *     1.2 Explicit widening : Converting larger data type into smaller, need to mention data type while converting.
 */
public class lab001_Typecasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // widening implicit casting

        byte c= 12;
        int d = (int)c; // widening explicit casting, need to mention conversion data type in widening explicit casting, not need JVM take care


    }
}
