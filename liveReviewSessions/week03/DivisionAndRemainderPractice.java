package week03;

public class DivisionAndRemainderPractice {
    public static void main(String[] args) {

        //input is some amount of seconds (45.000)
        //hours : minutes: seconds

        int total = 45006;

        int hours, minutes, seconds;

        hours = total/3600;
        total = total - hours *3600;

        minutes = total/60;
        total = total - minutes*60;

        seconds = total;
        System.out.println(hours + ": " + minutes + ": " + seconds);




            int apple = 299;
            int düzine, deste, birlik;
            düzine = apple / 12;
            apple = apple - düzine*12;

            deste = apple/10;
            apple = apple- deste*10;

            birlik = apple;
        System.out.println(düzine);
        System.out.println(deste);
        System.out.println(birlik);

    }
}
