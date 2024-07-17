package contact.list.app;

public class Faculty extends Contact {
    String department;
    int salary;
    String designation;

    @Override
    public String toString() {
        return "Faculty{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public Faculty(long id, String name, long phoneNumber, String email, String department, int salary, String designation) {
        super(id, name, phoneNumber, email);
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }

    public Faculty(long id, String name, long phoneNumber, String email) {
        super(id, name, phoneNumber, email);
    }
}
