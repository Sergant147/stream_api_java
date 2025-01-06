import java.util.stream.IntStream;
import java.util.Arrays;
public class Filter {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntStream stream = Arrays.stream(numbers);
        int[] out = stream.forEach().filter(part -> part < 5);
        System.out.println(out);
    }
}