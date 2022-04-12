package day37_Inheritance2.scrumTask;

public class BusinessAnalyst extends Employee{


    public BusinessAnalyst(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", ID, salary, companyName);
    }

    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }


}
