package day35_Tasks.square;

public class Square {


    private int side;

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            System.err.println("Invalid entry.");
            return;
        }
        this.side = side;
    }

    public int calcArea(){
        return side*side;
    }

    public int calcPerimeter(){
        return 4*side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }

}
