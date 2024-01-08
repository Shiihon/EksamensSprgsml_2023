package Opgave_8_StopFoodWaste;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate saleByDate0 = LocalDate.of(2024, 1, 10);
        LocalDate saleByDate1 = LocalDate.of(2024, 1, 8);
        LocalDate saleByDate2 = LocalDate.of(2024, 1, 22);
        LocalDate saleByDate3 = LocalDate.of(2024, 1, 3);
        LocalDate saleByDate4 = LocalDate.of(2024, 1, 10);


        FoodWaste foodWaste = new FoodWaste();
        System.out.println(foodWaste.checkDate(0, saleByDate0));
        System.out.println(foodWaste.checkDate(1, saleByDate1));
        System.out.println(foodWaste.checkDate(2, saleByDate2));
        System.out.println(foodWaste.checkDate(3, saleByDate3));
        System.out.println(foodWaste.checkDate(4, saleByDate4));

    }
}
