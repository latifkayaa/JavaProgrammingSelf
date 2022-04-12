package day31_Tasks.salaryCalculatorTask;

public class Salary {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public double weeklyHours;

    public Salary(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100; // to make sure that user does not need to convert the percentage to decimal
        this.federalTaxRate = federalTaxRate/100; // to make sure that user does not need to convert the percentage to decimal
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return (hourlyRate*weeklyHours*52);
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-federalTax()-stateTax();
    }

    public String toString() {
        return "Salary{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", Salary= $" + salary() +
                ", State tax= $" + stateTax() +
                ", Federal tax= $" + federalTax() +
                ", Salary after the tax= $" + salaryAfterTax() +
                '}';
    }
}
