package level2;

import java.util.ArrayList;
import java.util.List;

public class P17680 {
    public static void main(String[] args) {
        P17680 p = new P17680();
        // int result = p.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
        // int result = p.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"});
        // int result = p.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
        // int result = p.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
        int result = p.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"});
        System.out.println(result);
    }

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new ArrayList<>();
        if (cacheSize == 0) return 5*cities.length; // 캐시사이즈가 0일때는 길이*5
        for (int i=0; i<cities.length; i++) {
            if (cache.contains(cities[i].toLowerCase())) {
                answer += 1;
                cache.remove(cities[i].toLowerCase());
            } else {
                answer += 5;
            }
            if (cacheSize > 0 && cache.size() == cacheSize) cache.remove(0);
            cache.add(cities[i].toLowerCase());
        }
        return answer;
    }
}
