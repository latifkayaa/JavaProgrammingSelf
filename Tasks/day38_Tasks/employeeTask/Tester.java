package day38_Tasks.employeeTask;


public class Tester extends Employee {


    public Tester(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, "Tester", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(name+ " is testing the system.");
    }

    public void testing() {
        System.out.println(name + "as a " + jobTitle + " is testing.");
    }

    public void creatingTicket() {
        System.out.println(name + "as a " + jobTitle + " is creating tickets.");
    }

}
