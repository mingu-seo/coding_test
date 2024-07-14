package shinhands.exam_240710;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P3 {
    public static void main(String[] args) {
        P3 p = new P3();
        // [디스크번호, 데이터번호, 일자]
        // int[][] result = p.solution(3, 5, new int[][] { { 1, 1, 5 }, { 2, 4, 7 }, {
        // 1, 5, 10 }, { 3, 1, 10 },
        // { 2, 1, 5 }, { 1, 3, 3, }, { 3, 2, 8 }, { 2, 2, 8 }, { 3, 4, 7 } });
        int[][] result = p.solution(3, 5, new int[][] { { 1, 2, 7 }, { 1, 1, 7 }, { 1, 3, 9 }, { 2, 1, 3 },
                { 2, 2, 9 }, { 2, 3, 1 } });
        for (int[] r : result) {
            System.out.println(Arrays.toString(r));
        }
    }

    public int[][] solution(int n, int m, int[][] records) {

        int[] diskCount = new int[n + 1]; // 디스크별 데이터개수
        int[] dataCount = new int[m + 1]; // 데이터별 데이터개수
        List<List<Integer>> init = new ArrayList<>(); // [디스크번호, 데이터번호, 일자, 순번]
        for (int i = 0; i < records.length; i++) {

            diskCount[records[i][0]]++;
            dataCount[records[i][1]]++; // 데이터개수

            List<Integer> temp = new ArrayList<>();
            temp.add(records[i][0]);
            temp.add(records[i][1]);
            temp.add(records[i][2]);
            temp.add(i);
            init.add(temp);
        }
        // 정렬
        dataSort(init, diskCount);

        // 결과값 저장할 변수
        List<List<Integer>> result = new ArrayList<>();
        // 순차처리
        for (int i = 0; i < init.size(); i++) {
            if (dataCount[init.get(i).get(1)] > 1) { // 데이터개수가 1보타 클때만
                result.add(init.get(i));
                init.remove(i); // 삭제
                calc(init, diskCount, dataCount); // 다시계산
                dataSort(init, diskCount); // 다시정렬
                i--; // 현재 위치에서 다시 확인하기 위해 --
            }
        }

        int[][] answer = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            answer[i][0] = result.get(i).get(0);
            answer[i][1] = result.get(i).get(1);
        }
        return answer;
    }

    void dataSort(List<List<Integer>> data, int[] diskCount) {
        Collections.sort(data, (d1, d2) -> {
            if (d2.get(2) < d1.get(2)) {
                return -1;
            } else if (d2.get(2) == d1.get(2)) {
                if (diskCount[d2.get(0)] < diskCount[d1.get(0)]) {
                    return -1;
                }
            }
            return 1;
        });
    }

    // 삭제후 다시 계산
    void calc(List<List<Integer>> data, int[] diskCount, int[] dataCount) {
        // 다시 계산하기 위해 0으로 초기화
        Arrays.fill(diskCount, 0);
        Arrays.fill(dataCount, 0);

        List<List<Integer>> init = new ArrayList<>(); // [디스크번호, 데이터번호, 일자, 순번]
        for (int i = 0; i < data.size(); i++) {
            diskCount[data.get(i).get(0)]++;
            dataCount[data.get(i).get(1)]++; // 데이터개수

            List<Integer> temp = new ArrayList<>();
            temp.add(data.get(i).get(0));
            temp.add(data.get(i).get(1));
            temp.add(data.get(i).get(2));
            temp.add(i);
            init.add(temp);
        }
    }
}
