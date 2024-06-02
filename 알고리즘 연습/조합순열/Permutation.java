import java.util.ArrayList;
import java.util.List;

public class Permutation {
        public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<List<Integer>> result = new ArrayList<>();
        perm(result, new ArrayList<>(), arr, 2);
        System.out.println(result);
    }

    // 배열 arr에서 k개의 값을 가지는 조합 추출
    static void perm(List<List<Integer>> result, List<Integer> current, int[] arr, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(current)); // 리스트안에 리스트
            return;
        }

        for (int i=0; i<arr.length; i++) {
            if (current.contains(arr[i])) { // 중복체크 (이 부분 제거하면 중복가능한 순열)
                continue;
            }
            current.add(arr[i]);
            perm(result, current, arr, k-1);
            current.remove(current.size()-1);
        }
    }

}