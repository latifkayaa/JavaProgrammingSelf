package week05;

import java.util.Locale;
import java.util.Scanner;

public class MailString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mail = scan.next();

        String firstName= mail.substring(0, mail.indexOf("_"));
        String lastName = mail.substring(mail.indexOf("_")+1, mail.indexOf("@"));
        String domain = mail.substring(mail.indexOf("@")+1, mail.indexOf("."));
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);
    }
}
