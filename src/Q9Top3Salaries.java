import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q9Top3Salaries {
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

    public static List<String> top3HighestPaidNames(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }
}
