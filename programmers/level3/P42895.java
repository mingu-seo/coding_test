package level3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P42895 {
    public static void main(String[] args) {
        P42895 p = new P42895();
        // int result = p.solution(5, 12);
        int result = p.solution(2, 11);
        System.out.println(result);
    }

    public int solution(int N, int number) {
        int answer = -1; // 최소사용횟수가 8이 넘어가면 기본값 -1
        Map<Integer, Set<Integer>> map = new HashMap<>(); // 사용 횟수와 해당 결과 값들을 저장하는 맵
        Set<Integer> set = new HashSet<>(); // 첫 번째 사용 횟수에 해당하는 결과 값들을 저장하는 집합
        set.add(N); // 첫 번째 사용 횟수에는 N만 가능
        map.put(1, set);

        if (number == N)
            return 1; // 같으면 1번 사용하고 끝
        for (int i = 2; i <= 8; i++) { // 최소사용횟수의 최대값이 8이므로
            Set<Integer> temp = new HashSet<>(); // 횟수만큼의 수를 set에 저장, N=5, i=2 -> 55
            String s = "";
            // N을 i번 반복하여 만든 숫자를 집합에 추가
            for (int j = 0; j < i; j++) {
                s += N;
            }
            temp.add(Integer.parseInt(s));

            // i를 j와 (i-j)로 나누어 가능한 모든 연산 결과를 집합에 추가
            for (int j = 1; j < i; j++) {
                for (Integer x : map.get(j)) {
                    for (Integer y : map.get(i - j)) {
                        temp.add(x + y);
                        temp.add(x - y);
                        temp.add(x * y);
                        if (y > 0) // (y가 0보다 큰 경우)
                            temp.add(x / y);
                    }
                }

            }

            // System.out.println(temp);
            // 현재 사용 횟수의 결과 집합에 목표 숫자가 포함되면 반복 중지
            if (temp.contains(number)) {
                answer = i;
                break;
            }
            map.put(i, temp); // 현재 사용 횟수의 결과 집합을 맵에 추가
            // System.out.println(map);
        }
        return answer;
    }

}
