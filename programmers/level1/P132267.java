package level1;

/**
 */
public class P132267 {

    public static void main(String[] args) {
        int result = solution(2, 1, 20);
        System.out.println(result);
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int temp = n / a * b;
            answer += temp;
            n = n % a + temp;
        }
        return answer;
    }
}