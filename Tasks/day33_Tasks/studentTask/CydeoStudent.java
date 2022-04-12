package day33_Tasks.studentTask;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int ID;
    public char grade;
    public String batchNumber;
    public int groupNumber;

    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, char gender, int ID, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void attendClass() {
        System.out.println(name + " is attending the classes.");
    }

    public static void printSchoolName() {
        System.out.println("The school name is: " + schoolName);
    }

    public static void printProgLanguage() {
        System.out.println("The programming language of the " + schoolName + " is " + programmingLanguage);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                ", school name is=" + schoolName +
                ", programming language is=" + programmingLanguage +
                '}';
    }
}
