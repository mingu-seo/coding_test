package level0;

/**
 * Lession10
 */
public class P12 {

    public static void main(String[] args) {
        int[][] dots = {{-1,1},{1,3},{3,9}};
        int r = solution(dots);
        System.out.println(r);
    }

    public static int solution(int[][] lines) {
        

        int answer = 0;
        // 파라미터 배열이 가로*세로 길이 범위는 -100~100이므로 201개
        int len = 201;
        int[] arr = new int[len];

        for (int i=0; i<lines.length; i++) {
            // -100이라면 0이 나와야하므로 +100
            for (int j=lines[i][0]+100; j<lines[i][1]+100; j++) {
                arr[j] = arr[j] + 1;
            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
            // 2개 이상 중복
            if (arr[i] >= 2) answer++;
        }
        return answer;
    }
}