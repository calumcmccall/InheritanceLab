import Management.Manager;
import TechStaff.DatabaseAdmin;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Tom", "EE124", 25000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Tom", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("EE124", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void raiseSalaryWorks(){
        databaseAdmin.raiseSalary(3.5);
        assertEquals(87500.0, databaseAdmin.getSalary(),0.00);
    }

    @Test
    public void getBonusWorks(){
        assertEquals(250.0, databaseAdmin.payBonus(),0.00);
    }

}
