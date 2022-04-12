package Others;

import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int length = inhabitants / 2;

        for (int i = 0; i < length; i++) {

            System.out.println("Day " + i + " [" + inhabitants + "]");

            inhabitants = inhabitants / 2;
            if (inhabitants == 0) {
                break;
            }
        }

        System.out.println("---- EXTINCT ----");


    }
}
