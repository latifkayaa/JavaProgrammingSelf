package day43_Abstraction.carTask;

public abstract class Car {

    private String brand;
    private String model;
    private String color;
    private int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);

        if (year < 1886) {
            throw new RuntimeException("Invalid Year: " + year);
        }
        this.year = year;

        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String make) {
        this.brand = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new RuntimeException("Invalid price: "+price);
        }
        this.price = price;
    }


    public abstract void start();

    public void stop(){
        System.out.println("Press the brake");

    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}
