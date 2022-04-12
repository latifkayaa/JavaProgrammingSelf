package day27_Wrapper;

public class WrapperClassMethods {
    public static void main(String[] args) {

    String str = "12345";

      int x= Integer.parseInt(str);
        System.out.println("x = " + (x*2));

        String str2= "10.56";
        double num2= Double.parseDouble(str2);
        System.out.println("num2 = " + num2);


        int max= Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long minL= Long.MIN_VALUE;
        long maxL= Long.MAX_VALUE;
        System.out.println("maxL = " + maxL);
        System.out.println("minL = " + minL);

        String s1= "maybe";
        boolean check =Boolean.parseBoolean(s1);
      System.out.println("check = " + check);

      System.out.println("----------------");

      String s4= "1234";
      Integer s5= Integer.valueOf(s4);
      System.out.println("s5 = " + s5);





    }
}
