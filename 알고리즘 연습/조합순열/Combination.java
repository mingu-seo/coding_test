import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<List<Integer>> result = new ArrayList<>();
        comb(result, new ArrayList<>(), arr, 0, 2);
        System.out.println(result);
    }

    // 배열 arr에서 k개의 값을 가지는 조합 추출
    static void comb(List<List<Integer>> result, List<Integer> current, int[] arr, int start, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(current)); // 리스트안에 리스트
            return;
        }

        for (int i=start; i<=arr.length-k; i++) {
            current.add(arr[i]);
            comb(result, current, arr, i+1, k-1); // start를 0으로하면 중복가능 조합
            current.remove(current.size()-1);
        }
    }
}
