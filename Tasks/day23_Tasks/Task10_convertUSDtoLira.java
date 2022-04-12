package day23_Tasks;

public class Task10_convertUSDtoLira {
    public static void main(String[] args) {
        //10. create a method that can can convert dollar to lira
        convertUSDtoLira(1000);

    }

    public static void convertUSDtoLira (int dollars){
        double liras= 14.70 * dollars;

        System.out.println("liras = " + liras);
    }
}
