package level2;

import java.util.ArrayList;
import java.util.List;

public class P60057 {
    public static void main(String[] args) {
        P60057 p = new P60057();
        int result = p.solution("aabbaccc");
        System.out.println(result);
    }

    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i <= s.length(); i++) {
            StringBuffer sb = new StringBuffer();
            String str = "";
            int cnt = 0;
            List<String> splitList = new ArrayList<>();
            for (int j = 0; j < s.length(); j += i) {
                int end = j + i;
                if (end > s.length()) {
                    end = s.length();
                }
                splitList.add(s.substring(j, end));
            }
            for (int j = 0; j < splitList.size(); j++) {
                if (str.equals(splitList.get(j))) {
                    cnt++;
                } else {
                    if (cnt > 1) {
                        sb.append(cnt);
                    }
                    sb.append(str);
                    str = splitList.get(j);
                    cnt = 1;
                }
            }
            if (cnt > 1) {
                sb.append(cnt);
            }
            sb.append(str);
            if (answer > sb.length()) {
                answer = sb.length();
            }
        }

        return answer;
    }
}
