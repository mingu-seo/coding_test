package level2;

import java.util.ArrayList;
import java.util.List;

public class P12936 {
    public static void main(String[] args) {
        P12936 p = new P12936();
        int[] result = p.solution(3, 5);
        for (int r : result) {
            System.out.println(r);
        }
    }

    /*
     * 정답은 맞으나, 효울성 문제(시간 초과)
     * 수열은 구할때 다 구하지말고, k순서에 해당하는것만 구할까
     * 수열 구할때 k값 체크해서 중지 시키고, 마지막값으로 처리했는데도 효율선 체크에서 전부 시간초과, 
     * current를 스택으로 해 볼까?
     */

    public int[] solution(int n, long k) {
        int[] answer = {};
        
        // 
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        List<List<Integer>> result = new ArrayList<>();
        perm(result, new ArrayList<>(), arr, n, k);
        System.out.println(result);
        // answer = result.get((int)k-1).stream().mapToInt(i->i).toArray();
        answer = result.get(result.size()-1).stream().mapToInt(i->i).toArray();

        return answer;
    }

    void perm(List<List<Integer>> result, List<Integer> current, int[] arr, int n, long k) {
        if (n == 0) {
            result.add(new ArrayList<>(current)); // 리스트안에 리스트
            return;
        }
        if (result.size() == k) return;

        for (int i=0; i<arr.length; i++) {
            if (current.contains(arr[i])) { // 중복체크 (이 부분 제거하면 중복가능한 순열)
                continue;
            }
            current.add(arr[i]);
            perm(result, current, arr, n-1, k);
            current.remove(current.size()-1);
        }
    }
}
