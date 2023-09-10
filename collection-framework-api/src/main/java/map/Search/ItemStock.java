package main.java.map.Search;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {
    // Attributes
    private Map<Long, Item> itemStockMap;

    // Constructor
    public ItemStock() {
        this.itemStockMap = new HashMap<>();
    }
    
    // Methods
    public void addItem(long code, String name, double price, int quantity) {
        itemStockMap.put(code, new Item(name, price, quantity));
    }

    public void showItems() {
        System.out.println(itemStockMap);
    }

    public double calculateTotalStockValue() {
        double totalValue = 0d;
        if (!(itemStockMap.isEmpty())) {
            for (Item item : itemStockMap.values()) {
                totalValue += item.getQuantity()*item.getPrice();
            }
        }

        return totalValue;
    }

    public Item getHighestPriceItem() {
        Item highestPriceItem = null;
        double highestPrice = Double.MIN_VALUE;
        if (!(itemStockMap.isEmpty())) {
            for (Item item : itemStockMap.values()) {
                if (item.getPrice() > highestPrice) {
                    highestPrice = item.getPrice();
                    highestPriceItem = item;
                }
            }
        }

        return highestPriceItem;
    }

    public Item getCheapestItem() {
        Item cheapestItem =null;
        double cheapestPrice = Double.MAX_VALUE;
        if (!(itemStockMap.isEmpty())) {
            for (Item item : itemStockMap.values()) {
                if (item.getPrice() < cheapestPrice) {
                    cheapestPrice = item.getPrice();
                    cheapestItem = item;
                }
            }
        }

        return cheapestItem;
    }

    public Item getHighestStockValueItem() {
        Item highestStockValueItem = null;
        double highestStockValue = Double.MIN_VALUE;
        if (!(itemStockMap.isEmpty())) {
            for (Item item : itemStockMap.values()) {
                if (item.getStockValue() > highestStockValue) {
                    highestStockValue = item.getStockValue();
                    highestStockValueItem = item;
                }
            }
        }

        return highestStockValueItem;
    }

    public static void main(String[] args) {
        ItemStock itemStock = new ItemStock();

        itemStock.addItem(0, "Wine", 47.00, 10);
        itemStock.addItem(1, "Beer", 2.75, 50);
        itemStock.addItem(2, "Water", 2.50, 35);
        itemStock.addItem(3, "Champagne", 79.99, 5);
        itemStock.showItems();

        System.out.println("Total Stock Value: "+itemStock.calculateTotalStockValue());
        System.out.println("Highest Price Item: "+itemStock.getHighestPriceItem());
        System.out.println("Cheapest Item: "+itemStock.getCheapestItem());
        System.out.println("Highest Stock Value Item: "+itemStock.getHighestStockValueItem());

    }
}
