package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * P12978
 */
public class P12978 {
    public static void main(String[] args) {
        P12978 p = new P12978();
        // int result = p.solution(5, new int[][]{{1,2,1},{2,3,3},{5,2,2,},{1,4,2},{5,3,1},{5,4,2}}, 3);
        int result = p.solution(6, new int[][]{{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}}, 4);
        System.out.println(result);
    }

    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        // 엣지(마을) 생성
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<Edge>());
        }

        // 마을별 상대마을엣지값, 거리 등록
        for (int i = 0; i < road.length; i++) {
            graph.get(road[i][0]).add(new Edge(road[i][1], road[i][2]));
            graph.get(road[i][1]).add(new Edge(road[i][0], road[i][2]));
        }

        // System.out.println(graph); // 그림하고 비교

        Map<Integer, Integer> result = dijkstraFunc(graph, 1); // 시작위치 1
        for (Integer r : result.keySet()) {
            // System.out.println(r + ":" + result.get(r));
            if (result.get(r) <= K) {
                answer++;
            }
        }

        return answer;
    }

    

    // 다익스트라 메서드
    static HashMap<Integer, Integer> dijkstraFunc(Map<Integer, List<Edge>> graph, Integer start) {
        Edge edgeNode, adjacentNode;
        List<Edge> nodeList;
        int currentDistance, weight, distance;
        Integer currentNode, adjacent;
        HashMap<Integer, Integer> distances = new HashMap<>();

        // 그래프의 모든 정점에 대해 최단 거리를 무한대로 초기화
        for (Integer key : graph.keySet()) {
            distances.put(key, Integer.MAX_VALUE);
        }
        // 시작 정점의 거리를 0으로 초기화
        distances.put(start, 0);

        // 우선순위 큐를 사용하여 가장 가까운 정점부터 처리
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<Edge>();
        priorityQueue.add(new Edge(start, distances.get(start)));

        // 알고리즘 작성
        while (priorityQueue.size() > 0) {
            edgeNode = priorityQueue.poll(); // 큐에서 거리가 가장 짧은 정점을 꺼냄
            currentDistance = edgeNode.distance;
            currentNode = edgeNode.vertex;
            // 현재 정점의 처리된 최단 거리가 큐에서 꺼낸 거리보다 작으면 무시 (이미 더 짧은 경로를 찾았음)
            if (distances.get(currentNode) < currentDistance) {
                continue;
            }
            // 현재 정점에 인접한 모든 정점을 탐색
            nodeList = graph.get(currentNode);
            for (int index = 0; index < nodeList.size(); index++) {
                adjacentNode = nodeList.get(index);
                adjacent = adjacentNode.vertex; // 인접 정점
                weight = adjacentNode.distance; // 현재 정점에서 인접 정점까지의 거리(가중치)
                distance = currentDistance + weight; // 시작 정점에서 인접 정점까지의 총 거리

                // 총 거리가 기존에 알려진 인접 정점까지의 거리보다 작으면 업데이트
                if (distance < distances.get(adjacent)) {
                    distances.put(adjacent, distance);
                    priorityQueue.add(new Edge(adjacent, distance)); // 업데이트된 거리로 우선순위 큐에 다시 추가
                }
            }
        }
        return distances;
    }
}

// 에지클래스
class Edge implements Comparable<Edge> {
    public int distance; // 정점
    public Integer vertex; // 거리

    public Edge(Integer vertex, int distance) {
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public String toString() {
        return "vertex: " + this.vertex + ", distance: " + this.distance;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.distance - edge.distance;
    }
}
