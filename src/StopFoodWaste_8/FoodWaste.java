package StopFoodWaste_8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FoodWaste {
    private List<Integer> limits;
    public LocalDate dd;

    public FoodWaste() {
        limits = new ArrayList<>();

        limits.add(3);
        limits.add(1);
        limits.add(14);
        limits.add(2);
        limits.add(5);

        dd = LocalDate.of(2024, 1, 7);
    }

    public boolean checkDate(int category, LocalDate saleByDate) {
        LocalDate stopFoodWaste = saleByDate.minusDays(limits.get(category));

        if (stopFoodWaste.isBefore(dd) || stopFoodWaste.isEqual(dd)){
            if(dd.isAfter(saleByDate)){
                return false;
            }
           return true;
        }
        return false;
    }
}
