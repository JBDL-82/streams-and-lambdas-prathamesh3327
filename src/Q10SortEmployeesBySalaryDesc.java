import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q10SortEmployeesBySalaryDesc {
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

    public static List<Employee> sortBySalaryDesc(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }
}
