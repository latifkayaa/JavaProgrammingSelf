package day43_Tasks.shapeTask;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                " area= " + area()+
                " perimeter= " + perimeter()+
                '}';
    }
}
