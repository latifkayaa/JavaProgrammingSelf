package day04_Variables;

public class Concatenation {
    public static void main(String[] args) {
        //In Java, String concatenation forms a new String that is the combination of multiple strings.
        // There are two ways to concatenate strings in Java:
        //By + (String concatenation) operator
        //By concat() method

        String name = "Latif";
        int age = 27;
        System.out.println("My name is " + name + " and I'm " + age + " years old.");

        String herName= "Beth ";
        String herLastName = "Dybas";
        String herFullName = herName + herLastName;
        System.out.println(herFullName);

    }
}
