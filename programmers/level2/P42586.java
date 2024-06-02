package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P42586 {
    public static void main(String[] args) {
        P42586 p = new P42586();
        // int[] result = p.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        int[] result = p.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        // int[] result = p.solution(new int[]{93, 90}, new int[]{10,9});
        for (int r : result) {
            System.out.println(r);
        }
    }
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] remain = new int[progresses.length];
        for (int i=0; i<remain.length; i++) {
            remain[i] = (100-progresses[i]) / speeds[i];
            if ((100-progresses[i]) % speeds[i] > 0) remain[i]++;
        }
        // System.out.println(Arrays.toString(remain));
        List<Integer> result = new ArrayList<>();
        
        for (int i=0; i<remain.length; i++) {
            int cnt = 1;
            for (int j=i+1; j<remain.length; j++) {
                // System.out.println(remain[i]+":"+remain[j]);
                if (remain[i] >= remain[j]) {
                    cnt++;
                } else {
                    break;
                }
            }
            result.add(cnt);
            i = i + cnt-1;
        }
        // System.out.println(result);
        answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
