package level2;

import java.util.Arrays;

public class P12953 {
    public static void main(String[] args) {
        P12953 p = new P12953();
        int result = p.solution(new int[]{2,6,8,14});
        System.out.println(result);
    }
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        answer = arr[arr.length-1];
        
        while (true) {
            boolean ok = true;
            for (int i=0; i<arr.length-1; i++) {
                if (answer % arr[i] != 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                break;
            } else {
                answer = answer + arr[arr.length-1];
            }
        }
        return answer;
    }
}
