public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee(new Employee("Иванов Иван Иванович", 90000, 1));
        employeeBook.addEmployee(new Employee("Иванов Иван Степанович", 35000, 2));
        employeeBook.addEmployee(new Employee("Ким Дмитрий Дмитриевич", 125000, 3));
        employeeBook.addEmployee(new Employee("Петров Степан Семёнович", 70000, 4));
        employeeBook.addEmployee(new Employee("Медведев Александр Викторович", 120000, 2));
        employeeBook.addEmployee(new Employee("Окунев Виктор Петрович", 50000, 2));
        employeeBook.addEmployee(new Employee("Трутнев Сергей Петрович", 70000, 5));
        employeeBook.addEmployee(new Employee("Лебедев Сергей Юрьевич", 60000, 5));
        employeeBook.addEmployee(new Employee("Пушкин Артём Фёдорович", 45000, 1));
        employeeBook.addEmployee(new Employee("Трутнев Сергей Петрович", 25000, 4));

        employeeBook.removeEmployee("Иванов Иван степанович");

        employeeBook.printListAll();
        employeeBook.sumSalary();
        System.out.println("\nСумма затрат на зарплаты в месяц: " + employeeBook.sumSalary());
        employeeBook.findMinSalary();
        employeeBook.findMaxSalary();
        employeeBook.findAverageSalary();
        System.out.printf("\nСреднее значение зарплат сотрудников: %.2f", employeeBook.findAverageSalary());
        employeeBook.printAllName();
        employeeBook.indexSalary(5);
        employeeBook.findMinSalaryInDepartment(4);
        employeeBook.findMaxSalaryInDepartment(2);
        employeeBook.sumSalaryInDepartment(2);
        System.out.println("\nСумма затрат на зарплаты в отделе в месяц: " + employeeBook.sumSalaryInDepartment(2));
        employeeBook.findAverageSalaryInDep(2);
        System.out.printf("\nСреднее значение зарплат сотрудников в отделе: %.2f", employeeBook.findAverageSalaryInDep(2));
        employeeBook.indexSalaryInDep(10, 4);
        employeeBook.printListAll(4);
        employeeBook.employeesSalaryLower(50000);
        employeeBook.employeesSalaryGreater(100000);
        employeeBook.updateSalary("Ким Дмитрий Дмитриевич", 40000);
        employeeBook.updateDepartment("Ким Дмитрий Дмитриевич", 2);
        employeeBook.groupByDepartment();

    }


}