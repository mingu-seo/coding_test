package level2;

/*
 * 합계값이 n보다 커지면 반복문을 중지해야 시간초과 안됨
 */

public class P12924 {
    public static void main(String[] args) {
        P12924 p = new P12924();
        int r = p.solution(15);
        System.out.println(r);
    }

    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            int sum = 0;
            for (int j=i; j<=n; j++) {
                sum += j;
                if (sum > n) break;
                else if (sum == n) {
                    answer += 1;
                    break;
                }
            }
        }
        return answer;
    }
}
