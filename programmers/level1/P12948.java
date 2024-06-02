package level1;

/**
 * 없는 숫자 더하기
 */
public class P12948 {

    public static void main(String[] args) {
        String result = solution("01033334444");
        System.out.println(result);
    }

    public static String solution(String phone_number) {
        String answer = "";
        int totalSize = phone_number.length();
        int starSize = totalSize-4;
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<starSize; i++) {
            //answer += "*";
            sb.append("*");
        }
        // answer += phone_number.substring(starSize);
        answer = sb.toString() + phone_number.substring(starSize);
        return answer;
    }
}