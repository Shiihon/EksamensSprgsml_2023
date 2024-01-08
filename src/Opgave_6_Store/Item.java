package Opgave_6_Store;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return name + ": " + price + " kr.";
    }
}