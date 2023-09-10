package main.java.set.BasicOperations;

import java.util.Objects;

public class Guest {
    // Attributes
    private String name;
    private int inviteCode;

    // Constructor
    public Guest(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getInviteCode() {
        return inviteCode;
    }

    // Print template
    @Override
    public String toString() {
        return "Guest{"+name+", "+inviteCode+"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Guest)) return false;
        Guest guest = (Guest) obj;
        return getInviteCode() ==  guest.getInviteCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInviteCode());
    }

    
}
