package level4;

/*
 * 최대값 구하는 재귀식과, 최소값 구하는 재귀식 따로 구해서
 * 모든 연산자 순서대로 반복하며 최대값/최소값 구하기
 * 
 * AI 코드 피드백
 * 사용자님의 코드에서 주의해야 할 부분이 있습니다. 동적 계획법(Dynamic Programming)을 사용할 때, `val` 배열을 인덱스로 상태를 저장하고 있으나, 최대 값과 최소 값을 동시에 고려해야 하는데, 이 부분이 코드에 명확하게 반영되지 않았습니다. 특히, `val` 배열에 최소값만 저장하거나 최대값만 저장하는 방식으로는 괄호를 다르게 쓴 경우의 최소값과 최대값을 모두 탐색할 수 없습니다.
따라서, `val` 배열을 활용하여 각 구간의 최소값과 최대값을 동시에 저장할 수 있는 구조를 고려해 보세요. 예를 들어, 2차원 배열 대신에 클래스를 사용하여 각 구간별 최소값과 최대값을 객체로 관리하거나, 3차원 배열을 사용하는 방법 등이 있을 수 있습니다. 이렇게 하면 각 구간별로 '+' 또는 '-' 연산을 적용했을 때의 최대값과 최소값을 효과적으로 계산하고 저장할 수 있으며, 재귀 호출을 통해 문제를 해결할 수 있습니다.

    메모이제이션 변수를 min, max 따로 써야하는데 하나로 쓰면 정확성8번, 효율성2번이 틀림
 */
public class P1843 {
    public static void main(String[] args) {
        P1843 p = new P1843();
        // int result = p.solution(new String[] { "1", "-", "3", "+", "5", "-", "8" });
        int result = p.solution(new String[] { "5", "-", "3", "+", "1", "+", "2", "-", "4" });
        System.out.println(result);
    }

    // 메모이제이션값 저장
    int[][] maxVal = new int[202][202];
    int[][] minVal = new int[202][202];

    public int solution(String arr[]) {
        int answer = -1;
        // 모든배열값 최소값으로 저장
        for (int i = 0; i < maxVal.length; i++) {
            for (int j = 0; j < maxVal[i].length; j++) {
                maxVal[i][j] = Integer.MIN_VALUE;
            }
        }
        for (int i = 0; i < minVal.length; i++) {
            for (int j = 0; j < minVal[i].length; j++) {
                minVal[i][j] = Integer.MIN_VALUE;
            }
        }
        // 재귀호출
        answer = max(0, arr.length, arr);
        return answer;
    }

    // 최대값 구하기
    int max(int s, int e, String[] arr) {
        // 메모이제이션값이 최소값이 아니면(이미 앞에서 구해진 값이면)
        if (maxVal[s][e] != Integer.MIN_VALUE) {
            return maxVal[s][e];
        }
        if (e - s == 1) {
            return Integer.parseInt(arr[s]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = s + 1; i < e; i += 2) {
            int temp = max(s, i, arr);
            int v;
            if (arr[i].equals("+")) {
                int r = max(i + 1, e, arr);
                v = temp + r;
            } else {
                int r = min(i + 1, e, arr);
                v = temp - r;
            }
            if (v > max) {
                max = v;
            }
        }
        maxVal[s][e] = max;
        return max;
    }

    // 최소값 구하기
    int min(int s, int e, String[] arr) {
        // 메모이제이션값이 최소값이 아니면(이미 앞에서 구해진 값이면)
        if (minVal[s][e] != Integer.MIN_VALUE) {
            return minVal[s][e];
        }
        if (e - s == 1) {
            return Integer.parseInt(arr[s]);
        }
        int min = Integer.MAX_VALUE;
        for (int i = s + 1; i < e; i += 2) {
            int temp = min(s, i, arr);
            int v;
            if (arr[i].equals("+")) {
                int r = min(i + 1, e, arr);
                v = temp + r;
            } else {
                int r = max(i + 1, e, arr);
                v = temp - r;
            }
            if (v < min) {
                min = v;
            }
        }
        minVal[s][e] = min;
        return min;
    }
}
