package level2;

public class P12985 {
    public static void main(String[] args) {
        P12985 p = new P12985();
        int result = p.solution(8,4,7);
        System.out.println(result);
    }

    public int solution(int n, int a, int b) {
        int answer = 0;

        // 작은수를 앞에 두기 위해
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        int size = n;
        while (size >= 2) { // 길이가 2이상이면
            int mid = size / 2; // 길이 반씩 나눔
            // 반나눈 길이가 a와 b사이에 있으면 (현재 길이에서 가장 나중에 붙게 되므로 제곱근찾기)
            // 2,3,4,11,15번이 틀리는데, 가운데번호 비교 기준이 소수점버린 정수이므로 b > mid
            if (a <= mid && b > mid) { 
                for (int i=1; i<=20; i++) {
                    if (size == Math.pow(2, i)) {
                        answer = i;
                        return answer;
                    }
                }
            } else {
                size = size / 2;
                if (a > size) {
                    a = a - size;
                    b = b - size;
                }
            }
        }
        

        return answer;
    }
}
