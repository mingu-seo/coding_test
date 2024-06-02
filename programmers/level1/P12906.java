package level1;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class P12906 {

    public static void main(String[] args) {
        int[] result = solution(new int[]{1,1,3,3,0,1,1});
        for (int r : result) {
            System.out.println(r);
        }
        
    }

    public static int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i=1; i<arr.length; i++) {
            if (list.get(list.size()-1) != arr[i]) {
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt((i)->i).toArray();
        return answer;
    }
}