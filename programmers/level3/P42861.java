package level3;

import java.util.Arrays;

public class P42861 {
    public static void main(String[] args) {
        P42861 p = new P42861();
        int result = p.solution(4, new int[][] { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } });
        System.out.println(result);
    }

    /*
     * 크루스칼 알고리즘을 사용하여 최소 스패닝 트리
     */
    int[] parent;

    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        // 초기화: 각 노드는 자기 자신을 부모로 가짐
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        // 비용기준으로 오름차순
        Arrays.sort(costs, (o1, o2) -> o1[2] - o2[2]);
        int edgeCount = 0;

        for (int i = 0; i < costs.length; i++) {
            if (edgeCount == n - 1) { // 이미 모든 노드가 연결된 경우 반복 종료
                break;
            }
            // 두 노드가 서로 다른 집합에 속해 있는 경우에만 선택
            if (find(costs[i][0]) != find(costs[i][1])) {
                union(costs[i][0], costs[i][1]);
                answer += costs[i][2]; // 비용 추가
                edgeCount++;
            }
        }
        return answer;
    }

    // 경로 압축 기법을 사용하는 find 함수
    int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    // 두 집합을 합치는 union 함수
    void union(int x, int y) {
        parent[find(y)] = find(x);
    }
}
