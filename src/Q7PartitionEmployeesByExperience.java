import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q7PartitionEmployeesByExperience {
    public static class Employee {
        private final String name;
        private final int experience;

        public Employee(String name, int experience) {
            this.name = name;
            this.experience = experience;
        }

        public String getName() {
            return name;
        }

        public int getExperience() {
            return experience;
        }
    }

    public static Map<Boolean, List<Employee>> partitionByExperience(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getExperience() >= 5));
    }
}
