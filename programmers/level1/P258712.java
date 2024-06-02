package level1;

import java.util.HashMap;
import java.util.Map;

public class P258712 {
    public static void main(String[] args) {
        P258712 p = new P258712();
        // int result = p.solution(new String[]{"muzi", "ryan", "frodo", "neo"},
        //                     new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"});
        // int result = p.solution(new String[]{"joy", "brad", "alessandro", "conan", "david"},
        //                     new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"});
        int result = p.solution(new String[]{"a", "b", "c"},
                            new String[]{"a b", "b a", "c a", "a c", "a c", "c a"});
        System.out.println(result);
    }
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Map<String, Integer>> all = new HashMap<>();
        for (int i=0; i<friends.length; i++) {
            Map<String, Integer> friend = new HashMap<>();
            for (int j=0; j<friends.length; j++) {
                friend.put(friends[j], 0);
            }
            all.put(friends[i], friend);
        }
        // System.out.println(all);

        // 주고받은 선물 내역
        for (int i=0; i<gifts.length; i++) {
            String[] gift = gifts[i].split(" ");
            Map<String, Integer> friend = all.get(gift[0]);
            friend.put(gift[1], friend.get(gift[1])+1);
        }
        // System.out.println(all);

        // 선물지수
        Map<String, Integer> gift_degree = new HashMap<>();
        for (String key : all.keySet()) {
            // 나머지 비교
            for (String key2 : all.get(key).keySet()) {
                if (!key.equals(key2)) {
                    // 준선물
                    gift_degree.put(key, gift_degree.getOrDefault(key,0)+all.get(key).get(key2));
                
                    // 받은선물
                    gift_degree.put(key2, gift_degree.getOrDefault(key2,0)-all.get(key).get(key2));
                }
            }
        }
        // System.out.println(gift_degree);
        // 친구들끼리 비교해서 준선물, 받은선물 구해서 준선물이 많으면 맵에 저장
        Map<String, Integer> diffMap = new HashMap<>();
        for (String key : all.keySet()) {
            int give = 0;
            int take = 0;
            for (String key2 : all.get(key).keySet()) {
                if (!key.equals(key2)) {
                    give = all.get(key).get(key2);
                    take = all.get(key2).get(key);
                    if (give > take) {
                        diffMap.put(key, diffMap.getOrDefault(key, 0)+1);
                    } else if (give == take) { // 주고받은 개수가 같다면
                        if (gift_degree.get(key) > gift_degree.get(key2)) { // 선물지수 비교해서 크면+1
                            diffMap.put(key, diffMap.getOrDefault(key, 0)+1);
                        }
                    }
                }
            }
        }
        // System.out.println(diffMap);

        // 가장 큰 선물수 구하기
        int max = 0;
        for (String key : diffMap.keySet()) {
            if (max < diffMap.get(key)) {
                max = diffMap.get(key);
            }
        }
        answer = max;
        return answer;
    }
}
