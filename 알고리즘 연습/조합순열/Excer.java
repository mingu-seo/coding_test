import java.util.ArrayList;
import java.util.List;

public class Excer {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<List<Integer>> result = new ArrayList<>();
        perm(result, new ArrayList<>(), arr, 2);
        System.out.println(result);
    }

    // 조합
    static void comb(List<List<Integer>> result, List<Integer> current, int[] arr, int start, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i=start; i<=arr.length-k; i++) {
            current.add(arr[i]);
            comb(result, current, arr, i+1, k-1);
            current.remove(current.size()-1);
        }
    }

    // 순열
    static void perm(List<List<Integer>> result, List<Integer> current, int[] arr, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i=0; i<=arr.length-k; i++) {
            if (current.contains(arr[i])) continue;
            current.add(arr[i]);
            perm(result, current, arr, k-1);
            current.remove(current.size()-1);
        }
    }
}
