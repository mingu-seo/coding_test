package level1;

import java.util.ArrayList;
import java.util.List;

/**
 * Lesson42748
 */
public class P42840 {

    public static void main(String[] args) {
        int[] result = solution(new int[]{1,3,2,4,2});
        for (int a : result) {
            System.out.println(a);
        }
    }

    public static int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] man1 = new int[]{1,2,3,4,5};
        int[] man2 = new int[]{2,1,2,3,2,4,2,5};
        int[] man3 = new int[]{3,3,1,1,2,2,4,4,5,5};

        

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == man1[i % man1.length]) {
                answer[0]++;
            }
            if (answers[i] == man2[i % man2.length]) {
                answer[1]++;
            }
            if (answers[i] == man3[i % man3.length]) {
                answer[2]++;
            }
        }
        int max = 0;
        for (int i=0; i<answer.length; i++) {
            if (max < answer[i]) max = answer[i];
        }
        List<Integer> man = new ArrayList<>();
        for (int i=0; i<answer.length; i++) {
            if (max == answer[i]) {
                man.add(i+1);
            }
        }
        return man.stream().mapToInt(i->i).toArray();
    }
}