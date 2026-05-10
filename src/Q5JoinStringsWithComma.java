import java.util.List;
import java.util.stream.Collectors;

public class Q5JoinStringsWithComma {
    public static String joinWithComma(List<String> values) {
        return values.stream()
                .collect(Collectors.joining(","));
    }
}
