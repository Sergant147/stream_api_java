import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class DistinctArrayExample {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "kiwi"};
        List<String> distinctWords = Stream.of(words)
                                           .distinct()
                                           .collect(Collectors.toList());
        System.out.println(distinctWords);
    }
}