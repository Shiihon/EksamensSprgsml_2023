package Opgave_8_StopFoodWaste;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // sætter hvad datoen er for de specifikke varer.

        LocalDate saleByDate_fruitAndVeggies = LocalDate.of(2024, 1, 10);
        LocalDate saleByDate_meat = LocalDate.of(2024, 1, 8);
        LocalDate saleByDate_cannedFood = LocalDate.of(2024, 1, 22);
        LocalDate saleByDate_dairyProducts = LocalDate.of(2024, 1, 3);
        LocalDate saleByDate_flourAndGrain = LocalDate.of(2024, 1, 10);

        // declare, assign og initialise foodWaste.
        FoodWaste foodWaste = new FoodWaste();

        // kalder på metoden checkdate inde i foodWaste.
        System.out.println(foodWaste.checkDate(0, saleByDate_fruitAndVeggies));
        System.out.println(foodWaste.checkDate(1, saleByDate_meat));
        System.out.println(foodWaste.checkDate(2, saleByDate_cannedFood));
        System.out.println(foodWaste.checkDate(3, saleByDate_dairyProducts));
        System.out.println(foodWaste.checkDate(4, saleByDate_flourAndGrain));

    }
}
