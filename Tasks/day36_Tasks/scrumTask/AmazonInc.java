package day36_Tasks.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        ProductOwner PO = new ProductOwner("Ali", 42, 'M', 1, 150000);
        BusinessAnalyst BA= new BusinessAnalyst("Coşkun", 44, 'M', 2, 140000);
        ScrumMaster SM=  new ScrumMaster("Omer", 27, 'M', 3, 130000);

        Tester tester1= new Tester("Latif", 28,'M', 5, 120000);
        Tester tester2= new Tester("Murat", 36,'M', 6, 115000);

        Tester[] testers = {tester1,tester2};

        Developer developer1= new Developer("Ayşe", 32,'F', 7, 120000);
        Developer developer2= new Developer("Fatma", 39,'F', 8, 115000);
        Developer developer3= new Developer("Ahmet", 40,'M', 9, 120000);
        Developer developer4= new Developer("Mehmet", 24,'M', 10, 115000);

        Developer[] developers = {developer1,developer2,developer3,developer4};

        ScrumTeam ST= new ScrumTeam();
        ST.PO = PO;
        ST.BA= BA;
        ST.SM= SM;
        ST.addTesters(testers);
        ST.addDevelopers(developers);

        System.out.println(ST);

    }
}
