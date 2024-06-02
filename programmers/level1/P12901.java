package level1;

import java.util.Calendar;

/**
 */
public class P12901 {

    public static void main(String[] args) {
        String arr = solution(5, 24);
        System.out.println(arr);
    }

    public static String solution(int a, int b) {
        String[] answer = new String[]{"","SUN","MON","TUE","WED","THU","FRI","SAT"};
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1, b);
        int yoil = cal.get(Calendar.DAY_OF_WEEK);
        return answer[yoil];
    }
}