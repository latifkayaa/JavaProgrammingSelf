package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    static String schoolName;
    public String fieldOfStudy;
    static String programmingLanguage;
    static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo";
        secretCode = "Wooden Spoon";
        programmingLanguage = "Java";
    }


    public static void printSchoolName() {
        System.out.println("The school name is: " + schoolName);
    }

    public static void printSecretCode() {
        System.out.println("The secret code is: " + secretCode);
    }

    public static void printProgrammingLanguage(){
        System.out.println("language is " + programmingLanguage);

    }

    public void attendClass(){
        System.out.println(name + " is attending the class.");
    }

    public void study(){
        System.out.println(name + " is studying.");
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
