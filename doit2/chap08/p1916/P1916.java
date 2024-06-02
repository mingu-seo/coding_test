package doit2.chap08.p1916;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1916 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점 개수
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); // 간선 개수

        Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<Edge>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, w)); // 단방향
        }
        // System.out.println(graph);
        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); // 시작위치
        int E = Integer.parseInt(st.nextToken()); // 도착위치

        Map<Integer, Integer> result = dijkstraFunc(graph, S);
        // System.out.println(result);

        for (Integer r : result.keySet()) {
            if (r == E) {
                System.out.println(result.get(r));
            }
        }
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