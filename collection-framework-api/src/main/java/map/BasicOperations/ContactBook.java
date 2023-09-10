package main.java.map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    // Attributes
    private Map<String, Integer> contactBookMap;

    // Constructor
    public ContactBook() {
        this.contactBookMap = new HashMap<>();
    }
    
    // Methods
    public void addContact(String name, Integer number) {
        contactBookMap.put(name, number);
    }

    public void removeContact(String name) {
        if (!(contactBookMap.isEmpty())) {
            contactBookMap.remove(name);
        }
    }

    public void showContacts() {
        System.out.println(contactBookMap);
    }

    public Integer searchByName(String name) {
        Integer numberByName = null;
        if (!(contactBookMap.isEmpty())) {
            numberByName = contactBookMap.get(name);
        }

        return numberByName;
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact("Amy", 147850);
        contactBook.addContact("Amy", 147852);
        contactBook.addContact("Carl", 963258);
        contactBook.addContact("Carl Johnson", 963258);
        contactBook.addContact("Sandy", 153759);
        contactBook.showContacts();

        contactBook.removeContact("Carl");
        contactBook.showContacts();

    }
}
