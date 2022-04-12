package day33_Tasks.iPhoneTask;

public class Test {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iphone 12",  1000);

        System.out.println(iPhone);

        iPhone.faceTime(123456789);
        iPhone.faceTime("gmail@yahoo.com");
        iPhone.call(123456789);
        iPhone.text(123456789);




    }
}
