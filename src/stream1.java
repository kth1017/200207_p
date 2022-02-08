import java.util.Arrays;
import java.util.Comparator;

public class stream1 {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data).boxed().filter((a) -> a % 2 == 0).distinct()
                .sorted(Comparator.naturalOrder()).mapToInt(Integer::intValue).toArray()
                ; // 2, 4, 6 , 8
        System.out.println(Arrays.toString(result));
    }
}
