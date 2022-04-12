package week05;

public class StringReview01 {
    public static void main(String[] args) {
        //two ways of creating String. Literal way and creating with new

        String str1= "Java"; //literal way of creating.. String object created in the string pool in HEAP.

        String str2 = new String("Java");
        System.out.println(str1 == str2);
        // str1 and str2 are locating 2 different object references..
        // Their references are different

        boolean check = str2.equals(str1);
        System.out.println("check = " + check);

        String str3 = new String("JAVA");
        boolean checkTwo= str2.equalsIgnoreCase(str3);
        System.out.println("checkTwo = " + checkTwo);


    }
}
