import management.Director;
import org.junit.Before;
import org.junit.Test;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Charlie Schmidt", 4432999211, "1000000", "Board Room");

        @Test
        public void canGetName () {
            assertEquals("Charlie Schmid", director.getName());
        }

        @Test
        public void canGetSalar() {
            assertEquals(1000000, director.getSalary());
        }

        @Test
        public void canGetniNumber() {
            assertEquals(443299921, director.getNiNumber())
        }

        @Test
        public void canGetDeptName() {
            assertEquals("Board Room", director.getDeptName())
        }

        @Test
        public void canGetBonus() {
            director.payBonus(10000);
            assertEquals(10010000.00, director.payBonus());
        }

        @Test
        public void canRaiseSalary() {
            director.raiseSalary(500000);
            assertEquals(1500000.00, director.getSalary());
        }
    }
}





