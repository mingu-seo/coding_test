package level3;

/*
 하노이의 탑
 
 재귀호출로 해결할 수 있는 대표적인 문제, 반복문보다는 재귀호출이 더 쉬움

 하노이의 탑은 원판n개를 기둥1에서 3으로(어디에서 어디로) 이동시키는 문제
 총 3개의 변수
 - 옮기려는 원판개수, 현재위치한 기둥, 이동할 기둥
 결국 원판의개수만큼을 현재위치 기둥에서 이동할 기둥으로 옮기는 과정
 
 재귀호출 종료조건 = 개수가 1
 점화식 = (n-1, from, to)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12946 {
    public static void main(String[] args) {
        P12946 p = new P12946();
        int[][] result = p.solution(2);
        for (int[] r : result) {
            System.out.println(Arrays.toString(r));
        }
    }

    public int[][] solution(int n) {
        int[][] answer = {};
        move(n, 1, 3);
        // for (int[] e : route) {
        // System.out.println(Arrays.toString(e));
        // }
        answer = route.toArray(new int[route.size()][]);
        return answer;
    }

    // 이동경로를 저장할 변수
    static List<int[]> route = new ArrayList<>();

    static void move(int n, int from, int to) {
        if (n == 1) { // 종료조건
            route.add(new int[] { from, to });
            return;
        }
        // 빈기둥 찾기
        int empty = 6 - from - to; // (n-1, f, 빈) + (1, from, to) + (n-1, 빈, to)
        move(n - 1, from, empty);
        move(1, from, to);
        move(n - 1, empty, to);
    }
}
