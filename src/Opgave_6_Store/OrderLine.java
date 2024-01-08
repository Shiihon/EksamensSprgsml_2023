package Opgave_6_Store;

public class OrderLine {
    private Item item;
    private int amount;

    public OrderLine(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public double getTotalPrice() {
        double totalPrice = item.getPrice() * getAmount();
        return totalPrice;
    }

    public Item getItem() {
        return this.item;
    }

    public int getAmount() {
        return this.amount;
    }

    public String toString() {
        return getAmount() + " PCS. " + getItem().toString();
    }
}