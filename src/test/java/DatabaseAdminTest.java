import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin dbadmin;

    @Before
    public void before(){
        dbadmin = new DatabaseAdmin("John", "S182727819D",20000);
    }

    @Test
    public void canGetName(){
        assertEquals("John", dbadmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("S182727819D", dbadmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20000, dbadmin.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        dbadmin.raiseSalary(1000);
        assertEquals(21000, dbadmin.getSalary(),0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, dbadmin.payBonus(),0.001);
    }

}
