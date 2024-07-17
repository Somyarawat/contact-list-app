package contact.list.app;

public class Student extends Contact {
    long universityRollNumber;
    String section;
    double cpi;

    public Student(long id, String name, long phoneNumber, String email, long universityRollNumber, String section, double cpi) {
        super(id, name, phoneNumber, email);
        this.universityRollNumber = universityRollNumber;
        this.section = section;
        this.cpi = cpi;
    }

    public Student(long id, String name, long phoneNumber, String email) {
        super(id, name, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Student{" + "universityRollNumber=" + universityRollNumber + ", section='" + section + '\'' + ", cpi=" + cpi + ", id=" + id + ", name='" + name + '\'' + ", phoneNumber=" + phoneNumber + ", email='" + email + '\'' + '}';
    }
}
