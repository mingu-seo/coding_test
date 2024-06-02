package doit2.chap08.prim.excer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Excer {
    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<Edge>();
        edges.add(new Edge("A", "B", 7));
        edges.add(new Edge("A", "D", 5));
        edges.add(new Edge("B", "C", 8));
        edges.add(new Edge("B", "D", 9));
        edges.add(new Edge("D", "E", 7));
        edges.add(new Edge("C", "E", 5));
        edges.add(new Edge("B", "E", 7));
        edges.add(new Edge("D", "F", 6));
        edges.add(new Edge("E", "F", 8));
        edges.add(new Edge("E", "G", 9));
        edges.add(new Edge("F", "G", 11));

        System.out.println(edges);

        List<Edge> result = prim("A", edges);
        System.out.println(result);
    }

    // 프림알고리즘
    static List<Edge> prim(String startNode, List<Edge> edges) {
        Edge currentEdge, poppedEdge, adjacentEdgeNode;
        ArrayList<Edge> currentEdgeList, candidateEdgeList, adjacentEdgeNodes;
        PriorityQueue<Edge> priorityQueue;

        ArrayList<String> connectedNodes = new ArrayList<String>();
        ArrayList<Edge> mst = new ArrayList<Edge>();
        HashMap<String, ArrayList<Edge>> adjacentEdges = new HashMap<String, ArrayList<Edge>>();

        for (int index = 0; index < edges.size(); index++) {
            currentEdge = edges.get(index);
            if (!adjacentEdges.containsKey(currentEdge.nodeS)) {
                adjacentEdges.put(currentEdge.nodeS, new ArrayList<Edge>());
            }
            if (!adjacentEdges.containsKey(currentEdge.nodeE)) {
                adjacentEdges.put(currentEdge.nodeE, new ArrayList<Edge>());
            }
        }

        for (int index = 0; index < edges.size(); index++) {
            currentEdge = edges.get(index);
            currentEdgeList = adjacentEdges.get(currentEdge.nodeS);
            currentEdgeList.add(new Edge(currentEdge.nodeS, currentEdge.nodeE, currentEdge.weight));
            currentEdgeList = adjacentEdges.get(currentEdge.nodeE);
            currentEdgeList.add(new Edge(currentEdge.nodeE, currentEdge.nodeS, currentEdge.weight));
        }

        connectedNodes.add(startNode);
        candidateEdgeList = adjacentEdges.getOrDefault(startNode, new ArrayList<Edge>());
        priorityQueue = new PriorityQueue<Edge>();
        for (int index = 0; index < candidateEdgeList.size(); index++) {
            priorityQueue.add(candidateEdgeList.get(index));
        }

        while (priorityQueue.size() > 0) {
            poppedEdge = priorityQueue.poll();
            if (!connectedNodes.contains(poppedEdge.nodeE)) {
                // 해당 edge 를 mst 에 추가
                connectedNodes.add(poppedEdge.nodeE);
                mst.add(new Edge(poppedEdge.nodeS, poppedEdge.nodeE, poppedEdge.weight));

                adjacentEdgeNodes = adjacentEdges.getOrDefault(poppedEdge.nodeE, new ArrayList<Edge>());
                for (int index = 0; index < adjacentEdgeNodes.size(); index++) {
                    adjacentEdgeNode = adjacentEdgeNodes.get(index);
                    if (!connectedNodes.contains(adjacentEdgeNode.nodeE)) {
                        priorityQueue.add(adjacentEdgeNode);
                    }
                }
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