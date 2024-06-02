package doit2.chap08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DijkstraTest {
    public static void main(String[] args) {

        // 우선순위큐 사용
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge("A", 2));
        pq.add(new Edge("B", 5));
        pq.offer(new Edge("C", 1));
        pq.offer(new Edge("D", 7));
        System.out.println(pq);

        // 우선순위가 높은(distance가 작은)값부터 꺼내짐, poll() : 꺼내면서 삭제, peek() : 꺼내기만하고 삭제안됨
        // 첫번째값
        System.out.println(pq.poll());
        // 두번째값
        System.out.println(pq.poll());

        // 위 그래프 예시
        HashMap<String, ArrayList<Edge>> graph = new HashMap<>();
        graph.put("A", new ArrayList<Edge>(Arrays.asList(new Edge("B", 8), new Edge("C", 1), new Edge("D", 2))));
        graph.put("B", new ArrayList<Edge>());
        graph.put("C", new ArrayList<Edge>(Arrays.asList(new Edge("B", 5), new Edge("D", 2))));
        graph.put("D", new ArrayList<Edge>(Arrays.asList(new Edge("E", 3), new Edge("F", 5))));
        graph.put("E", new ArrayList<Edge>(Arrays.asList(new Edge("F", 1))));
        graph.put("F", new ArrayList<Edge>(Arrays.asList(new Edge("A", 5))));

        for (String key : graph.keySet()) {
            System.out.println(key + ":" + graph.get(key));
        }

        // 다익스트라 메서드 사용해서 A부터 나머지 노드들의 최단 알고리즘 구하기
        HashMap<String, Integer> result = dijkstraFunc(graph, "A");
        System.out.println(result);
    }

    // 다익스트라 알고리즘 구현 메서드
    static HashMap<String, Integer> dijkstraFunc(HashMap<String, ArrayList<Edge>> graph, String start) {
        Edge edgeNode, adjacentNode;
        ArrayList<Edge> nodeList;
        int currentDistance, weight, distance;
        String currentNode, adjacent;
        HashMap<String, Integer> distances = new HashMap<String, Integer>();

        // 그래프의 모든 정점에 대해 최단 거리를 무한대로 초기화
        for (String key : graph.keySet()) {
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

// 엣지 클래스
class Edge implements Comparable<Edge> {
    public int distance; // 정점
    public String vertex; // 거리

    public Edge(String vertex, int distance) {
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