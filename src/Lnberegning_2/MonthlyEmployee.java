package Lnberegning_2;

public class MonthlyEmployee extends Employee {
    private float salary;

    public MonthlyEmployee(float salary) {

        this.salary = salary;
    }

    @Override
    public float calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Your salary is " + calculateSalary() + ", For this month.";
    }
}
