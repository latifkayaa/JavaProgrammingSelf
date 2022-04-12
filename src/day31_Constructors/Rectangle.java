package day31_Constructors;

public class Rectangle {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        double area= length*width;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter =  (2 * (length+width));
        return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area=" + calculateArea() +
                ", Perimeter=" + calculatePerimeter() +
                '}';
    }
}

/*
create a custom class named Rectangle
    Attributes:
        length, width
    Add a constructor that can set all the fields
    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
     	toString(): displays the width, length, area and perimeter of the rectangle when an object of rectangle passed in the print statement
 */