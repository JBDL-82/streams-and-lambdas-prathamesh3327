import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q2WordFrequencyCounter {
    public static Map<String, Long> wordFrequency(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
