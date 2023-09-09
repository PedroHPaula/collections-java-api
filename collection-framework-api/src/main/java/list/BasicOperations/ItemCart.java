package main.java.list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class ItemCart {
    private List<Item> itemCart;

    public ItemCart() {
        this.itemCart = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        itemCart.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();
        for (Item item : itemCart) {
            if (item.getName().equalsIgnoreCase(name)) {
                itemsToRemove.add(item);
            }
        }

        itemCart.removeAll(itemsToRemove);
    }

    public double calculateTotalValue() {
        double totalValue = 0.00;

        for (Item item : itemCart) {
            totalValue = totalValue + item.getPrice()*item.getQuantity();
        }

        return totalValue;
    }

    public void displayItems() {
        System.out.println("Current Items {Name, Price, Quantity}:");
        for (int i = 0; i < itemCart.size(); i++) {
            System.out.println("#"+i+" - "+itemCart.get(i));
        }
    }

    public static void main(String[] args) {
        ItemCart itemCart = new ItemCart();

        itemCart.addItem("Banana", 0.75, 5);
        itemCart.addItem("Apple", 5.00, 5);
        itemCart.addItem("Pineapple", 4.75, 2);
        itemCart.addItem("Papaya", 3.50, 1);

        itemCart.displayItems();

        System.out.println("\nTotal Value: "+
        itemCart.calculateTotalValue());

        System.out.println("\nRemoving the #2 item:");
        itemCart.removeItem("Pineapple");
        itemCart.displayItems();
        System.out.println("\nTotal Value: "+
        itemCart.calculateTotalValue());
    }
}
