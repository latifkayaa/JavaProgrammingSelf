package day32_Constructors;

public class Car {
    public String make, model, color;
    public int year, price;

    public Car(String make){
        this.make=make;
        System.out.println("make= "+make);
    }
    public Car(String make, String model){
        this(make);
        this.model=model;
        System.out.println("model= "+model);
    }

    public Car(String make, String model, int year){
        this(make, model);
        this.year= year;
        System.out.println("year= "+year);
    }

    public Car(String make, String model, int year, int price){
        this(make, model, year);
        this.price = price;
        System.out.println("price= "+price);
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
