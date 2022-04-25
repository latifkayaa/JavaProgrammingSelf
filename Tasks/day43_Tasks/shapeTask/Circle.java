package day43_Tasks.shapeTask;

public final class Circle extends Shape {

    private final double pi= 3.14;
    private int radius;

    public Circle(int radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getPi() {
        return pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius<=0){
            throw new RuntimeException("Radius can't be lower than 0.");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return (radius*radius) * pi;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }
}
