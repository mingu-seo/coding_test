package level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class P17677 {
    public static void main(String[] args) {
        P17677 p = new P17677();
        // int result = p.solution("FRANCE", "french");
        // int result = p.solution("handshake", "shake hands");
        // int result = p.solution("aa1+aa2", "AAAA12");
        int result = p.solution("E=M*C^2", "e=m*c^2");
        System.out.println(result);
    }

    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> list1 = new ArrayList<>();
        String str = "";
        for (int i=0; i<str1.length(); i++) {
            str += String.valueOf(str1.charAt(i));
            if (str.length() == 2) {
                boolean r = Pattern.matches("^[a-z|A-Z]*", str);
                if (r) {
                    list1.add(str.toUpperCase());
                }
                str = str.substring(1);
            }
        }
        str = "";
        List<String> list2 = new ArrayList<>();
        for (int i=0; i<str2.length(); i++) {
            str += String.valueOf(str2.charAt(i));
            if (str.length() == 2) {
                boolean r = Pattern.matches("^[a-z|A-Z]*", str);
                if (r) {
                    list2.add(str.toUpperCase());
                }
                str = str.substring(1);
            }
        }
        // System.out.println(list1);
        // System.out.println(list2);

        // 교집합
        int cross = 0;
        // 합집합
        int total = 0;
        Set<String> list3 = new HashSet<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
        for (String s : list3) {
            int cnt1 = 0;
            int cnt2 = 0;
            for (String s1 : list1) {
                if (s1.equals(s)) {
                    cnt1++;
                }
            }
            for (String s2 : list2) {
                if (s2.equals(s)) {
                    cnt2++;
                }
            }
            cross += Math.min(cnt1, cnt2);
            total += Math.max(cnt1, cnt2);
        }
        if (total == 0) return 65536; // 합집합 개수가 0인 경우
        // System.out.println(cross +","+ total);
        answer = (int)((double)cross / total * 65536);

        return answer;
    }
}
