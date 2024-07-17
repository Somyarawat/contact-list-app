package contact.list.app;

public class Main {
    public static void main(String[] args) {
        ContactList list = new ContactList();
        Contact contact = new Contact(
                4L,
                "somya",
                7017946960L,
                "somyarawat2005@gmail.com"
        );
        Contact contact1 = new Contact(
                5L,
                "ananya",
                9368582985L,
                "ananyasingh17@gmail.com"
        );
        Contact contact2 = new Contact(
                6L,
                "harshita",
                9870506092L,
                "harshita20@gmail.com"
        );
        Contact contact3 = new Contact(
                7L,
                "vaishnavi",
                2759403047L,
                "vaishnavi25@gmail.com"
        );Contact contact4 = new Contact(
                8L,
                "nandini",
                4647484947L,
                "nandini24@gmail.com"
        );
        Student student = new Student(
                91L,
                "Shreyansh",
                1234567890L,
                "Shreyansh2@gmail.com",
                2215001758L,
                "m",
                7.09
        );
        Faculty faculty = new Faculty(
                21L,
                "dbc",
                2345678901L,
                "dbc24@gmail.com",
                "CS",
                50000,
                "Professor"


        );
        list.addContact(contact);
        list.addContact(contact1);
        list.addContact(contact2);
        list.addContact(contact3);
        list.addContact(contact4);
        list.addContact(student);
        list.addContact(faculty);
        for (Contact object : list.contactList) {
            switch(object) {
                case Student studentObject ->
                        System.out.println(
                                studentObject.cpi
                        );

                default -> {
                    throw new IllegalStateException("Unexpected value: " + object);
                }
            }
        }



    }
}
