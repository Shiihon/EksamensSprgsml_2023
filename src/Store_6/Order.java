package Store_6;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> orderLines;

    public Order() {
        this.orderLines = new ArrayList<>();
    }

    public float getTotalPrice() {
        float totalPriceOfOrders = 0;
        for (OrderLine order : orderLines) {
            totalPriceOfOrders += order.getTotalPrice();
        }
        return totalPriceOfOrders;
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    public String toString(){
        String itemsInList = "";
        for(OrderLine order : orderLines){
            itemsInList += order + "\n";
        }
        return "\nYou have ordered : " + "\n" +   itemsInList + "The total price for this order is : " + getTotalPrice() + " kr.";
    }
}
