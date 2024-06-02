package level1;

/**
 */
public class P136798 {

    public static void main(String[] args) {
        int result = solution(10,3,2);
        System.out.println(result);
        
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i=1; i<=number; i++) {
            int cnt = 1;
            for (int j=1; j<=i/2; j++) {
                if (i % j == 0) {
                    cnt++;
                    if (cnt > limit) {
                        cnt = power;
                        break;
                    }
                    
                }
            }
            // System.out.println(i+":"+cnt);
            answer += cnt;
        }
        return answer;
    }
}