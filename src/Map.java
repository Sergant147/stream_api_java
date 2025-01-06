import java.util.stream.IntStream;
import java.util.Arrays;
public class Map {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};
        Stream stream = Arrays.stream(numbers);
        int[] out = stream.map(part -> part * 2);
        System.out.println(out);
    }
}