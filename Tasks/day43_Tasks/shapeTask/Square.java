package day43_Tasks.shapeTask;

public final class Square extends Shape{

    private int width;

    public Square(int width) {
        super("Square");
        setWidth(width);
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width<=0){
            throw new RuntimeException("Invalid with. Can't be lower than 0.");
        }
        this.width = width;
    }

    @Override
    public double area() {
        return width*width;
    }

    @Override
    public double perimeter() {
        return 4*width;
    }
}
