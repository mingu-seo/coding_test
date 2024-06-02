package level1;

/**
 */
public class P12921 {

    public static void main(String[] args) {
        int result = solution(10);
        System.out.println(result);
        
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i=2; i<=n; i++) {
            boolean isPrime = true;
            // 제곱근까지만 반복해보면 됨
            for (int j=2; j<=(int)Math.sqrt(i); j++) {
                if (i % j == 0) { // 나머지가 없으면 소수가 아님
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                // System.out.println("i:"+i);
                answer++;
            }
        }
        return answer;
    }
}