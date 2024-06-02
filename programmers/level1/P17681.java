package level1;

/**
 * Lesson42748
 */
public class P17681 {

    public static void main(String[] args) {
        // String[] result = solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        String[] result = solution(6, new int[]{1,1,1,1,1,1}, new int[]{1,1,1,1,1,1});
        for (String a : result) {
            System.out.println(a);
        }
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] result = new String[2][n];
        for (int j=0; j<n; j++) {
            String r = Integer.toBinaryString(arr1[j]);
            int r_length = r.length();
            for (int i=0; i<n-r_length; i++) {
                r = "0"+r;
            }
            // System.out.println(r);
            result[0][j] = r;
        }
        for (int j=0; j<n; j++) {
            String r = Integer.toBinaryString(arr2[j]);
            int r_length = r.length();
            for (int i=0; i<n-r_length; i++) {
                r = "0"+r;
            }
            // System.out.println(r);
            result[1][j] = r;
        }

        // 2진수로 1이면 # 0이면 빈문자열로 변경처리
        for (int i=0; i<result[0].length; i++) {
            String str = "";
            for (int k=0; k<n; k++) {
                if (result[0][i].charAt(k) == '1' || result[1][i].charAt(k) == '1') {
                    str += "#";
                } else {
                    str += " ";
                }
            }
            answer[i] = str;
        }
        return answer;
    }
}