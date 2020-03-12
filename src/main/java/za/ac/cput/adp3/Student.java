package za.ac.cput.adp3;

public class Student extends Person {

    private int stdId;

    public Student(String name, String surname, int age, String address, String sex, int stdId) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setAddress(address);
        setSex(sex);
        this.stdId = stdId;
    }

    @Override
    String printPerson() {
        return String.format("Student = {student id: %d, name: %s, surname: %s, age: %d, address: %s}",
                stdId, getName(), getSurname(), getAge(), getAddress());
    }
}
