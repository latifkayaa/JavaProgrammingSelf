package day23_Tasks;

public class Task12_PositiveNot {
    public static void main(String[] args) {
        //12. create a method that can if the given integer is positive, negative or zero
        positiveNot(124);

    }

    public static void positiveNot(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero/0");
        }
    }
}
