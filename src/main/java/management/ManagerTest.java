package management;



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
   public void canGetNiNumber(){
        assertEquals(54422153, manager.getNiNumber());
   }

   @Test
    public void canGetName(){
        assertEquals("Pablo", manager.getName());
   }

   @Test void canGetSalaryr(){
        assertEquals(260000.00, manager.getSalary());
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







