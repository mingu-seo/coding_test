package level1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Lesson42748
 */
public class P42889 {

    public static void main(String[] args) {
        int[] result = solution(4, new int[]{4,4,4,4,4});
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Double[][] result = new Double[N][2];
        for (int i=1; i<=N; i++) {
            // 현재스테이지번호개수 / 현재스테이지번호보다큰개수(스테이지완료한)
            int curStage = 0;
            int comStage = 0;
            for (int j=0; j<stages.length; j++) {
                if (i == stages[j]) {
                    curStage++;
                }
                if (stages[j] >= i) {
                    comStage++;
                }
                
            }
            result[i-1][0] = (double)i; 
            result[i-1][1] = curStage/(double)comStage; 
        }
        Arrays.sort(result, new Comparator<Double[]>() {

            @Override
            public int compare(Double[] o1, Double[] o2) {
                if (o2[1] < o1[1]) {
                    return -1;
                } else if (o2[1] > o1[1]) {
                    return 1;
                } else {
                    return 0;
                }
            }
            
        });

        // for (Double[] d : result) {
        //     System.out.println(d[0]+":"+d[1]);
        // }
        for (int i=0; i<answer.length; i++) {
            answer[i] = (result[i][0]).intValue();
        }
        return answer;
    }
}