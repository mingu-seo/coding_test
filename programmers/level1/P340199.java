package level1;

/**
 * P340199
 */
public class P340199 {

    public static void main(String[] args) {
        P340199 p = new P340199();
        // int result = p.solution(new int[] { 30, 15 }, new int[] { 26, 17 });
        int result = p.solution(new int[] { 50, 50 }, new int[] { 100, 241 });
        System.out.println(result);
    }

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while (Math.min(bill[0], bill[1]) > Math.min(wallet[0], wallet[1])
                || Math.max(bill[0], bill[1]) > Math.max(wallet[0], wallet[1])) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++;
        }
        return answer;
    }
}