package level2;

import java.util.*;

/**
 * P42746
 */
public class P42746 {
    public static void main(String[] args) {
        P42746 p = new P42746();
        String result = p.solution(new int[]{9, 998});
        System.out.println(result);
    }

    public String solution(int[] numbers) {
        String answer = "";
        String[] numbersStr = new String[numbers.length];
        for (int i=0; i<numbersStr.length; i++) {
            numbersStr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(numbersStr, (o1, o2) -> {
            String o12 = o1+o2;
            String o21 = o2+o1;
            if (Integer.parseInt(o21) > Integer.parseInt(o12)) {
                return 1;
            } else if (Integer.parseInt(o21) < Integer.parseInt(o12)) {
                return -1;
            } else {
                return 0;
            }
        });
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<numbersStr.length; i++) {
                sb.append(numbersStr[i]);
        }
        // System.out.println(Arrays.toString(numbersStr));
        String result = sb.toString();
        answer = sb.toString();
        int idx = 0;
        // 맨앞자리 0인경우 제거
        while (true) {
            if ('0' == result.charAt(idx)) {
                answer = result.substring(idx);
            } else {
                break;
            }
            idx++;
            if (idx >= result.length()) break;
        }
        if ("".equals(answer)) answer = "0";
        
        return answer;
    }
}