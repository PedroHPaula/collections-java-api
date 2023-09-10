package main.java.set.Sorting;

import java.util.Comparator;
import java.util.Objects;

public class Item implements Comparable<Item>{
    // Attributes
    private String name;
    private long code;
    private double price;
    private int quantity;

    // Constructor
    public Item(String name, long code, double price, int quantity) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public long getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Inherited methods
    @Override
    public int compareTo(Item item) {
        return name.compareToIgnoreCase(item.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item)) return false;
        Item item = (Item) obj;
        return getCode() == item.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public String toString() {
        return "Item{"+code+", "+name+", "+price+", "+quantity+"}";
    }
    
}

class ComparatorByPrice implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        return Double.compare(item1.getPrice(), item2.getPrice());
    }

}
