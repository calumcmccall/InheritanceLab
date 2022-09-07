import Management.Director;
import Management.Manager;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Tom", "EE124", 25000.00, "HR", 125000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Tom", director.getName());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR", director.getDeptName());
    }

    @Test
    public void raiseSalaryWorks(){
        director.raiseSalary(3.5);
        assertEquals(87500.0, director.getSalary(),0.00);
    }

    @Test
    public void hasBudget(){
        assertEquals(125000.00, director.getBudget(), 0.00);
    }

    @Test
    public void directorTwoPercentBonus(){
        assertEquals(500.00, director.payBonus(), 0.00);
    }

}
