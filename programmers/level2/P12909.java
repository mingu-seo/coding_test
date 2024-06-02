package level2;

import java.util.ArrayList;
import java.util.List;

public class P12909 {
    public static void main(String[] args) {
        P12909 p = new P12909();
        boolean result = p.solution("(()(");
        System.out.println(result);
    }

    boolean solution(String s) {
        boolean answer = true;

        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (list.size() == 0) {
                list.add(c);
            } else {
                if ("(".equals(list.get(list.size() - 1)) && ")".equals(c)) {
                    list.remove(list.size() - 1);
                } else {
                    list.add(c);
                }
            }
            // System.out.println(list);
        }
        answer = list.size() == 0 ? true : false;
        return answer;
    }
}
