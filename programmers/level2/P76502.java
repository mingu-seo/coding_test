package level2;

import java.util.ArrayList;
import java.util.List;

/**
 * P76502
 */
public class P76502 {
    public static void main(String[] args) {
        P76502 p = new P76502();
        int result = p.solution("[](){}");
        System.out.println(result);
    }

    public int solution(String s) {
        int answer = 0;
        int count = 0;
        while (count < s.length()) {
            List<Character> list = new ArrayList<>();
            boolean run = true;
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                    list.add(s.charAt(i));
                } else {
                    if (s.charAt(i) == ']') {
                        if (list.size() > 0 && list.get(list.size()-1) == '[') {
                            list.remove(list.size()-1);
                        } else {
                            run = false;
                            break;
                        }
                    } else if (s.charAt(i) == '}') {
                        if (list.size() > 0 && list.get(list.size()-1) == '{') {
                            list.remove(list.size()-1);
                        } else {
                            run = false;
                            break;
                        }
                    } else if (s.charAt(i) == ')') {
                        if (list.size() > 0 && list.get(list.size()-1) == '(') {
                            list.remove(list.size()-1);
                        } else {
                            run = false;
                            break;
                        }
                    }
                }
                
            }
            // System.out.println(list);
            count++;
            s = s.substring(1) + s.charAt(0);
            if (!run) continue;

            if (list.size() == 0) answer++;
        }

        return answer;
    }
}