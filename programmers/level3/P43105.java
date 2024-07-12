package level3;

/**
 * P43105
 * 정수삼각형
 * 
 */
public class P43105 {

    public static void main(String[] args) {
        P43105 p = new P43105();
        int result = p.solution(new int[][] { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } });
        System.out.println(result);
    }

    // 메모이제이션값 저장
    int[][] val = new int[501][501];

    public int solution(int[][] triangle) {
        // 모든배열값 -1로 저장
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[i].length; j++) {
                val[i][j] = -1;
            }
        }
        int answer = max(0, 0, triangle);
        return answer;
    }

    // 재귀
    int max(int x, int y, int[][] t) {
        if (y == t.length) {
            return 0;
        }
        if (val[x][y] != -1) {
            return val[x][y];
        }
        // 숫자의 합이 가장 큰 경우
        return val[x][y] = t[y][x] + Math.max(max(x, y + 1, t), max(x + 1, y + 1, t));
    }
}