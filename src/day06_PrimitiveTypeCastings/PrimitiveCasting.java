package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {
        //implicit casting
        short test= 1243;
        byte test1= (byte)test;
        System.out.println("test = " + test);
        System.out.println("test1 = " + test1);


        int test2= 1232423432;
        short test3= (short) test2;
        test3 +=1;
        System.out.println("test3 = " + test3);
        System.out.println("test2 = " + test2);

        byte a= 5;
        short b= a;
        System.out.println(a + "   " + b);

        int x= 100000;
        long y= x;
        System.out.println(x + "    " + y);

        //explicit casting, we need to declare the data type
        double q = 5857.476;
        int w = (int) q;
        System.out.println(w + "    " + q);

        double e = 6.8765;
        float r = (float)e;
        System.out.println(e + "   " + r);

        int number1= 100;
        double number2 = number1/6;
        System.out.println(number2);


        double number3 = (double) number1 / 6;
        System.out.println(number3);


        System.out.println((int)10.0/3);
        long k= 3_000L;
        System.out.println(k);
        double l= (float)k;
        System.out.println(k);
        System.out.println(l);
        int c= (short) l;
        System.out.println(c);
        System.out.println(c%1000);

    }
}
