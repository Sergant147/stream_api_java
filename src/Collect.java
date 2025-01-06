import java.util.*;
import java.util.stream.Collectors;
public class Collect {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        String joinedNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joinedNames);
    }
}