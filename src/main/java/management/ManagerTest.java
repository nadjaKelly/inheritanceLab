package management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Pablo", 54422153, 260000, "Outdoor Plants");

    }

   @Test
   public void canGetDeptName(){
        assertEquals("Outdoor Plants", manager.getDeptName());
   }

   @Test
    public void canGetName(){
        assertEquals("Pablo", manager.getName());
   }

   @Test void canGetNiNumber(){
        assertEquals(25000.00, manager.getSalary());
   }

   @Test
    public void canGetRaiseSalary() {
       manager.raiseSalary(16000.00);
       assertEquals(276000.00, manager.raiseSalary());
   }

    @Test
    public void canGetBonus() {
        assertEqals(2600.00, manager.payBonus());

    }

}







