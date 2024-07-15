package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P43162 {
    public static void main(String[] args) {
        P43162 p = new P43162();
        // int result = p.solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1
        // } });
        int result = p.solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } });
        System.out.println(result);
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] isVisited = new boolean[n];

        for (int i = 0; i < n; i++) {
            // System.out.println(Arrays.toString(isVisited));
            if (!isVisited[i]) {
                visit(i, computers, isVisited);
                answer++;
            }
        }
        return answer;
    }

    // 시작값, 배열, 방문여부
    void visit(int n, int[][] computers, boolean[] isVisited) {
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (!list.isEmpty()) {
            int e = list.get(list.size() - 1); // 마지막값
            list.remove(list.size() - 1);

            if (!isVisited[e]) { // 방문한적없으면
                isVisited[e] = true;

                // 리스트의 마지막값의 배열에서 0이 아닌 경우에만 리스트에 추가
                for (int i = 0; i < computers[e].length; i++) {
                    if (computers[e][i] != 0) {
                        list.add(i);
                    }
                }
                // System.out.println(n + ":" + list);
            }
        }
    }
}
