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

}
