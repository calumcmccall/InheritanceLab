import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Tom", "EE124", 25000.00, "HR");
    }

    @Test
    public void canGetName(){
        assertEquals("Tom", manager.getName());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void raiseSalaryWorks(){
        manager.raiseSalary(3.5);
        assertEquals(87500.0, manager.getSalary(),0.00);
    }

    @Test
    public void getBonusWorks(){
        assertEquals(250.0, manager.payBonus(),0.00);
    }

}
