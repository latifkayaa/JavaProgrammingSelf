package day45_Abstraction.shapeTask;

public final class Square extends Shape {

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
            throw new RuntimeException("Invalid Side: "+side);
        }
        this.side = side;
    }

    public Square(String name) {
        super(name);
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
                super.toString()+
                "side=" + side +
                '}';
    }
}
