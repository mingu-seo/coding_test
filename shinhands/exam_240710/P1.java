package shinhands.exam_240710;

public class P1 {
    public static void main(String[] args) {
        long[] test = { 2, 3, 10, 100, 1000, 10000, 100000 };
        P1 p = new P1();
        for (long t : test) {
            long s = System.currentTimeMillis();
            long result = p.solution(t);
            System.out.print("결과값:" + result);
            long e = System.currentTimeMillis();
            long r = (e - s) / 1000;
            System.out.print(" time:" + r + (r <= 10 ? ":성공" : ":실패"));
            System.out.println();
        }
    }

    public long solution(long n) {
        long answer = 0;
        long num = n + 1;
        while (true) {
            if (num % n == 0)
                break;
            answer += num;
            num += n + 1;
        }
        return answer;
    }

    // 이코드는 n이 100000일때 시간초과
    public long solution2(long n) {
        long answer = 0;
        for (long i = n + 1; i < n * n; i++) {
            if (i % n == i / n) {
                answer += i;
            }
        }
        return answer;
    }
}
