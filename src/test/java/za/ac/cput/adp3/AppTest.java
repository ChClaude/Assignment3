package za.ac.cput.adp3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private Student student1;
    private Employee employee1;
    private Person person;

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
        person = new Student("lilia", "Moore", 45, "12 Avenue Street", "female",2154878);
    }

    @Test
    public void testEncapsulation() {

    }

    @Test
    public void testInheritance() {
        assertEquals(student1, person);
    }

    @Test
    public void testPolymorphism() {

    }
}
