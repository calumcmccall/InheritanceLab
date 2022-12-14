import Management.Manager;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Tom", "EE124", 25000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Tom", developer.getName());
    }


    @Test
    public void canGetNINumber(){
        assertEquals("EE124", developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, developer.getSalary(), 0.00);
    }

    @Test
    public void raiseSalaryWorks(){
        developer.raiseSalary(3.5);
        assertEquals(87500.0, developer.getSalary(),0.00);
    }

    @Test
    public void getBonusWorks(){
        assertEquals(250.0, developer.payBonus(),0.00);
    }

    @Test
    public void cantMakeNegativeRaise(){
        developer.raiseSalary(-2.50);
        assertEquals(25000.00, developer.getSalary(),0.00);
    }

    @Test
    public void cantGiveNoName(){
        developer.setName("");
        assertEquals("Tom", developer.getName());
    }

}
