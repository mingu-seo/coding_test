package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lesson42748
 */
public class P68644 {

    public static void main(String[] args) {
        int[] result = solution(new int[]{2,1,3,4,1});
        for (int a : result) {
            System.out.println(a);
        }
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                System.out.println(i+":"+j);
                int v = numbers[i]+numbers[j];
                if (!list.contains(v)) list.add(v);
            }
        }
        Collections.sort(list);
        
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}