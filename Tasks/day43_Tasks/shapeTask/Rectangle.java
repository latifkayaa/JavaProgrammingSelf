package day43_Tasks.shapeTask;

public final class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super("Rectangle");
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width<=0){
            throw new RuntimeException("Width can't be lower than 0.");
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height<=0){
            throw new RuntimeException("Width can't be lower than 0.");
        }
        this.height = height;
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimeter() {
        return 2*(width+height);
    }


}
