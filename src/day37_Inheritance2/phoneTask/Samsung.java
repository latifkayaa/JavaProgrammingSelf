package day37_Inheritance2.phoneTask;

public class Samsung extends Phone{


    public Samsung(String model, String size, int price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(brand + " "+model+" is frozen!");
    }



}
