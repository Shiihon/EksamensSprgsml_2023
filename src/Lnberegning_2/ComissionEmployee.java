package Lnberegning_2;

public class ComissionEmployee extends Employee {

    private float baseSalary;
    private float sale;
    private float comission;

    public ComissionEmployee (float baseSalary, float sale, float comission){
        this.baseSalary = baseSalary;
        this.sale = sale;
        this.comission = comission;
    }
    @Override
    public float calculateSalary() {
        float comissionInInt = comission * sale/ 100;
        float monthlySalary = baseSalary + comissionInInt;

        return monthlySalary;
    }
    @Override
    public String toString() {
        return "Your salary is " + calculateSalary() + ", For this month.";
    }
}
