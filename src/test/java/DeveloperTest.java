import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("James", "S174637829D",21000);
    }

    @Test
    public void canGetName(){
        assertEquals("James", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("S174637829D", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(21000, developer.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(22000, developer.getSalary(),0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(210, developer.payBonus(),0.001);
    }

    @Test
    public void canSetName(){
        developer.setName("Roy");
        assertEquals("Roy", developer.getName());
    }

    @Test
    public void cannotSetNameToNull(){
        developer.setName(null);
        assertEquals("James", developer.getName());
    }
}
