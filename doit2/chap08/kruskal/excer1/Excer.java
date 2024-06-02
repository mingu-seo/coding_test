package doit2.chap08.kruskal.excer1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Excer {

    // 유니온-파인드 알고리즘에서 사용할 변수
    static HashMap<String, String> parent = new HashMap<String, String>();
    static HashMap<String, Integer> rank = new HashMap<String, Integer>();

    public static void main(String[] args) {
        List<String> vertices = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        List<Edge> edges = new ArrayList<Edge>();
        edges.add(new Edge("A", "B", 7));
        edges.add(new Edge("A", "D", 5));
        edges.add(new Edge("B", "A", 7));
        edges.add(new Edge("B", "C", 8));
        edges.add(new Edge("B", "D", 9));
        edges.add(new Edge("B", "E", 7));
        edges.add(new Edge("C", "B", 8));
        edges.add(new Edge("C", "E", 5));
        edges.add(new Edge("D", "A", 5));
        edges.add(new Edge("D", "B", 9));
        edges.add(new Edge("D", "E", 7));
        edges.add(new Edge("D", "F", 6));
        edges.add(new Edge("E", "B", 7));
        edges.add(new Edge("E", "C", 5));
        edges.add(new Edge("E", "D", 7));
        edges.add(new Edge("E", "F", 8));
        edges.add(new Edge("E", "G", 9));
        edges.add(new Edge("F", "D", 6));
        edges.add(new Edge("F", "E", 8));
        edges.add(new Edge("F", "G", 11));
        edges.add(new Edge("G", "E", 9));
        edges.add(new Edge("G", "F", 11));

        System.out.println(edges);

        // 크루스칼 알고리즘 적용
        List<Edge> result = kruskal(vertices, edges);
        System.out.println(result);
    }

    // 유니온-파인드 알고리즘
    // 참고: path compression 기법 구현시, 각 node 의 rank 정보까지 업데이트할 필요는 없음
    // rank 정보를 사용하는 union-by-rank 기법은 루트 node 의 rank 정보만을 사용하기 때문
    static String find(String node) {
        // path compression 기법
        if (parent.get(node) != node) {
            parent.put(node, find(parent.get(node)));
        }
        return parent.get(node);
    }

    static void union(String nodeS, String nodeE) {
        String root1 = find(nodeS);
        String root2 = find(nodeE);

        // union-by-rank 기법
        if (rank.get(root1) > rank.get(root2)) {
            parent.put(root2, root1);
        } else {
            parent.put(root1, root2);
            if (rank.get(root1) == rank.get(root2)) {
                rank.put(root2, rank.get(root2) + 1);
            }
        }
    }

    static void makeSet(String node) {
        parent.put(node, node);
        rank.put(node, 0);
    }

    // 크루스칼 알고리즘
    static List<Edge> kruskal(List<String> vertices, List<Edge> edges) {
        List<Edge> mst = new ArrayList<Edge>();
        Edge currentEdge;

        // 1. 초기화
        for (int index = 0; index < vertices.size(); index++) {
            makeSet(vertices.get(index));
        }

        // 2. 에지정렬 weight 기준
        Collections.sort(edges);

        for (int index = 0; index < edges.size(); index++) {
            currentEdge = edges.get(index);
            if (find(currentEdge.nodeS) != find(currentEdge.nodeE)) {
                union(currentEdge.nodeS, currentEdge.nodeE);
                mst.add(currentEdge);
            }
        }
        return mst;
    }
}

// 에지클래스
class Edge implements Comparable<Edge> {
    public String nodeS; // 시작에지
    public String nodeE; // 종료에지
    public int weight; // 가중치

    public Edge(String nodeS, String nodeE, int weight) {
        this.nodeS = nodeS;
        this.nodeE = nodeE;
        this.weight = weight;
    }

    public String toString() {
        return "(" + this.nodeS + ", " + this.nodeE + ", " + this.weight + ")";
    }

    // 정렬
    @Override
    public int compareTo(Edge edge) {
        return this.weight - edge.weight;
    }
}