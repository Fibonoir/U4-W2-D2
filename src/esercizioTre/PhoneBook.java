package esercizioTre;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String number) {
        contacts.put(name, number);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public String getName(String number) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String getNumber(String name) {
        return contacts.get(name);
    }

    public void printAllContacts() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("John", "1234567890");
        phoneBook.addContact("Jane", "0987654321");
        phoneBook.addContact("Alice", "1111111111");
        phoneBook.addContact("Bob", "2222222222");

        phoneBook.printAllContacts();

        System.out.println("\nJohn's number: " + phoneBook.getNumber("John"));
        System.out.println("0987654321 belongs to: " + phoneBook.getName("0987654321"));

        phoneBook.removeContact("Alice");
        System.out.println("\nAll contacts fter removing Alice:");
        phoneBook.printAllContacts();
    }
}
