package level2;

import java.util.ArrayList;
import java.util.List;

/**
 * 짝지어 제어하기
 * 
 * 리스트로하니까 시간초과
 * 
 */

public class P12973 {
    public static void main(String[] args) {
        P12973 p = new P12973();
        int r = p.solution("cdcd");
        System.out.println(r);
    }
    public int solution(String s) {
        int answer = 0;

        List<String> list = new ArrayList<>();
        String[] arr = s.split("");

        for (int i=0; i<arr.length; i++) {
            if (list.size() > 0 && list.get(list.size()-1).equals(arr[i])) {
                list.remove(list.size()-1);
            } else {
                list.add(arr[i]);
            }
        }
        
        // System.out.println(list);
        if (list.size() == 0) answer = 1;
        
        return answer;
    }
}
