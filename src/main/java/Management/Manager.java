package Management;

import Staff.Employee;

public class Manager extends Employee {

    protected String deptName;

    public Manager(String name, String NINumber, double salary, String deptName){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
