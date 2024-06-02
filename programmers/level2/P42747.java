package level2;

import java.util.*;

/**
 * P42747
 * 
 * [3,0,6,1,5]
 * 정렬하면
 * 0,1,3,5,6
 * 1 : 4
 * 2 : 3
 * 3 : 3
 * 4 : 2
 * 5 : 2
 * 이 두 수중에 작은걸로 배열에 저장
 * 저장한 배열 중 가장 큰 수를 리턴
 */
public class P42747 {

    public static void main(String[] args) {
        P42747 p = new P42747();
        int r = p.solution(new int[]{3,0,6,1,5});
        System.out.println(r);
    }
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int[] hindex = new int[citations.length];
        for (int i=0; i<citations.length; i++) {
            int cnt = citations[i];
            int more = citations.length - i;
            if (cnt > more) {
                hindex[i] = more;
            } else {
                hindex[i] = cnt;
            }
        }
        Arrays.sort(hindex);
        answer = hindex[hindex.length-1];
        // for (int[] v : arr) {
        //     System.out.println(v[0] +":"+v[1]);
        // }
        return answer;
    }
}