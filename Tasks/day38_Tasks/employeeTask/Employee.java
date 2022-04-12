package day38_Tasks.employeeTask;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public int ID;
    public String jobTitle;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(name + " is working.");
    }

    public String toString() {
        return "Employee{" +
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
