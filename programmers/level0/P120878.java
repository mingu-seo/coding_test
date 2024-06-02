package level0;

/**
 * Lession10
 */
public class P120878 {

    public static void main(String[] args) {
        
        int r = solution(7, 20);
        System.out.println(r);
    }

    public static int solution(int a, int b) {
        int answer = 2;
        int max = 1; // 최대공약수
        for (int i=2; i<=b/2; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        a = a / max;
        b = b / max;
        System.out.println(a+":"+b);
        
        for (int i=2; i<=b/2; i++) {
            if (i % 2 != 0 && i % 5 != 0) {
                if (b % i == 0) {
                    System.out.println("I:"+i);
                    return 2;
                }
            }
        }
        if (b % 2 == 0 || b % 5 == 0) answer = 1;
        return answer;
    }
}