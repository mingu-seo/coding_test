package level1;

import java.util.List;
import java.util.ArrayList;

public class P17682 {
    public static void main(String[] args) {
        P17682 p = new P17682();
        int answer = p.solution("1D2S3T*");
        System.out.println(answer);
    }

    public int solution(String dartResult) {
        int answer = 0;
        String value = "";
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<dartResult.length(); i++) {
            String c = String.valueOf(dartResult.charAt(i));
            
            if ("S".equals(c) || "D".equals(c) || "T".equals(c) || "*".equals(c) || "#".equals(c)) {
                
                if ("S".equals(c)) {
                    list.add(Integer.parseInt(value));
                } else if ("D".equals(c)) {
                    list.add((int)Math.pow(Integer.parseInt(value), 2));
                } else if ("T".equals(c)) {
                    list.add((int)Math.pow(Integer.parseInt(value), 3));
                }
                if ("*".equals(c)) {
                    // 핸재 점수 *2
                    list.set(list.size()-1, list.get(list.size()-1) * 2);
                    // 전의 점수도 *2
                    if (list.size() > 1) {
                        list.set(list.size()-2, list.get(list.size()-2) * 2);
                    }
                } else if ("#".equals(c)) {
                    list.set(list.size()-1, list.get(list.size()-1) * -1);
                }
                value = "";
            } else {
                value += c;
            }
        }
        for (int i=0; i<list.size(); i++) {
            answer += list.get(i);
            // System.out.println(list.get(i));
        }
        return answer;
    }
}
