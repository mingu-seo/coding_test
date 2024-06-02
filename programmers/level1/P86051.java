package level1;

/**
 * 없는 숫자 더하기
 */
public class P86051 {

    public static void main(String[] args) {
        int result = solution(new int[]{1,2,3,4,6,7,8,0});
        System.out.println(result);
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        for (int a : arr) {
            boolean isCal = true;
            for (int n : numbers) {
                if (n == a) {
                    isCal = false;
                    break;
                }
            }
            if (isCal) answer += a;
        }
        return answer;
    }
}