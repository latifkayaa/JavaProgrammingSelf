package day38_Tasks.employeeTask;

public class Test {
    public static void main(String[] args) {
        Developer d1= new Developer("Aaron", 32, 'M', 1, 100000, "Amazon");
        d1.work();
        System.out.println(d1);

        Tester t1= new Tester("Mike", 34, 'M', 10, 90000, "ZeroBank");
        t1.work();
        System.out.println(t1);
    }
}
