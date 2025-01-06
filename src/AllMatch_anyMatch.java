mport java.util.Arrays;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntStream numberStream = Arrays.stream(numbers);
        boolean isThereTen = numberStream.anyMatch(part -> part == 10);
        numberStream = Arrays.stream(numbers);
        boolean areAllLessThanNine = numberStream.allMatch(part -> part < 9);
        System.out.println(isThereTen);
        System.out.println(areAllLessThanNine);
    }
}