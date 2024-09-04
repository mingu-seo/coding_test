package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P154540 {
    public static void main(String[] args) {
        P154540 p = new P154540();
        int[] result = p.solution(new String[] { "X591X", "X1X5X", "X231X", "1XXX1" });
        // int[] result = p.solution(new String[] { "XXX","XXX","XXX" });
        for (int r : result) {
            System.out.println(r);
        }
    }

    /*
     * 좌표로 2차원 배열 생성해서 map배열 값 저장
     * 0,0 부터 X가 아니면 상,하,좌,우 값 확인해서 이동(재귀), 기존값은 X로 바꾸고 합계저장
     */
    String[][] mapsMatrix;
    public int[] solution(String[] maps) {
        int[] answer = {};
        mapsMatrix = new String[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                mapsMatrix[i][j] = String.valueOf(maps[i].charAt(j));
            }
        }

        // for (String[] arr : mapsMatrix) {
        //     System.out.println(Arrays.toString(arr));
        // }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < mapsMatrix.length; i++) {
            for (int j=0; j<mapsMatrix[i].length; j++) {
                // System.out.println("i:"+i+" j:"+j);
                search(i, j);

                // System.out.println(list);
                int total = 0;
                for (Integer n : list) {
                    total += n;
                }
                if (total > 0) result.add(total);
                list = new ArrayList<>();
            }
            
        }
        // System.out.println(list);
        // System.out.println(result);
        if (result.size() == 0) {
            answer = new int[]{-1};
        } else {
            Collections.sort(result);
            answer = result.stream().mapToInt(i->i).toArray();
        }
        return answer;
    }

    // 현재위치좌표값, 현재무인도식량합계
    // 현재위치좌표값이 X가 아니면 시량합계+
    List<Integer> list = new ArrayList<>();
    void search(int x, int y) {
        
        if ("X".equals(mapsMatrix[x][y])) {
            return;
        }
        // System.out.println("x:"+x+" y:"+y);
        list.add(Integer.parseInt(mapsMatrix[x][y]));
        mapsMatrix[x][y] = "X";
        if (x > 0) search(x-1, y);
        if (y > 0) search(x, y-1);
        if (x < mapsMatrix.length-1) search(x+1, y);
        if (y < mapsMatrix[0].length-1) search(x, y+1);
    }
}
