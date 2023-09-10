package main.java.set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    // Attributes
    private Set<Guest> guestSet;

    public GuestSet() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int inviteCode) {
        guestSet.add(new Guest(name, inviteCode));
    }
    
    public void removeGuest(int inviteCode) {
        Guest guestToRemove = null;
        for (Guest guest : guestSet) {
            if (guest.getInviteCode() == inviteCode) {
                guestToRemove = guest;
                break;
            }
        }

        guestSet.remove(guestToRemove);
    }

    public int countGuests() {
        return guestSet.size();
    }

    public void showGuests() {
        System.out.println(guestSet);
    }

    public static void main(String[] args) {
        GuestSet guestSet = new GuestSet();
        
        guestSet.addGuest("Karen", 1);
        guestSet.addGuest("Gwen", 2);
        guestSet.addGuest("John", 3);
        guestSet.addGuest("Scammer", 3);
        guestSet.showGuests();

        guestSet.removeGuest(3);
        guestSet.showGuests();

    }
}
