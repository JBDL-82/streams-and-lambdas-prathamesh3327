import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q11DepartmentsWithNoEmployees {
    public static class Employee {
        private final String name;
        private final String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }
    }

    public static List<String> departmentsWithNoEmployees(List<String> departments, List<Employee> employees) {
        Set<String> assignedDepartments = employees.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toSet());
        return departments.stream()
                .filter(department -> !assignedDepartments.contains(department))
                .collect(Collectors.toList());
    }
}
