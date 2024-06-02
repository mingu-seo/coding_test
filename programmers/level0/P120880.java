package level0;

import java.util.Comparator;

/**
 * Lession10
 */
public class P120880 {

    public static void main(String[] args) {
        
        int[] arr = solution(new int[]{1,2,3,4,5,6}, 4);
        for (int r : arr) {
            System.out.println(r);
        }
    }

    public static int[] solution(int[] numlist, int n) {
        int[] answer = {};
        Integer[] arr = new Integer[numlist.length];
        for (int i=0; i<numlist.length; i++) {
            arr[i] = numlist[i];
        }
        java.util.Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 차이 구하기
                int o1_ = Math.abs(n - o1);
                int o2_ = Math.abs(n - o2);
                if (o1_ < o2_) {
                    return -1;
                } else if (o1_ == o2_) { // 차이가 같으면 원래값으로 비교
                    return o2 - o1;
                } else {
                    return 1;
                }
            }
        });
        answer = java.util.Arrays.stream(arr).mapToInt(i->i).toArray();
        return answer;
    }
}