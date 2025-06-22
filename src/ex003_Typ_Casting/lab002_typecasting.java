package ex003_Typ_Casting;

public class lab002_typecasting {
    public static void main(String[] args) {

        float a = 18.45f;
        int b = 100;
        int c =(int) a+b;  // explicit  casting, from large to small conversion data loss
        System.out.println(c);

        float d  =  a + b;
        float e = (float)a+b;
        System.out.println(d); // widning implicit casting, NO data loss
        System.out.println(e); // widning Explicit castingNo data loss

    }
}
