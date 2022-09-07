package Staff;

public abstract class Employee {

    protected String name;
    protected String NINumber;
    protected double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        if(raise > 0.00) {
            this.salary *= raise;
        }
    }
    
    public double payBonus(){
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if(name != "") {
            this.name = name;
        }
    }
}
