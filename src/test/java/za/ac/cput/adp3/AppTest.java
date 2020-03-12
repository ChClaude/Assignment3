package za.ac.cput.adp3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private Student student1;
    private Employee employee1;
    private Manager manager1;
    private Person person;
    private List<Person> people;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Before
    public void setPeople() {
        student1 = new Student("lilia", "Moore", 45, "12 Avenue Street", "female",2154878);
        employee1 = new Employee("Rami", "Xian", 65, "56 long Street", "female", 95000.00);
        manager1 = new Manager("Alex", "Doe", 65, "01 long Street", "male",
                105000.00, "Operations Management");
        person = new Student("lilia", "Moore", 45, "12 Avenue Street", "female",2154878);

        people = new ArrayList<>();
        people.add(student1);
        people.add(employee1);
        people.add(person);
    }

    @Test
    public void testEncapsulation() {
        assertTrue(manager1.getEmployee() instanceof Employee);
    }

    @Test
    public void testInheritance() {
        assertTrue(student1 instanceof Person);
    }

    @Test
    public void testPolymorphism() {
        assertTrue(((Student) people.get(1) instanceof Student) && ((Employee) people.get(2) instanceof Employee));
    }
}
