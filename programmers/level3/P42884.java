package level3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * P42884
 */
public class P42884 {

    public static void main(String[] args) {
        P42884 p = new P42884();
        int result = p.solution(new int[][] { { -20, -15 }, { -14, -5 }, { -18, -13 }, { -5, -3 } });
        System.out.println(result);
    }

    public int solution(int[][] routes) {
        int answer = 0;
        // 나간지점 오름차순으로 정렬하게 되면 나간지점에 카메라 설치 시 다른 이동경로와 겹쳐지게 됨
        Arrays.sort(routes, (o1, o2) -> {
            return o1[1] - o2[1];
        });

        // for (int[] r : routes) {
        // System.out.println(Arrays.toString(r));
        // }
        int point = Integer.MIN_VALUE;
        for (int[] r : routes) {
            if (point < r[0] || point > r[1]) {
                point = r[1];
                answer++;
            }
        }

        return answer;
    }
}