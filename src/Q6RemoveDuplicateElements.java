import java.util.List;
import java.util.stream.Collectors;

public class Q6RemoveDuplicateElements {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
