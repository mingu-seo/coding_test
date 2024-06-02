package level1;

import java.util.Arrays;

/**
 * P42862
 */
public class P42862 {

    public static void main(String[] args) {
        P42862 p = new P42862();
        int r = p.solution(5, new int[]{5,3}, new int[]{4,2});
        System.out.println(r);
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] result = new int[n];
        // 전체 학생
        for (int i=0; i<result.length; i++) {
            result[i] = 1;
        }
        // 여벌있는 학생은 2로 변경
        for (int i=0; i<reserve.length; i++) {
            result[reserve[i]-1] = 2;
        }
        // 도난당한 학생은 0로 변경
        for (int i=0; i<lost.length; i++) {
            result[lost[i]-1] = result[lost[i]-1]-1;
        }
        
        // reserv는 정렬해야함 (비교할때 앞에서부터 확인해야하므로)
        Arrays.sort(reserve);
        for (int i=0; i<reserve.length; i++) {
            if (result[reserve[i]-1] > 1) { // 여벌이 있는 경우에만 가능
                // 앞에 학생이 도난당한 학생이고 본인이 여벌 체육복이 있으면
                if (reserve[i]-2 >= 0 && result[reserve[i]-2] == 0) {
                    result[reserve[i]-1] = result[reserve[i]-1] - 1;
                    result[reserve[i]-2] = 1;
                // 그렇지 않고 뒤에 학생이 도난당한 학생이면
                } else if (reserve[i] < result.length && result[reserve[i]] == 0){
                    result[reserve[i]-1] = result[reserve[i]-1] - 1;
                    result[reserve[i]] = 1;
                }
            }
        }
        // System.out.println(Arrays.toString(result));
        for (int i=0; i < result.length; i++) {
            if (result[i] > 0) answer++;
        }
        return answer;
    }
}