package level2;

public class P77885 {
    public static void main(String[] args) {
        P77885 p = new P77885();
        long[] result = p.solution(new long[] { 2, 7 });
        // long[] result = p.solution(new long[] { 100000000000000L });
        for (long r : result) {
            System.out.println(r);
        }
    }

    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            long n = numbers[i];
            long j = 1;
            if ((n & j) == 0) {
                answer[i] = n + 1;
            } else {

                n = n + 1;

                while ((n & j) == 0) {
                    j = j * 2;
                }
                // System.out.println(j);
                // 위 연산하기 전단계-1
                answer[i] = j / 2 - 1 + n;
                // 아래방법으로는 10,11번에서 시간초과
                /*
                 * String n_org = Long.toBinaryString(n);
                 * int diffCount = 0;
                 * long min = Long.MAX_VALUE;
                 * 
                 * while (true) {
                 * String n_new = Long.toBinaryString(++n);
                 * // n_org = String.format("%0" + n_new.length() + "d", Long.parseLong(n_org));
                 * StringBuilder zero = new StringBuilder();
                 * for (int j = 0; j < n_new.length() - n_org.length(); j++) {
                 * zero.append("0");
                 * }
                 * n_org = zero.toString() + n_org;
                 * // System.out.print("n_org:" + n_org + " n_new:" + n_new);
                 * diffCount = 0;
                 * for (int j = n_org.length() - 1; j >= 0; j--) {
                 * if (n_org.charAt(j) != n_new.charAt(j)) {
                 * diffCount++;
                 * }
                 * 
                 * if (diffCount > 2) {
                 * break;
                 * }
                 * 
                 * }
                 * // System.out.println(" diffCount:" + diffCount);
                 * if (diffCount <= 2) {
                 * if (min > Long.parseLong(n_new, 2)) {
                 * min = Long.parseLong(n_new, 2);
                 * }
                 * answer[i] = min;
                 * break;
                 * }
                 * }
                 */
            }

        }

        return answer;
    }
}
