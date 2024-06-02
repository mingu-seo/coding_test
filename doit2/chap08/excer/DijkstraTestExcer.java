package doit2.chap08.excer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 다익스트라 실습
 */
public class DijkstraTestExcer {
    public static void main(String[] args) {

        HashMap<Integer, ArrayList<Edge>> graph = new HashMap<>();
        graph.put(1, new ArrayList<Edge>(Arrays.asList(new Edge(2, 8), new Edge(3, 3))));
        graph.put(2, new ArrayList<Edge>(Arrays.asList(new Edge(4, 4), new Edge(5, 15))));
        graph.put(3, new ArrayList<Edge>(Arrays.asList(new Edge(4, 13))));
        graph.put(4, new ArrayList<Edge>(Arrays.asList(new Edge(5, 2))));
        graph.put(5, new ArrayList<Edge>());

        for (Integer key : graph.keySet()) {
            System.out.println(key + ":" + graph.get(key));
        }

        // 다익스트라 메서드 사용해서 1부터 나머지 노드들의 최단 알고리즘 구하기
        HashMap<Integer, Integer> result = dijkstraFunc(graph, 1);
        System.out.println(result);
    }

    // 다익스트라 메서드
    static HashMap<Integer, Integer> dijkstraFunc(HashMap<Integer, ArrayList<Edge>> graph, Integer start) {
        Edge edgeNode, adjacentNode;
        ArrayList<Edge> nodeList;
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