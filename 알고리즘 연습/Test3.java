import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        int r = solution();
        System.out.println(r);
    }

    public static int solution() {
        int result = 0;
        List<Double> list = new ArrayList<>();
        list.add(1.1);
        list.add(1.2);
        list.add(1.3);
        list.add(1.4);
        int[] arr = list.stream().mapToInt(i->(int)Double.parseDouble(i+"")).toArray();
        for (int a : arr) {
            System.out.println(a);
        }
        return result;
    }
}