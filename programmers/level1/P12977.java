package level1;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class P12977 {

    public static void main(String[] args) {
        int result = solution(new int[]{1,2,7,6,4});
        System.out.println(result);
        
    }

    public static int solution(int[] nums) {
        int answer = 0;

        List<Integer[]> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        combination(result, nums, visited, 0, nums.length, 3);

        for (Integer[] r : result) {
            // System.out.println(Arrays.toString(r));
            int rowCount = 0;
            for (Integer row : r) {
                rowCount += row;
            }
            // rowCount가 소수인지 체크
            boolean isPrime = true;
            for (int i=2; i<rowCount/2; i++) {
                // System.out.println(rowCount+","+i);
                if (rowCount % i == 0) { // 나머지가 없으면 소수가 아님
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) answer++;
        }

        return answer;
    }

    /*
    result : 결과를 담을 객체
    arr : 조합을 뽑아낼 배열
    visited : 조합에 뽑혔는지 여부가 저장된 배열
    n : 배열의 길이
    r : 조합의 길이
    */
    public static void combination(List<Integer[]> result, int[] arr, boolean[] visited, int start, int n, int r) {
        
        if(r == 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    list.add(arr[i]);
                }
            }
            result.add(list.toArray(new Integer[list.size()]));
            //System.out.println(Arrays.toString(list.toArray(new Integer[list.size()])));
            return;
        } 
    
        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(result, arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}