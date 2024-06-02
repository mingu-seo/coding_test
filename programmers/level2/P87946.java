package level2;

import java.util.ArrayList;
import java.util.List;

/*
 * 던전순서를 순열로 모든 경우의 수를 구함
 * 각 경우의수 만큼 반복해서 피로도 확인
 * 최대값 리턴
 */

public class P87946 {
    public static void main(String[] args) {
        P87946 p = new P87946();
        int r = p.solution(80, new int[][]{{80,20},{50,40},{30,10}});
        System.out.println(r);
    }
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        // 모든 순열구하기
        boolean[] visited = new boolean[dungeons.length];
        int[] output = new int[dungeons.length];
        int[] c = new int[dungeons.length]; // 인덱스담을 배열
        for (int i=0; i<c.length; i++) {
            c[i] = i;
        }

        List<String> result = new ArrayList<>(); // 순열결과를 담을 변수
        
        perm(result, c, output, visited, 0, c.length, c.length);
        
        // 순열결과를 배열로 담아 리스트에 저장
        List<Integer[]> order = new ArrayList<>();
        for (int i=0; i<result.size(); i++) {
            char[] cArr = result.get(i).toCharArray();
            Integer[] iArr = new Integer[cArr.length];
            for (int j=0; j<cArr.length; j++) {
                iArr[j] = Integer.parseInt(String.valueOf(cArr[j]));
            }
            order.add(iArr);
        }

        int maxTravel = 0;
        for (int i=0; i<order.size(); i++) {
            int count = 0;
            int hp = k;
            for (int j=0; j<order.get(i).length; j++) {
                int idx = order.get(i)[j];
                if (hp < dungeons[idx][0]) {
                    
                } else {
                    hp -= dungeons[idx][1];
                    count++;
                }
            }
            if (maxTravel < count) maxTravel = count;
        }
        answer = maxTravel;
        return answer;
    }

    /*
    result : 결과를 담을 객체
    arr : 순열을 뽑아낼 배열
    output : 값을담을 임시공간
    visited : 순열에 뽑혔는지 여부가 저장된 배열
    depth : 깊이(시작값)
    n : 배열의 길이
    r : 순열의 길이
    */
    void perm(List<String> result, int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        
        if (depth == r) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < r; i++) {
                sb.append(output[i]);
            }
            
            result.add(sb.toString());
            return;
        }
        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(result, arr, output, visited, depth + 1, n, r); 
                visited[i] = false;;
            }
        }
    }
}
