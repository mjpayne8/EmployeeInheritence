import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jason", "JS11919920D", 24000, "Insurance");
    }

    @Test
    public void canGetName(){
        assertEquals("Jason", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("JS11919920D", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(24000, manager.getSalary(), 0.001);
    }

    @Test
    public void canGetDeptname(){
        assertEquals("Insurance", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(25000, manager.getSalary(),0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(240, manager.payBonus(),0.001);
    }
}
