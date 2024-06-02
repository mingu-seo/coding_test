package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 구명보트
 * 
 * 배열을 정렬해서 맨앞(몸무게가 가장 적은)사람과 맨뒤(몸무게가 가장많이 나가는) 사람을 더해서
 * limit보다 작으면 구명보트+1, 배열에서 제거
 * 그렇지 않으면 맨뒤(몸무게 가장 많이 나가는)사람만 제외하고 구명보트+1
 */

public class P42885 {
    public static void main(String[] args) {
        P42885 p = new P42885();
        int result = p.solution(new int[]{70,80,50}, 100);
        System.out.println(result);
    }
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        List<Integer> list = new ArrayList<>();
        for (int p : people) {
            list.add(p);
        }

        while (list.size() >= 1) {
            if (list.size() > 1 && (list.get(0) + list.get(list.size()-1)) <= limit) {
                answer++;
                list.remove(list.size()-1);
                list.remove(0);
            } else if (list.get(list.size()-1) <= limit) {
                answer++;
                list.remove(list.size()-1);
            }
        }
        
        return answer;
    }
}
