public class Employee {
    private final String name;
    private int salary;
    private String department;
    int id;

    static  int counter = 0;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = counter;
        counter++;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getId() {
        return this.id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "ФИО: " + this.name + ". Зарплата:" + this.salary + ". Отдел: " + this.department;
    }

    public static void getListAll() {
        for (Employee employee : Main.storage) {
            System.out.println(employee);
        }
    }
    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : Main.storage) {
            sum += employee.salary;
        }
        System.out.println("\nСумма затрат на зарплаты в месяц: "+ sum);
        return sum;
    }

    public static void findMinSalary() {
        int min = Main.storage[0].salary;
        String name = Main.storage[0].name;
        for (Employee i : Main.storage) {
            if (i.salary < min) {
                min = i.salary;
                name = i.name;
            }
        }
        System.out.println("\nСотрудник с минимальной зарплатой: " + name+ ". Зарплата: "+ min);

    }
    public static void findMaxSalary() {
        int max = Main.storage[0].salary;
        String name = Main.storage[0].name;
        for (Employee i : Main.storage) {
            if (i.salary > max) {
                max = i.salary;
                name = i.name;
            }
        }
        System.out.println("\nСотрудник с максимальной зарплатой: " + name+ ". Зарплата: "+ max);

    }
    public static void findAverageSalary() {
        int averageSalary = sumSalary() / Main.storage.length;
        System.out.println("\nСреднее значение зарплат сотрудников: " + averageSalary +"\n");
    }

    public static void getAllName() {
        for (Employee i : Main.storage){
            System.out.println(i.name);
        }
    }
}
