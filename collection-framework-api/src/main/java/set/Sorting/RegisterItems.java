package main.java.set.Sorting;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RegisterItems {
    // Attributes
    private Set<Item> itemSet;

    // Constructor
    public RegisterItems() {
        this.itemSet = new HashSet<>();
    }

    // Methods
    public void addItem(String name, long code, double price, int quantity) {
        itemSet.add(new Item(name, code, price, quantity));
    }

    public Set<Item> showItemsByName() {
        // TreeSet is necessary because the items need to be
        // displayed in a specific order
        Set<Item> itemsByName = new TreeSet<>(itemSet);
        return itemsByName;
    }

    public Set<Item> showItemsByPrice() {
        Set<Item> itemsByPrice = new TreeSet<>(new ComparatorByPrice());
        itemsByPrice.addAll(itemSet);
        return itemsByPrice;
    }

    public static void main(String[] args) {
        RegisterItems itemSet = new RegisterItems();

        itemSet.addItem("Banana", 0, 0.75, 5);
        itemSet.addItem("Apple", 27, 3.25, 3);
        itemSet.addItem("Pineapple", 14, 5.0, 2);
        itemSet.addItem("Banana", 0, 0.75, 2);
        itemSet.addItem("Blueberry", 78, 0.25, 10);
        System.out.println(itemSet.showItemsByName());
        System.out.println(itemSet.showItemsByPrice());

    }
}
