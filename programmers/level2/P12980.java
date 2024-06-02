package level2;

public class P12980 {
    public static void main(String[] args) {
        P12980 p = new P12980();
        int result = p.solution(5000);
        System.out.println(result);
    }
    public int solution(int n) {
        int ans = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n -= 1;
                ans++;
            }
        }

        return ans;
    }
}
