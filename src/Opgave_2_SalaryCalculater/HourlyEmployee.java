package Opgave_2_SalaryCalculater;

public class HourlyEmployee extends Employee {
    private float payPerHour;
    private float numberOfHours;

    public HourlyEmployee(float payPerHour, float numberOfHours) {
        this.payPerHour = payPerHour;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public float calculateSalary() {
        float salary = payPerHour * numberOfHours;
        return salary;
    }

    @Override
    public String toString() {
        return "Your salary is " + calculateSalary() + ", For this month.";
    }
}
