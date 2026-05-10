import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Q4EmployeeWithMaxSalary {
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

    public static Optional<Employee> findMaxSalary(List<Employee> employees) {
        return employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
    }
}
