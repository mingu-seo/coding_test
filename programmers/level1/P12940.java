package level1;

/**
 */
public class P12940 {

    public static void main(String[] args) {
        int[] arr = solution(3, 12);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = n > m ? m : n;
        int max = n > m ? n : m;

        // 최대공약수 구하기
        for (int i=1; i<=min; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }
        // 최소공배수 구하기
        for (int i=min; i<=min*max; i++) {
            if (i % n == 0 & i % m == 0) {
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}