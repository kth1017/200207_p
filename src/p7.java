// 7
import java.util.ArrayList;
import java.util.Arrays;

public class p7 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList); // [Life, is, too, short] 출력
        String result = String.join(" ",myList);
        System.out.println(result);
    }
}

// string은 객체 생성시 항상 새로운 값을 생성한다

