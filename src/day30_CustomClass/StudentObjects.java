package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Ali", 'M', 42, 3512, 'A');

        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Coşkun", 'M', 42, 3012, 'B');

        System.out.println(student2);

        Student student3 = new Student();
        student3.setInfo("Beth", 'F', 27, 1000, 'A');

        System.out.println(student3);

        Student student4 = new Student();
        student4.setInfo("Ecem", 'F', 25, 2750, 'B');

        System.out.println(student4);

        Student student5 = new Student();
        student5.setInfo("Latif", 'M', 27, 1, 'A');

        System.out.println(student5);

        Student [] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        //EarlyBirds

        ArrayList <Student> earlyBirds = new ArrayList<>();
        ArrayList <Student> angryBirds = new ArrayList<>();

        //Loop solution, for each

        /*for (Student student : students) {
            if(student.grade == 'A'){
                earlyBirds.add(student);
            }
            if(student.grade == 'B'){
                angryBirds.add(student);
            }
        } */


        earlyBirds.addAll(Arrays.asList(students));
        angryBirds.addAll(Arrays.asList(students));

        //removeIf()
        earlyBirds.removeIf(p-> p.grade!='A');
        angryBirds.removeIf(p-> p.grade=='A');

        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);





    }

}
