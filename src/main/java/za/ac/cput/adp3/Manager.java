package za.ac.cput.adp3;

public class Manager {

    private Employee employee;
    private String role;

    public Manager(String name, String surname, int age, String address, String sex, double salary, String role) {
        this.employee = new Employee(name, surname, age, address, sex, salary);
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }
}
