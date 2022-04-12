package day23_Tasks;

public class Task5_Grade {
    public static void main(String[] args) {
        gradeCalculation(75);
    }

    public static void gradeCalculation(int score) {
        String grade = "Invalid";

        if (score >= 0 && score <= 100) {
            grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "E";
        }

        System.out.println("grade = " + grade);
    }
}
