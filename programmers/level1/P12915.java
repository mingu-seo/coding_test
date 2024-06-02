package level1;

/**
 * Lesson42748
 */
public class P12915 {

    public static void main(String[] args) {
        String[] result = solution(new String[]{"sun", "bed", "car"}, 1);
        for (String a : result) {
            System.out.println(a);
        }
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        java.util.Arrays.sort(strings, new java.util.Comparator<String>(){
            public int compare(String o1, String o2) {
                if (o2.charAt(n) > o1.charAt(n)) {
                    return -1;
                } else if (o2.charAt(n) == o1.charAt(n)) {
                    return o1.compareTo(o2);
                }
                return 1;
            }
        });
        answer = strings;
        return answer;
    }
}