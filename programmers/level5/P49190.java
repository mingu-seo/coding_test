package level5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P49190 {
    public static void main(String[] args) {
        P49190 p = new P49190();
        int result = p.solution(new int[] { 6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0 });
        System.out.println(result);
    }

    public int solution(int[] arrows) {
        int answer = 0;

        // 여덟 방향 좌표
        int[] dx = { 0, 1, 1, 1, 0, -1, -1, -1 };
        int[] dy = { -1, -1, 0, 1, 1, 1, 0, -1 };

        // 좌표가 담긴 그래프객체를 담을 맵객체
        Map<String, Graph> map = new HashMap<>();
        Graph v = new Graph(0, 0); // 0,0 초기좌표
        map.put(v.x + ":" + v.y, v); // 키값은 xy 0,0 -> 00
        for (int i = 0; i < arrows.length; i++) {
            for (int j = 0; j < 2; j++) {
                // 여덟방향 값
                int x = v.x + dx[arrows[i]];
                int y = v.y + dy[arrows[i]];
                String key = x + ":" + y; // 맵의 키값으로 사용할 변수

                if (!map.containsKey(key)) { // 없는 좌표이면 맵에 추가
                    map.put(key, new Graph(x, y));
                } else if (!v.connect.contains(key)) { // 리스트에 없으면 추가
                    // System.out.println("존재하는 좌표:" + key);
                    answer++;
                }

                // 현재 객체에 key(방향 객체) connect에 추가
                // key(방향 객체) connect에 현재 객체 추가
                Graph u = map.get(key);
                v.connect.add(u.x + ":" + u.y);
                u.connect.add(v.x + ":" + v.y);
                v = u; // 현재 객체를 방향 객체로 변경

                // System.out.println(key + ":" + map);
            }
        }
        return answer;
    }

    // 좌표를 저장할 그래프 객체
    class Graph {
        int x;
        int y;
        List<String> connect = new ArrayList<>(); // 해당 좌표(객체)와 연결된 다른 좌표(객체)의 키값

        Graph(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "x:" + x + ", y:" + y + ", connect:" + connect;
        }
    }
}
