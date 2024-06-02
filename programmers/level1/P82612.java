package level1;

/**
 */
public class P82612 {

    public static void main(String[] args) {
        long result = solution(3,20,4);
        System.out.println(result);
    }

    public static long solution(int price, int money, int count) {
        long answer = 0;

        long totalPrice = 0;
        for (int i=1; i<=count; i++) {
            totalPrice += i * price;
        }
        answer = totalPrice > money ? totalPrice - money : 0;

        return answer;
    }
}