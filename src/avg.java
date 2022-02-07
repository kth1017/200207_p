// 1번 응용
import java.util.Map;
import java.util.HashMap;

public class avg {
    public static void main(String[] args) {
        Map<String,Integer> score = new HashMap<>();
        score.put("kor", 80);
        score.put("eng", 75);
        score.put("math", 55);
        int sum = 0;
        for (String Key : score.keySet()) {
            sum += score.get(Key);
        }
        System.out.println(sum/score.size());
    }
}
