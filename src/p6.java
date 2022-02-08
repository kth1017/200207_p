// 6
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



public class p6 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        System.out.println(myList); // [1, 3, 5, 4, 2] 출력
        myList.sort(Comparator.naturalOrder()); // 소트메소드는 리턴이 없고 정렬만 함
        System.out.println(myList);
    }
}


