package level3;

public class P42898 {
    public static void main(String[] args) {
        P42898 p = new P42898();
        int result = p.solution(4, 3, new int[][] { { 2, 2 } });
        System.out.println(result);
    }

    // 메모이제이션값 저장
    int[][] val = new int[101][101];

    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        // 모든배열값 -1로 저장
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[i].length; j++) {
                val[i][j] = -1;
            }
        }
        // 웅덩이여부
        boolean[][] isPuddle = new boolean[n + 1][m + 1];
        for (int[] puddle : puddles) {
            isPuddle[puddle[1]][puddle[0]] = true;
        }

        // 재귀호출
        // 시작좌표는 1부터 시작
        answer = count(1, 1, m, n, isPuddle);
        return answer;
    }

    int count(int x, int y, int w, int h, boolean[][] isPuddle) {
        if (x > w || y > h) {
            return 0;
        }
        if (isPuddle[y][x]) { // 웅덩이일때
            return 0;
        }
        if (val[x][y] != -1) {
            return val[x][y];
        }
        if (x == w && y == h) { // 도착했을 때
            return 1;
        }
        int total = count(x + 1, y, w, h, isPuddle) + count(x, y + 1, w, h, isPuddle);
        return val[x][y] = total % 1000000007;
    }
}
