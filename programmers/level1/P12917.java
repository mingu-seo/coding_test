package level1;

import java.util.Arrays;
import java.util.Collections;

/**
 */
public class P12917 {

    public static void main(String[] args) {
        String result = solution("Zbcdefg");
        System.out.println(result);
    }

    public static String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();
        for (String str : strArr) {
            sb.append(str);
        }
        answer = sb.toString();
        return answer;
    }
}