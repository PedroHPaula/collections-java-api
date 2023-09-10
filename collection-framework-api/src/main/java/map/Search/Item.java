package main.java.map.Search;

public class Item {
    // Attributes
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getStockValue() {
        return quantity*price;
    }

    // Implemented methods
    @Override
    public String toString() {
        return "Item{"+name+", "+price+", "+quantity+"}";
    }
    
}
