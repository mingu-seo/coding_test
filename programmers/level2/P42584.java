package level2;

public class P42584 {
    public static void main(String[] args) {
        P42584 p = new P42584();
        int[] result = p.solution(new int[]{1,2,3,2,3});
        for (int r : result) {
            System.out.println(r);
        }
    }
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i=0; i<prices.length; i++) {
            int second = 0;
            for (int j=i+1; j<prices.length; j++) {
                System.out.println(prices[i]+":"+prices[j]);
                // if (prices[i] <= prices[j]) {
                //     second++;
                // } else {
                //     if (second == 0) second++;
                //     break;
                // }
                second++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = second;
        }

        return answer;
    }
}
