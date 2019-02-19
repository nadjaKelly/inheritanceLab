import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdministrator;

public class DatabaseAdministratorTest {

    DatabaseAdministrator databaseAdministrator;

    @Before
    public void before(){
        databaseAdministrator = new DatabaseAdministrator("Greta", 779009898, 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("Greta", databaseAdministrator.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals(779009898, databaseAdministrator.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, databaseAdministrator.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdministrator.raiseSalary(4000.00);
        assertEquals(34000.00, databaseAdministrator.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(16000.00, databaseAdministrator.payBonus());
    }
}
