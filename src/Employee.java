import java.util.Objects;

public class Employee {
    private static long ID_COUNTER = 0;
    private final String name;
    private double salary;
    private String department;
    private long id;


    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = ID_COUNTER;
        ID_COUNTER++;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDepartment() {
        return this.department;
    }

    public long getId() {
        return this.id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ФИО: " + this.name + ". Зарплата:" + this.salary + ". Отдел: " + this.department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, department, id);
    }

}


