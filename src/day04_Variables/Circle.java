package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        //area and perimeter
        double radius= 5.5;

        double pi=3.14;
        double area = radius * radius * pi;
        System.out.println("area = " + area);

        double perimeter= 2 * pi * radius;
        System.out.println("perimeter = " + perimeter);
    }
}
