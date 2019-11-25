import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Tim","J74839382D",100000,"Insurance", 1000000);
    }

    @Test
    public void canGetName(){
        assertEquals("Tim", director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("J74839382D", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100000, director.getSalary(), 0.001);
    }

    @Test
    public void canGetDeptname(){
        assertEquals("Insurance", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(101000, director.getSalary(),0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2000, director.payBonus(),0.001);
    }

}
