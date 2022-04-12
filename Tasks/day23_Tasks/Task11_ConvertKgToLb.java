package day23_Tasks;

public class Task11_ConvertKgToLb {
    public static void main(String[] args) {
        //11. create a method that can convert kg to lb
        convertKgToLb(1000);
    }

    public static void convertKgToLb (int kg){
        double lb = kg * 2.20;
        System.out.println("lb = " + lb);
    }
}
