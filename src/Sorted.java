import java.util.*;
import java.util.stream.Stream;
public class Sorted {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 3, 7};
        Stream stream = numbers.stream();
        int[] out = stream.sorted();
        System.out.println(out);
    }
}