package etc.backtraking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P9663 {

    static int result = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        dfs(N, 0, new ArrayList<>());
        System.out.println(result);
    }

    // 퀸을 놓을 수 있는 자리인지 체크(Promising)
    static boolean isAvailable(List<Integer> candidate, Integer currentCol) {
        Integer currentRow = candidate.size();
        for (int index = 0; index < currentRow; index++) {
            // 수직체크 || 대각선체크
            if ((candidate.get(index) == currentCol)
                    || (Math.abs(candidate.get(index) - currentCol) == currentRow - index)) {
                return false;
            }
        }
        return true;
    }

    static void dfs(Integer N, Integer currentRow, List<Integer> currentCandidate) {
        if (currentRow == N) {
            // System.out.println(currentCandidate);
            result++;
            return;
        }
        // 해당 로우 전체 값 체크
        for (int index = 0; index < N; index++) {
            if (isAvailable(currentCandidate, index) == true) {
                currentCandidate.add(index);
                dfs(N, currentRow + 1, currentCandidate);
                currentCandidate.remove(currentCandidate.size() - 1); // 가지치기(Pruning) (이전값 제거)
            }
        }
    }
}
