package pccp1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * PCCP 모의고사1]2번 - 체육대회
 * https://school.programmers.co.kr/learn/courses/15008/lessons/121684
 */
public class P121684 {

    public static void main(String[] args) {
        P121684 p = new P121684();
        int result = p.solution(
                new int[][] { { 40, 10, 10 }, { 20, 5, 0 }, { 30, 30, 30 }, { 70, 0, 70 }, { 100, 100, 100 } });
        System.out.println(result);
    }

    // 학생의 상태와 계산된 최대 점수를 저장하기 위한 맵변수
    // 키는 학생의 번호와 배열 상태를 결합한 문자열, 값은 최대 점수입니다.
    Map<String, Integer> student = new HashMap<>();

    // 학생의 번호와 해당 학생의 능력 배열을 기반으로 최대 점수를 계산
    int max(int number, boolean[] arr, int[][] ability) {
        // 모든 학생을 처리한 경우 더 이상 점수를 계산할 필요가 없으므로 0리턴
        if (number == ability.length) {
            return 0;
        }
        String studentKey = number + Arrays.toString(arr); // 현재 학생번호와 배열값으로 키생성
        // 이미 계산된 키가 있다면, 저장된 최대 점수 리턴
        if (student.containsKey(studentKey)) {
            return student.get(studentKey);
        }

        int maxValue = max(number + 1, arr, ability);

        // 현재 학생의 모든 능력치를 반복하면서 가능한 선택지를 탐색
        for (int i = 0; i < ability[number].length; i++) {
            // false는 아직 선택하지 않은 능력치라면
            if (arr[i] == false) {
                arr[i] = true; // 해당 능력치를 선택하고 배열 상태 업데이트
                // 선택한 능력치를 더한 후 다음 학생으로 넘어가 계산한 점수 계산
                int score = max(number + 1, arr, ability) + ability[number][i];
                // 현재까지 계산된 최대 점수보다 더 큰 점수가 있다면 최대 점수를 갱신
                if (score > maxValue) {
                    maxValue = score;
                }
                arr[i] = false; // 배열 상태를 원래대로 되돌립니다. (백트래킹)
            }
        }
        // 최대 점수를 현재 키에 저장
        student.put(studentKey, maxValue);
        return maxValue;
    }

    public int solution(int[][] ability) {
        int answer = max(0, new boolean[ability.length], ability);
        return answer;
    }
}
