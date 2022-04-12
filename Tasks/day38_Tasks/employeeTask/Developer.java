package day38_Tasks.employeeTask;


public class Developer extends Employee {

    public Developer(String name, int age, char gender, int ID,  double salary, String companyName) {
        super(name, age, gender, ID, "Developer", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(name+ " is writing codes.");
    }

    public void coding() {
        System.out.println(name + "as a " + jobTitle + " is coding.");
    }

    public void fixingBugs() {
        System.out.println(name + "as a " + jobTitle + " is fixing bugs.");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
