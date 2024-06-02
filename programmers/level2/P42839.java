package level2;

import java.util.*;

/*
 * 입력받은 문자열을 캐릭터배열로 변환 후 순열 구함
 * 순열을 통해 모든 경우의 수를 구해 소수인지 판별
 * 소수인 경우에만 +1
 */

public class P42839 {
    public static void main(String[] args) {
        P42839 p = new P42839();
        int r = p.solution("17");
        System.out.println(r);
    }
    public int solution(String numbers) {
        int answer = 0;
        char[] c = numbers.toCharArray();
        
        // 모든 순열구하기
        boolean[] visited = new boolean[c.length];
        char[] output = new char[c.length];
        List<String> result = new ArrayList<>(); // 순열결과를 담을 변수
        for (int j=1; j<=c.length; j++) {
            perm(result, c, output, visited, 0, c.length, j);
        }

        Set<Integer> set = new HashSet<>();
        for (String i : result) {
            set.add(Integer.parseInt(i));
        }
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int val = iter.next();
            if (val > 1) {
                // 소수인지 체크
                boolean isPrime = true;
                for (int i=2; i<=val/2; i++) { // 소수인지 비교할때 < 아니라 <=
                    if (val % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) answer++;
            }
        }
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
    void perm(List<String> result, char[] arr, char[] output, boolean[] visited, int depth, int n, int r) {
        
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
