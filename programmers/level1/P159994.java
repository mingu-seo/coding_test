package level1;

/**
 */
public class P159994 {

    public static void main(String[] args) {
        String result = solution(new String[]{"i", "sadness", "sad"},
                                    new String[]{"tired"},
                                    new String[]{"i", "sadness", "sad", "tired"});
        System.out.println(result);
        
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        int c1 = 0;
        int c2 = 0;
        for (int i=0; i<goal.length; i++) {
            try {
                System.out.println(c1+":"+c2+":"+i);
                if (c1 < cards1.length && goal[i].equals(cards1[c1])) {
                    c1++;
                } else if (c2 < cards2.length && goal[i].equals(cards2[c2])) {
                    c2++;
                } else {
                    break;
                }
            } catch (Exception e) {
            }
        }
        if (c1 + c2 >= goal.length) answer = "Yes";
        return answer;
    }
}