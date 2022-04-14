package day39_Tasks.deviceTask;

public class Iphone extends Phone{


    public Iphone(String model, String color, String size, double price) {
        super("Iphone", model, color, size, price);
    }

    public void faceTime(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is face timing with "+phoneNum);
    }

    public void faceTime(String email){
        System.out.println(getBrand()+" "+getModel()+" is face timing with "+email);
    }


}
