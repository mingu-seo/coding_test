package level2;

import java.util.HashMap;
import java.util.Map;

/**
 * P132265
 */
public class P132265 {

    public static void main(String[] args) {
        P132265 p = new P132265();
        int result = p.solution(new int[] { 1, 2, 1, 3, 1, 4, 1, 2 });
        System.out.println(result);
    }

    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> a = new HashMap<>();
        Map<Integer, Integer> b = new HashMap<>();

        for (int t : topping) {
            b.put(t, b.getOrDefault(t, 0) + 1);
        }

        for (int t : topping) {
            b.put(t, b.getOrDefault(t, 0) - 1);
            a.put(t, a.getOrDefault(t, 0) + 1);

            if (b.get(t) == 0)
                b.remove(t);

            if (a.keySet().size() == b.keySet().size()) {
                // System.out.println(a + "|" + b);
                answer++;
            }
        }

        return answer;
    }
}