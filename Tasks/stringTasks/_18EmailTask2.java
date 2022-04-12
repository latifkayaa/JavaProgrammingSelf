package stringTasks;

import java.util.Scanner;

public class _18EmailTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email.");
        String email = scan.next();

        int underscore = email.indexOf("_");
        int atSymbol= email.indexOf("@");
        int dotSymbol= email.indexOf(".");

        String name = email.substring(0,1).toUpperCase()+ email.substring(1, underscore);
        String lastName= email.substring(underscore+1, underscore+2).toUpperCase() +
                         email.substring(underscore+2, atSymbol);
        String domain = email.substring(atSymbol+1, dotSymbol);

        System.out.println("First name = " + name + "\n" + "Last name = " + lastName + "\n" + "Domain = " + domain);





    }
}
/* Ex: input:   craig_federighi@apple.com
  Output:  First name: Craig
           Last name: Federighi
           Domain: apple*/