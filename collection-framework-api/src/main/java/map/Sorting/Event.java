package main.java.map.Sorting;

public class Event {
    // Attributes
    private String name;
    private String attraction;

    // Constructor
    public Event(String name, String attraction) {
        this.name = name;
        this.attraction = attraction;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAttraction() {
        return attraction;
    }

    // Implemented methods
    @Override
    public String toString() {
        return "Event{"+name+", "+attraction+"}";
    }

    
}
