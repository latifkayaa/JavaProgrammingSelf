package week05;

import java.util.Scanner;

public class MailTask2 {
    public static void main(String[] args) {
        // @ ve . olacak, @ ilk eleman olmayacak
        /*indexof("@")<1 :  0 (no character before @ sign) or -1 (there is no @ sign)
        indexof("@") >= email.length()-3   (a@a.a: indexof("@):length()-4 )
        what if we have 2 @ signs :
        the index of @ sign == last index of @ sign: there is one @ sign, otherwise problem
        DOT Conditions
        indexof(".")<1 :  0 (no character before dot sign) or -1 (there is no dot sign)
        indexofDotSign == email.length()-1 : problem
        the index of @ sign > bigger than indexofDotSign: problem
        the index of @ sign + 1 ==  indexofDotSign (@.): there is no character in between : problem
*/
        Scanner scan = new Scanner(System.in);
        String mail = scan.next();

        if(mail.contains("@") && mail.contains(".") && mail.indexOf("@") !=0){
            System.out.println("Valid email.");
        }
        else
            System.out.println("ınvalid email.");
    }
}
