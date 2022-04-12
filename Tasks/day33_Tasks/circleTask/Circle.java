package day33_Tasks.circleTask;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter=radius*2;
    }

    public double calcArea(){
        double area= pi*radius*radius;
        return area;
    }

    public double calcPerimeter(){
        double perimeter = pi * diameter;
        return perimeter;
    }

    public static void printPi(){
        System.out.println("The value of pi is: "+ pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
