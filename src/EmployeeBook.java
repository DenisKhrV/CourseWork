public class EmployeeBook {
    private final Employee[] storage = new Employee[10];

    public void printListAll() {
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public double sumSalary() {
        double sum = 0;
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public void findMinSalary() {
        double min = storage[0].getSalary();
        String name = storage[0].getName();
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println("\nСотрудник с минимальной зарплатой: " + name + ". Зарплата: " + min);

    }

    public void findMaxSalary() {
        double max = storage[0].getSalary();
        String name = storage[0].getName();
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println("\nСотрудник с максимальной зарплатой: " + name + ". Зарплата: " + max);

    }

    public double findAverageSalary() {
        int count = 0;
        double sum = 0;
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
            count += 1;
        }
        return sum / count;
    }

    public void printAllName() {
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getName());
        }
    }

    public void printAllName(int department) {
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.println(employee.getName());
            }
        }
    }

    public void indexSalary(double percent) {
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            double addition = employee.getSalary() / 100 * percent;
            employee.setSalary(employee.getSalary() + addition);
        }
    }

    public double sumSalaryInDepartment(int department) {
        double sum = 0;
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public void findMinSalaryInDepartment(int department) {
        Employee minEmployee = null;
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        if (minEmployee != null) {
            System.out.println("\nСотрудник с минимальной зарплатой в отделе " + department + ": " + minEmployee.getName() + ". Зарплата: " + minEmployee.getSalary());
        }
    }

    public void findMaxSalaryInDepartment(int department) {
        Employee maxEmployee = null;
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department) {
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

    public double findAverageSalaryInDep(int department) {
        int count = 0;
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                count += 1;
            }
        }
        //        System.out.println("Среднее значение зарплат сотрудников в Отделе " + department + ": " + averageSalary + "\n");
        return sumSalaryInDepartment(department) / count;
    }

    public void printListAll(int department) {
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                System.out.println("ФИО " + employee.getName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

    public void indexSalaryInDep(double percent, int department) {
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                double addition = employee.getSalary() / 100 * percent;
                employee.setSalary(employee.getSalary() + addition);
            }
        }
    }

    public void employeesSalaryLower(double salary) {
        System.out.println();
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < salary) {
                System.out.println("id " + employee.getId() + ". ФИО: " + employee.getName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

    public void employeesSalaryGreater(double salary) {
        System.out.println();
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() >= salary) {
                System.out.println("id " + employee.getId() + ". ФИО: " + employee.getName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = employee;
                break;
            }
        }
    }

    public void removeEmployee(String name) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                continue;
            }
            if (storage[i].getName().equalsIgnoreCase(name)) {
                storage[i] = null;
                break;
            }
        }
    }

    public void updateSalary(String name, double newSalary) {
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (employee.getName().equalsIgnoreCase(name)) {
                employee.setSalary(newSalary);
                break;
            }
        }
    }

    public void updateDepartment(String name, int department) {
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            if (employee.getName().equalsIgnoreCase(name)) {
                employee.setDepartment(department);
                break;
            }
        }
    }

    public void groupByDepartment() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nСотрудники из отдела " + i);
            printAllName(i);
        }
    }
}

