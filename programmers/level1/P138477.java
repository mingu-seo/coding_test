package level1;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * Lesson42748
 */
public class P138477 {

    public static void main(String[] args) {
        int[] result = solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        for (int a : result) {
            System.out.println(a);
        }
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
            if (list.size() > k) {
                for (int j=k; j<list.size(); j++) {
                    list.remove(j);
                }
            }
            answer[i] = list.get(list.size()-1);
        }
        return answer;
    }
}