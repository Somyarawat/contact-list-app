package contact.list.app;

public class Contact {
    long id;
    String name;
    long phoneNumber;
    String email;

    public Contact(long id, String name, long phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", name='" + name + '\'' + ", phoneNumber=" + phoneNumber + ", email='" + email + '\'' + '}';
    }
}
