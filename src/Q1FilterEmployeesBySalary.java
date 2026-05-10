import java.util.List;
import java.util.stream.Collectors;

public class Q1FilterEmployeesBySalary {
    public static class Employee {
        private final String name;
        private final double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static List<Employee> filterBySalary(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .collect(Collectors.toList());
    }
}
