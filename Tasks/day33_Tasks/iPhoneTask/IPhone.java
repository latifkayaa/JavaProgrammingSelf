package day33_Tasks.iPhoneTask;

public class IPhone {

    public static String brand = "Apple";

    public String model;
    public double price;

    public static String OS = "iOS";



    public static String madeIn = "China";

    public IPhone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public static void printOperatingSystem(){
        System.out.println(OS);
    }

    public static void faceTime(long phoneNumber){
        System.out.println("This "+ phoneNumber + " is calling you for facetime.");
    }

    public static void faceTime(String email){
        System.out.println("This "+ email + " is calling you for facetime.");
    }

    public static void call(long phoneNumber){
        System.out.println("This "+ phoneNumber + " is calling you.");
    }

    public static void text(long phoneNumber){
        System.out.println("This "+ phoneNumber + " is texted you.");
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
