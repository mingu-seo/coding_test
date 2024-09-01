package level2;

import java.util.Arrays;

public class P154540 {
    public static void main(String[] args) {
        P154540 p = new P154540();
        int[] result = p.solution(new String[] { "X591X", "X1X5X", "X231X", "1XXX1" });
        for (int r : result) {
            System.out.println(r);
        }
    }

    /*
     * 좌표로 2차원 배열 생성해서 map배열 값 저장
     * 0,0 부터 X가 아니면 상,하,좌,우 값 확인해서 이동(재귀), 기존값은 X로 바꾸고 합계저장
     */

    public int[] solution(String[] maps) {
        int[] answer = {};
        String[][] mapsMatrix = new String[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                mapsMatrix[i][j] = String.valueOf(maps[i].charAt(j));
            }
        }

        for (String[] arr : mapsMatrix) {
            System.out.println(Arrays.toString(arr));
        }
        return answer;
    }

    // 현재위치좌표값, 현재무인도식량합계
    // 현재위치좌표값이 X가 아니면 시량합계+
}
