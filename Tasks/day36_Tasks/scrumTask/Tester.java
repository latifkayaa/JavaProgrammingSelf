package day36_Tasks.scrumTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int ID, double salary) {
        super(name, age, gender, ID, "QA", salary);
    }

    public void createTicket(){
        System.out.println(getName()+" is creating ticket");
    }



}
