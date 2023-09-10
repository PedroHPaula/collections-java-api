package main.java.set.Search;

import java.util.Objects;

public class Contact {
    // Attributes
    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // Getters
    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    // Print template
    @Override
    public String toString() {
        return "Contact{"+name+", "+number+"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false;
        Contact contact = (Contact) obj;
        return getName() == contact.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
