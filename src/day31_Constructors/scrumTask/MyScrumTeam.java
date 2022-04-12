package day31_Constructors.scrumTask;

import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        //3 testers object
        Tester tester1 = new Tester("Latif", 1000, "QA", 100000);
        Tester tester2 = new Tester("Ali", 2000, "QA", 90000);
        Tester tester3 = new Tester("Ömer", 3000, "QA", 105000);
        Tester[] testers = {tester1,tester2,tester3};

        System.out.println(Arrays.toString(testers) + "\n");


        //4 developers objects
        Developer developer1 = new Developer("Coşkun", 4000, "Dev", 110000);
        Developer developer2 = new Developer("Mehmet", 5000, "Dev", 120000);
        Developer developer3 = new Developer("Ekrem", 6000, "Dev", 125000);
        Developer developer4 = new Developer("Kaan", 7000, "Dev", 135000);

        Developer[] developers = {developer1,developer2,developer3, developer4};
        System.out.println(Arrays.toString(developers)+ "\n");


        //1 Scrum Team Object

        ScrumTeam scrumTeam1= new ScrumTeam("John", "Jenny", "Blue", 14);

        //Add array of testers
        scrumTeam1.addTesters(testers);

        //Add array of developers
        scrumTeam1.addDevelopers(developers);

        System.out.println(scrumTeam1+ "\n");



        System.out.println("New Scrum team is: "+ scrumTeam1+ "\n");
        System.out.println();

        //Display Names of Testers
        for (Tester tester : scrumTeam1.testersList) {
            System.out.println(tester.name + "'s salary is: $" + tester.salary);
        }
        System.out.println();

        //Display Names of Devs
        for (Developer developer : scrumTeam1.devopsList) {
            System.out.println(developer.name+ "'s salary is: $" + developer.salary);
        }


        //Remove Developer
        scrumTeam1.removeDeveloper(4000);
        System.out.println(scrumTeam1.devopsList+ "\n");

        //Remove Tester
        scrumTeam1.removeTester(2000);
        System.out.println(scrumTeam1.testersList + "\n");



    }
}
