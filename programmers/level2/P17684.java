package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * P17684
 */
public class P17684 {

    public static void main(String[] args) {
        P17684 p = new P17684();
        // int[] result = p.solution("KAKAO");
        // int[] result = p.solution("TOBEORNOTTOBEORTOBEORNOT");
        int[] result = p.solution("ABABABABABABABAB");
        System.out.println(Arrays.toString(result));

    }

    public int[] solution(String msg) {
        int[] answer = {};
        Map<String, Integer> dict = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 26; i++) {
            dict.put(String.valueOf((char) (i + 64)), i);
        }
        int nextValue = 27;

        for (int i = 0; i < msg.length(); i++) {
            String key = String.valueOf(msg.charAt(i));

            // 마지막문자인경우
            if (i == msg.length() - 1) {
                result.add(dict.get(key));
                break;
            }

            String next = "";
            if (i < msg.length() - 1) {
                next = String.valueOf(msg.charAt(i + 1));
            }
            // System.out.println(key + "," + next);
            while (dict.get(key + next) != null) {
                key += next;
                i++;
                if (i >= msg.length() - 1) {
                    next = "";
                    break;
                }
                next = String.valueOf(msg.charAt(i + 1));
            }

            if (dict.get(key + next) == null) {
                dict.put(key + next, nextValue);
                nextValue++;
            }
            if (dict.get(key) != null) {
                result.add(dict.get(key));
            }

        }
        // System.out.println(result);
        // System.out.println(dict);
        answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}