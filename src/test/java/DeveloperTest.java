import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

Developer developer;

@Before
    public void before(){
    developer = new Developer("Nele", 3330048483, 28000.00);
}

@Test
    public void canGetName(){
    assertEquals("Nele", developer.getName());
}

@Test
    public void canGetniNumber(){
    assertEquals(3330048483, developer.getNiNumber());
}

@Test
public void canGetSalary(){
assertEquals(28000, developer.getSalary());
}

@Test
public void canRaiseSalary(){
    developer.raiseSalary(1000.00);
    assertEquals(29000.00, developer.getSalary());
}

@Test public void canGetBonus(){
assertEquals(10000.00, developer.payBonus());
}


}
