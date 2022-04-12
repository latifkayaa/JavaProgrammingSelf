package day35_Tasks.rectangle;

public class Rectangle {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        setWidth(width);
        setLength(length);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            System.err.println("Invalid entry");
            return;
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            System.err.println("Invalid entry");
            return;
        }
        this.length = length;
    }


    public int calcArea(){
        return width*length;
    }

    public int calcPerimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
