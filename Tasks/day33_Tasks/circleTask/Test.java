package day33_Tasks.circleTask;

public class Test {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        //print pi
        Circle.printPi();
        double area= circle1.calcArea();
        double perimeter = circle1.calcPerimeter();
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println(circle1);


    }
}
