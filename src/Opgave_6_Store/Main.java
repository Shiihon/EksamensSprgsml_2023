package Opgave_6_Store;

public class Main {
    public static void main(String[] args) {

        Item carrots = new Item("Carrots", 14.00);
        Item avocado = new Item("Avocado", 9.00);
        Item banana = new Item("Banana", 2.50);
        Item cucumber = new Item("Cucumber", 9.00);
        Item redPepperfruit = new Item("Pepperfruit, red", 10.00);

        Order order = new Order();
        OrderLine orderline1 = new OrderLine(banana, 5);
        OrderLine orderLine2 = new OrderLine(carrots, 2);
        OrderLine orderLine3 = new OrderLine(avocado, 4);
        OrderLine orderLine4 = new OrderLine(cucumber, 10);
        OrderLine orderLine5 = new OrderLine(redPepperfruit, 3);

        order.addOrderLine(orderline1);
        order.addOrderLine(orderLine2);
        order.addOrderLine(orderLine3);
        order.addOrderLine(orderLine4);
        order.addOrderLine(orderLine5);

        System.out.println(order);
    }
}
