package level2;

public class P12911 {
    public static void main(String[] args) {
        P12911 p = new P12911();
        int result = p.solution(15);
        System.out.println(result);
    }
    public int solution(int n) {
        int answer = 0;
        int n_count = oneCount(n);
        
        while (true) {
            n++;
            int count = oneCount(n); // 1증가된 n의 1의 개수
            if (n_count == count) {
                answer = n;
                break;
            }
        }
        return answer;
    }

    // 이진수 변환해서 1의 개수 리턴 (굳이 변환안해도됨)
    static int oneCount(int n) {
        // 이진수변환
        // StringBuffer value = new StringBuffer();
        int count = 0;
        while (true) {
            int r = n % 2;
            if (r == 1) count++;
            // value.insert(0, r);
            n = n / 2;
            if (n < 2) {
                // value.insert(0, n);
                count++;
                break;
            }
        }
        
        // System.out.println(value);
        return count;
    }
}
