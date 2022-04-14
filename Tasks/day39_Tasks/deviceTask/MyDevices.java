package day39_Tasks.deviceTask;

public class MyDevices {
    public static void main(String[] args) {

        Iphone iphone1= new Iphone("13", "Black","6 inc", 1000);
        Samsung samsung1= new Samsung("S20", "Black","6.2 inc", 1200);

        PersonalComputer p1= new PersonalComputer("HP", "x360", "Black", "13 inch", 15000);
        Desktop d1= new Desktop("HP", "Afc23", "Black", "20 inch", 2000);

        System.out.println("d1 = " + d1);
        System.out.println("p1 = " + p1);
        System.out.println("samsung1 = " + samsung1);
        System.out.println("iphone1 = " + iphone1);
        samsung1.call(123123123);
        iphone1.faceTime(3123213);
        iphone1.faceTime("latgdnfgkdf");



    }
}
