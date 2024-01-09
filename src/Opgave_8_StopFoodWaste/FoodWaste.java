package Opgave_8_StopFoodWaste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FoodWaste {
    private List<Integer> limits;
    public LocalDate dd;

    public FoodWaste() {
        limits = new ArrayList<>(); //initialiserer

        limits.add(3); // frugt og grønt
        limits.add(1); // kød
        limits.add(14); // konserves
        limits.add(2); // mejeriprodukter
        limits.add(5); // mel og gryn

        dd = LocalDate.of(2024, 1, 7); // dags dato der bliver sat.
    }

    public boolean checkDate(int category, LocalDate saleByDate) {
        LocalDate stopFoodWaste = saleByDate.minusDays(limits.get(category)); // saleByDate minus limits dage for hver category.

        if (stopFoodWaste.isBefore(dd) || stopFoodWaste.isEqual(dd)){
            if(dd.isAfter(saleByDate)){
                return false;
            }
           return true;
        }
        return false;
    }
}
