package level3;

public class P12486 {
    /*
     * 그냥 계산하면 시간초과
     * 모든 심사관이 특정시간동안 처리할 수 있는 심사개수를 더해서 심사 대기중인 사람과 비교
     * 한명의 심사관 심사시간 = 전체시간 / 각 심사관 소요시간
     * 위 심사시간 합계(전체 심사관)이 전체시간보다 크거나 같으면 가능
     * 이 비교를 이분탐색으로 처리하면 시간내 가능
     */
    public static void main(String[] args) {
        P12486 p = new P12486();
        long result = p.solution(6, new int[] { 7, 10 });
        System.out.println(result);
    }

    public long solution(int n, int[] times) {
        long answer = 0;

        long start = 1;
        long end = 1000000000000000L; // 입국심사를 기다리는 최대인원(1,000,000,000명) * 심사관1명당 (100,000명)

        // 이분탐색
        while (end > start) {
            long mid = (start + end) / 2;

            long total = 0;
            // 소요시간 계산
            for (int t : times) {
                total += mid / t;
            }
            if (total >= n) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        answer = start;

        return answer;
    }

}
