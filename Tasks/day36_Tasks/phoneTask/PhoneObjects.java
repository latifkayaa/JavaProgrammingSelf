package day36_Tasks.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        System.out.println("Iphone Object Information:");

        Iphone iphone1 = new Iphone();
        iphone1.setInfo("12", "5.6", "Black", 1000);
        System.out.println(iphone1);

        System.out.println("Samsung Object Information:");

        Samsung samsung1= new Samsung();
        samsung1.setInfo("Galaxy", "6", "White", 900);
        samsung1.freeze();
        System.out.println(samsung1);


        System.out.println("Nokia Object Information:");

        Nokia nokia1 = new Nokia();
        nokia1.setInfo("Brick", "4", "Pink", 300);
        nokia1.selfDefense();
        System.out.println(nokia1);



    }
}
