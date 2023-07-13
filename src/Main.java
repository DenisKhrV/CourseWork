public class Main {
    static  Employee[] storage = new Employee[10];

    public static void main(String[] args) {
        storage[0] = new Employee("Иванов Иван Иванович", 90000, "1");
        storage[1] = new Employee("Иванов Иван Степанович", 105000, "2");
        storage[2] = new Employee("Ким Дмитрий Дмитриевич", 125000, "3");
        storage[3] = new Employee("Петров Степан Семёнович", 70000, "4");
        storage[4] = new Employee("Медведев Александр Викторович", 120000, "2");
        storage[5] = new Employee("Окунев Виктор Петрович", 50000, "2");
        storage[6] = new Employee("Трутнев Сергей Петрович", 70000, "5");
        storage[7] = new Employee("Лебедев Сергей Юрьевич", 60000, "5");
        storage[8] = new Employee("Пушкин Артём Фёдорович", 45000, "1");
        storage[9] = new Employee("Трутнев Сергей Петрович", 65000, "4");

        Employee.getListAll();
        Employee.sumSalary();
        Employee.findMinSalary();
        Employee.findMaxSalary();
        Employee.findAverageSalary();
        Employee.getAllName();


    }
}