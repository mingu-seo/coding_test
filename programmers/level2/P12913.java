package level2;

import java.util.ArrayList;
import java.util.List;

public class P12913 {
    public static void main(String[] args) {
        P12913 p = new P12913();
        int result = p.solution(new int[][] { { 1, 2, 3, 5 }, { 5, 6, 7, 8, }, { 4, 3, 2, 1 } });
        System.out.println(result);
    }

    int solution(int[][] land) {
        int answer = 0;

        int totalMax = 0;
        for (int i = 1; i < land.length; i++) {

            for (int j = 0; j < land[i].length; j++) {
                // 같은 열을 제외한 나머지 값들 중 제일 큰 값 확인
                int rowMax = 0;
                for (int k = 0; k < land[i].length; k++) {
                    if (j != k) { // 같은 열이 아니고
                        int compareValue = land[i - 1][k] + land[i][j];
                        if (compareValue > rowMax) { //
                            rowMax = compareValue;

                        }
                    }
                }
                // 합계값이 현재행의 최대값이 아닐 수 있으므로 현재행 중 최대값이 되도록 값 수정(그래야 다음 행에서 최대값을 계산)
                land[i][j] = rowMax;
                // System.out.println(rowMax);
                if (totalMax < rowMax) {
                    totalMax = rowMax;
                }

            }

        }
        answer = totalMax;
        return answer;
    }

}
