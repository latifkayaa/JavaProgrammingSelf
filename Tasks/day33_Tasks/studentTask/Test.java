package day33_Tasks.studentTask;

public class Test {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Jimmy", 39, 'M', 14, 'A', "EU8", 31);

        CydeoStudent student2 = new CydeoStudent("Kathy", 29, 'F', 15, 'F', "EU7", 8);

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();


    }
}
