package level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P131701 {
    public static void main(String[] args) {
        P131701 p = new P131701();
        int result = p.solution(new int[]{7,9,1,1,4});
        System.out.println(result);
    }
    public int solution(int[] elements) {
        int answer = 0;

        // 중복제거를 위한 변수
        Set<Integer> set = new HashSet();
        
        int size = 0; // 길이
        while (size < elements.length) {
            for (int i=0; i<elements.length; i++) {
                // List<Integer> result = new ArrayList<>();
                int sum = 0;
                // 길이만큼 반복
                for (int start=i; start<=i+size; start++) {
                    int end = start;
                    if (end >= elements.length) { // 길이가 배열길이보다 길어지면
                        end = end % elements.length; // 배열길이로 나눈 나머지로 지정(연속수열이므로)
                    }
                    sum += elements[end];
                    // result.add(elements[end]);
                }
                
                set.add(sum);
                // System.out.println(result);
            }
            size++;
        }
        answer = set.size();
        return answer;
    }


}
