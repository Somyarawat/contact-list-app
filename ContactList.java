package contact.list.app;

import java.util.LinkedList;
import java.util.List;

public class ContactList {
    List<Contact> contactList;

    public ContactList() {
        contactList = new LinkedList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }
}
