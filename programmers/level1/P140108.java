package level1;

import java.util.*;

public class P140108 {
    public static void main(String[] args) {
        P140108 p = new P140108();
        int r = p.solution("aaabbaccccabba");
        System.out.println(r);
    }

    public int solution(String s) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        String temp = "";
        String start = "";
        int equalCount = 0;
        int noEqualCount = 0;

        for (int i=0; i<s.length(); i++) {
            if ("".equals(start)) {
                start = String.valueOf(s.charAt(i));
                equalCount = 1;
            }
            temp += s.charAt(i);
            if (temp.length() > 1) {
                if (start.equals(String.valueOf(s.charAt(i)))) {
                    equalCount++;
                } else {
                    noEqualCount++;
                }
            }

            if (equalCount > 0 && noEqualCount > 0 && equalCount == noEqualCount) {
                list.add(temp);
                start = "";
                temp = "";
                equalCount = 0;
                noEqualCount = 0;
            }
            // 횟수비교해서 넣다가 분리되지 않은 문자열이 있는 경우
            if (i == s.length()-1 && !"".equals(temp)) {
                list.add(temp);
            }
        }
        // for (String str : list) {
        //     System.out.println(str);
        // }
        answer = list.size();
        return answer;
    }
}
