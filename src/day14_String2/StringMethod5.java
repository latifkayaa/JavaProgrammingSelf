package day14_String2;

public class StringMethod5 {
    public static void main(String[] args) {
        String email = "latif.kayaa@gmail.com";

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }
}
