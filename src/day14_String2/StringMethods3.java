package day14_String2;

public class StringMethods3 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        str = str.replace("Java","Selenium" );
        System.out.println("str = " + str);

        String email = "latif.kayaa@outlook.com";
        email = email.replace("outlook.com", "gmail.com");
        System.out.println("email = " + email);

        String sentence= " Java Java Phyton Phyton C# C# C++ C++ Phyton Phyton";
        sentence = sentence.replace("Phyton", "").replace("   ", " ");
        System.out.println("sentence = " + sentence);






    }
}
