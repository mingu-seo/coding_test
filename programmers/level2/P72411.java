package level2;

import java.util.*;
import java.util.Map.Entry;

public class P72411 {
    public static void main(String[] args) {
        P72411 p = new P72411();
        String[] result = p.solution(new String[]{"XYZ", "XWY", "WXA"},new int[]{2,3,4});
        for (String r : result) {
            System.out.println(r);
        }
    }

    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        // 모든 주문의 건수를 저장할 map변수 <주문, 건수>
        Map<String, Integer> map = new HashMap<>();
        
        // 주문건수 반복
        for (int i=0; i<orders.length; i++) {
            char[] c = orders[i].toCharArray();
            Arrays.sort(c); // 알파벳순으로 정렬

            // 해당 주문의 모든 조합구하기
            boolean[] visited = new boolean[c.length];
            List<String> result = new ArrayList<>(); // 주문(조합결과)을 담을 리스트변수
            for (int j=0; j<course.length; j++) {
                combination(result, c, visited, 0, c.length, course[j]);
            }
            // 위에서구한 모든 조합에서 건수를 구하기 위해 map변수에 저장
            for (String str : result) {
                if (map.get(str) == null) {
                    map.put(str, 1);
                } else {
                    map.put(str, map.get(str)+1);
                }
            }
        }
        // 최대 주문수 저장할 map변수 <길이, 건수>
        Map<Integer, Integer> maxCourse = new HashMap<>();

        // 모든 주문과 건수 (map변수)를 반복하면서 건수가 2건이상인것만 최대주문수 변수에 저장
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                // System.out.println(entry.getKey() + ":" + entry.getValue());
                Integer key = entry.getKey().length();
                if (maxCourse.get(key) == null) {
                    maxCourse.put(key, entry.getValue());
                } else {
                    if (maxCourse.get(key) < entry.getValue()) {
                        maxCourse.put(key, entry.getValue());
                    }
                    
                }
            }
        }

        // 주문건수와 최대주문수가 같은 주문들을 result변수에 담음
        // 최대주문건수에 해당하는 주문이 여러개 있어도 모두 result변수에 담음
        List<String> result = new ArrayList<>();
        for (Entry<Integer, Integer> mc : maxCourse.entrySet()) {
            for (Entry<String, Integer> entry : map.entrySet()) {
                if (mc.getValue() == entry.getValue() && mc.getKey() == entry.getKey().length()) {
                    result.add(entry.getKey());
                }
            }
        }
        Collections.sort(result); // 오름차순 정렬
        answer = result.toArray(String[]::new); // 배열로 변환
        return answer;
    }

    /*
    result : 결과를 담을 객체
    arr : 조합을 뽑아낼 배열
    visited : 조합에 뽑혔는지 여부가 저장된 배열
    n : 배열의 길이
    r : 조합의 길이
    */
    public static void combination(List<String> result, char[] arr, boolean[] visited, int start, int n, int r) {

        if(r == 0) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    sb.append(arr[i]);
                }
            }
            result.add(sb.toString());
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(result, arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}
