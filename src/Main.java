import java.util.Objects;

public class Main {
        static  Employee[] storage = new Employee[10];

    public static void main(String[] args) {
        storage[0] = new Employee("Иванов Иван Иванович", 90000, "1");
        storage[1] = new Employee("Иванов Иван Степанович", 35000, "2");
        storage[2] = new Employee("Ким Дмитрий Дмитриевич", 125000, "3");
        storage[3] = new Employee("Петров Степан Семёнович", 70000, "4");
        storage[4] = new Employee("Медведев Александр Викторович", 120000, "2");
        storage[5] = new Employee("Окунев Виктор Петрович", 50000, "2");
        storage[6] = new Employee("Трутнев Сергей Петрович", 70000, "5");
        storage[7] = new Employee("Лебедев Сергей Юрьевич", 60000, "5");
        storage[8] = new Employee("Пушкин Артём Фёдорович", 45000, "1");
        storage[9] = new Employee("Трутнев Сергей Петрович", 65000, "4");

        indexSalary(5);
        printListAll();
        sumSalary();
        findMinSalary();
        findMaxSalary();
        findAverageSalary();
        printAllName();
        findMinSalaryInDepartment("2");
        findMaxSalaryInDepartment("2");
        sumSalaryInDepartment("2");
        System.out.println("\nСумма затрат на зарплаты в отделе в месяц: "+sumSalaryInDepartment("2")+"\n");
        findAverageSalaryInDep("2");
        indexSalaryInDep(10,"2");
        printListAll("2");
        employeesSalaryLower(50000);
        employeesSalaryGreater(100000);


    }

    private static void printListAll() {
        for (Employee employee : storage) {
            System.out.println(employee);
        }
    }
    private static double sumSalary() {
        double sum = 0;
        for (Employee employee : Main.storage) {
            sum += employee.getSalary() ;
        }
        System.out.println("\nСумма затрат на зарплаты в месяц: "+ sum);
        return sum;
    }

    private static void findMinSalary() {
        double min = Main.storage[0].getSalary();
        String name = Main.storage[0].getName();
        for (Employee i : Main.storage) {
            if (i.getSalary()< min) {
                min = i.getSalary();
                name = i.getName();
            }
        }
        System.out.println("\nСотрудник с минимальной зарплатой: " + name+ ". Зарплата: "+ min);

    }
    private static void findMaxSalary() {
        double max = Main.storage[0].getSalary();
        String name = Main.storage[0].getName();
        for (Employee i : Main.storage) {
            if (i.getSalary() > max) {
                max = i.getSalary();
                name = i.getName();
            }
        }
        System.out.println("\nСотрудник с максимальной зарплатой: " + name+ ". Зарплата: "+ max);

    }
    private static void findAverageSalary() {
        double averageSalary = sumSalary() / storage.length;
        System.out.println("\nСреднее значение зарплат сотрудников: " + averageSalary +"\n");
    }

    private static void printAllName() {
        for (Employee i : Main.storage){
            System.out.println(i.getName());
        }
    }
    private static void indexSalary(double percent) {
        for (Employee employee : Main.storage){
            double addition = employee.getSalary() / 100 * percent;
            employee.setSalary(employee.getSalary() + addition);
        }
    }

    private static double sumSalaryInDepartment(String department) {
        double sum = 0;
        for (Employee i : Main.storage){
            if (department.equals(i.getDepartment())) {
                sum += i.getSalary();
            }
        }
        return sum;
    }
    private static void findMinSalaryInDepartment(String department) {
        Employee minEmployee = null;
        for (Employee employee : Main.storage){
            if (!Objects.equals(employee.getDepartment(), department)) {
                continue;
            }
            if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        if (minEmployee != null) {
            System.out.println("\nСотрудник с минимальной зарплатой в отделе " +department+ ": "+ minEmployee.getName() + ". Зарплата: "+ minEmployee.getSalary());
            }
        }

    private static void findMaxSalaryInDepartment(String department) {
        Employee maxEmployee = null;
        for (Employee employee : storage){
            if (!department.equals(employee.getDepartment())) {
                continue;
            }
            if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        if (maxEmployee != null) {
            System.out.println("\nСотрудник с максимальной зарплатой в отделе " + department + ": " + maxEmployee.getName() + ". Зарплата: " + maxEmployee.getSalary());
        }
        }
    private static void findAverageSalaryInDep(String department) {
        int count = 0;
        for (Employee i : Main.storage) {
            if (department.equals(i.getDepartment())) {
                count += 1;
            }
        }
        double averageSalary = sumSalaryInDepartment(department) / count;
        System.out.println("Среднее значение зарплат сотрудников в Отделе "+ department+ ": " + averageSalary +"\n");
    }

//    private static int countEmployeesInDep(String department) {
//        int count = 0;
//        for (Employee i : Main.storage){
//            if (department.equals(i.getDepartment())) {
//                count += 1;
//            }
//        }
//        return count;
//    }
    private static void printListAll(String department) {
        for (Employee employee : Main.storage) {
            if (department.equals(employee.getDepartment())) {
                System.out.println("ФИО "+ employee.getName()+". Зарплата: "+employee.getSalary());
            }
        }
    }
    private static void indexSalaryInDep(double percent, String department) {
        for (Employee employee : Main.storage){
            if (department.equals(employee.getDepartment())) {
                double addition = employee.getSalary() / 100 * percent;
                employee.setSalary(employee.getSalary() + addition);
            }
        }
    }

    private static void employeesSalaryLower(double salary) {
        System.out.println();
        for (Employee employee : storage) {
            if (employee.getSalary() < salary) {
                System.out.println("id "+ employee.getId()+ ". ФИО: "+employee.getName()+". Зарплата: "+employee.getSalary());
            }
        }
    }
    private static void employeesSalaryGreater(double salary) {
        System.out.println();
        for (Employee employee : storage) {
            if (employee.getSalary() >= salary) {
                System.out.println("id "+ employee.getId()+ ". ФИО: "+employee.getName()+". Зарплата: "+employee.getSalary());
            }
        }
    }

}