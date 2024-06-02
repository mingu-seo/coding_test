package doit2.chap08.prim.excer2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Excer {
    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<Edge>();
        edges.add(new Edge(1, 2, 8));
        edges.add(new Edge(1, 3, 3));
        edges.add(new Edge(2, 4, 4));
        edges.add(new Edge(3, 4, 13));
        edges.add(new Edge(2, 5, 5));
        edges.add(new Edge(4, 5, 2));

        System.out.println(edges);

        List<Edge> result = prim(1, edges);
        System.out.println(result);

        // 최소 가중치 합
        int weightSum = 0;
        for (Edge r : result) {
            weightSum += r.weight;
        }
        System.out.println(weightSum);
    }

    // 프림알고리즘
    static List<Edge> prim(Integer startNode, List<Edge> edges) {
        Edge currentEdge, poppedEdge, adjacentEdgeNode;
        ArrayList<Edge> currentEdgeList, candidateEdgeList, adjacentEdgeNodes;
        PriorityQueue<Edge> priorityQueue;

        ArrayList<Integer> connectedNodes = new ArrayList<Integer>();
        ArrayList<Edge> mst = new ArrayList<Edge>();
        HashMap<Integer, ArrayList<Edge>> adjacentEdges = new HashMap<Integer, ArrayList<Edge>>();

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
    public Integer nodeS; // 시작에지
    public Integer nodeE; // 종료에지
    public int weight; // 가중치

    public Edge(Integer nodeS, Integer nodeE, int weight) {
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