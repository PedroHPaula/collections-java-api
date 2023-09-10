package main.java.set.Search;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
    // Attributes
    private Set<Contact> contactSet;

    public ContactBook() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int number) {
        contactSet.add(new Contact(name, number));
    }

    public void showContacts() {
        System.out.println(contactSet);
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();
        for (Contact contact : contactSet) {
            if (contact.getName().startsWith(name)) {
                contactsByName.add(contact);
            }
        }

        return contactsByName;
    }

    public Contact updateContactNumber(String name, int newNumber) {
        Contact updatedContact = null;
        for (Contact contact : contactSet) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setNumber(newNumber);
                updatedContact = contact;
                break;
            }
        }

        return updatedContact;
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact("Goofy", 123456);
        contactBook.addContact("Donald", 456789);
        contactBook.addContact("Mickey", 426486);
        contactBook.addContact("Mickey Mouse", 153789);
        contactBook.addContact("Mickey", 446486);

        contactBook.showContacts();

        System.out.println(contactBook.searchByName("Mickey"));
        System.out.println(contactBook.searchByName("Mickey Mouse"));

        contactBook.updateContactNumber("Goofy", 654123);
        contactBook.showContacts();

    }
}
