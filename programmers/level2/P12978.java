package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * P12978
 */
public class P12978 {
    public static void main(String[] args) {
        P12978 p = new P12978();
        int result = p.solution(5, new int[][]{{1,2,1},{2,3,3},{5,2,2,},{1,4,2},{5,3,1},{5,4,2}}, 3);
        System.out.println(result);
    }

    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        List<String> vertices = new ArrayList<String>();
        for (int i=1; i<=N; i++) {
            vertices.add(i+"");
        }
        List<Edge> edges = new ArrayList<Edge>();
        for (int i=0; i<road.length; i++){
            edges.add(new Edge(road[i][0]+"", road[i][1]+"", road[i][2]));
        }

        System.out.println(edges);
        List<Edge> result = kruskal(vertices, edges);
        System.out.println(result);

        return answer;
    }

    // 유니온-파인드 알고리즘에서 사용할 변수
    static HashMap<String, String> parent = new HashMap<String, String>();
    static HashMap<String, Integer> rank = new HashMap<String, Integer>();

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
