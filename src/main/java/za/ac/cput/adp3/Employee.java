package za.ac.cput.adp3;

public class Employee extends Person {

    private double salary;

    public Employee(String name, String surname, int age, String address, String sex, double salary) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setAddress(address);
        setSex(sex);
        this.salary = salary;
    }

    @Override
    String printPerson() {
        return String.format("Employee = {name: %s, surname: %s, age: %d, address: %s, salary: %.2f}",
                getName(), getSurname(), getAge(), getAddress(), salary);
    }
}
