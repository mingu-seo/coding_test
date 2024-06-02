package level1;

/**
 */
public class P77884 {

    public static void main(String[] args) {
        int result = solution(13, 17);
        System.out.println(result);
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for (int i=left; i<=right; i++) {
            int cnt = 0; // 약수개수
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}