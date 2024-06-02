package level2;

import java.util.HashMap;
import java.util.Map;
/**
 * 피보나치 수
 * 
 * 일반 재귀호출로 실행하면 시간초과 발생
 * 맵에 연산한값을 담아두고, 같은 값 필요할땐 연산안하고 찾아쓰는 형태로(메모이제이션) 변경
 * 7번 이후부터 실패나는건 피보나치수를 구하고 나서 1234567로 나누지말고, 
 * 재귀 호출안에서 리턴할때 나눠주는 형태로 수정
 */

public class P12945 {
        
    public static void main(String[] args) {
        P12945 p = new P12945();
        int r = p.solution(3);
        System.out.println(r);
    }

    Map<Long, Long> map = new HashMap<>();
    public int solution(int n) {
        long answer = 0;
        map.put(0L, 0L);
        map.put(1L, 1L);
        //System.out.println(fibonacci(3));
        answer = fibonacci(n);
        return (int)answer;
    }
    // 이 재귀호출은 시간초과
    // int fibonacci(int n) {
    //     if (n < 1) {
    //         return 0;
    //     } else if (n == 1) {
    //         return 1;
    //     }
    //     return fibonacci(n-1) + fibonacci(n-2);
    // }
    
    long fibonacci(long n) {
        
        if (map.get(n) == null) {
            map.put(n, fibonacci(n-1) + fibonacci(n-2));
        }

        return map.get(n)% 1234567L;
    }
}
