package day23_Tasks;

public class Task6_AreaOfCircle {
    public static void main(String[] args) {
        //create a method that can calculate the area of a circle
        circleArea(5);
    }

    public static void circleArea(int radius){
        double pi= 3.14;
        double area = pi * radius*radius;

        System.out.println(area);
    }
}
