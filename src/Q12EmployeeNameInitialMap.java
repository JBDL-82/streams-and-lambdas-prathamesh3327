import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Q12EmployeeNameInitialMap {
    public static Map<Character, List<String>> nameInitialMap(List<String> names) {
        return names.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty())
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
    }
}
