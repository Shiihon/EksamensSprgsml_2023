package Lnberegning_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = new ArrayList<>();

        listOfEmployees.add(new MonthlyEmployee(33000));
        listOfEmployees.add(new HourlyEmployee(185, 8));
        listOfEmployees.add(new ComissionEmployee(20000, 10000, 20));

        for (Employee e : listOfEmployees) {
            System.out.println(e);
        }


    }
}
