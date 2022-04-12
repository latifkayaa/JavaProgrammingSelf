package day36_Tasks.phoneTask;

public class Phone {

    public String brand;
    public String model;
    public String size;
    public String color;
    public double price;

    public void setInfo(String model, String size, String color, double price) {
        brand = getClass().getSimpleName(); // this gets the class name automatically
        //this.brand=brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(phoneNumber+ " is calling.");
    }

    public void text(long phoneNumber){
        System.out.println(phoneNumber+ " is texting.");
    }



    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */