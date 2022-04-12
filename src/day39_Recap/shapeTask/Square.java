package day39_Recap.shapeTask;

public class Square extends Shape{

    private int side;

    public Square(int side) {
        super("Square");
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {

        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */