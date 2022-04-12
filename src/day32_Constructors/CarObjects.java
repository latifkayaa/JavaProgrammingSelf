package day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        System.out.println("car1 = " + car1);

        System.out.println("-------------");

        Car car2 = new Car("Honda", "Accord");
        System.out.println("car2 = " + car2);

        System.out.println("-------------");

        Car car3 = new Car("Lexus", "RX350", 2021);
        System.out.println("car3 = " + car3);

        System.out.println("-------------");

        Car car4 = new Car("BMW", "X6", 2020, 50000);
        System.out.println("car4 = " + car4);



    }

}
