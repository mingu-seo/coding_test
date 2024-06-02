package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P17686 {
    public static void main(String[] args) {
        P17686 p = new P17686();
        // String[] result = p
        // .solution(new String[] { "img12.png", "img10.png", "img02.png", "img1.png",
        // "IMG01.GIF", "img2.JPG" });
        String[] result = p
                .solution(new String[] { "F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II",
                        "F-14 Tomcat", "F-15" });
        for (String r : result) {
            System.out.println(r);
        }
    }

    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        // System.out.println((int) ' ');
        List<Map<String, String>> list = new ArrayList<>();

        for (String file : files) {
            int loc = 0; // HEAD인지 NUMBER인지 구분값
            int h = -1; // HEAD 마지막 위치값
            int n = -1; // NUMBER 마지막 위치값
            for (int i = 0; i < file.length(); i++) {
                // HEAD 구하기
                if (loc == 0) {
                    // 공백 . - 소문자 대문자 인 경우
                    if (file.charAt(i) == 32 || file.charAt(i) == 45 || file.charAt(i) == 46
                            || (file.charAt(i) >= 65 && file.charAt(i) <= 90)
                            || (file.charAt(i) >= 97 && file.charAt(i) <= 122)) {
                        h++;
                    } else {
                        loc++; // 위값이 아닌 다른값(숫자)가 나오면 loc = 1
                        n = h + 1; // 숫자가 시작되는값은 h의 다음위치
                    }
                } else if (loc == 1) { // NUMBER 구하기
                    if (file.charAt(i) >= 48 && file.charAt(i) <= 57) { // 숫자인 경우
                        n++;
                    } else { // 숫자가 아니면 반복중지 다음 문자열로 이동
                        break;
                    }
                }
            }
            String head = file.substring(0, h + 1); // HEAD
            String number = file.substring(h + 1, n + 1); // NUMBER
            String tail = file.substring(head.length() + number.length()); // HEAD와 NUMBER를 제외한 나머지값
            // System.out.println(head + ":" + number + ":" + tail);
            Map<String, String> map = new HashMap<>(); // map에 저장
            map.put("ORG", file);
            map.put("HEAD", head);
            map.put("NUMBER", number);
            map.put("TAIL", tail);
            list.add(map);
        }
        // System.out.println(list);
        Collections.sort(list, (m1, m2) -> { // 정렬기준 재정의
            String head1 = m1.get("HEAD");
            String head2 = m2.get("HEAD");
            if (head1.compareToIgnoreCase(head2) == 0) { // 문자열비교 대소문자 무시하고 같으면 숫자로 비교
                int number1 = Integer.parseInt(m1.get("NUMBER"));
                int number2 = Integer.parseInt(m2.get("NUMBER"));
                return number1 - number2;
            } else {
                return head1.compareToIgnoreCase(head2);
            }
        });
        // System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).get("ORG");
        }
        return answer;
    }
}
