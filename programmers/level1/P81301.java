package level1;

/**
 */
public class P81301 {

    public static void main(String[] args) {
        int result = solution("0one4seveneight");
        System.out.println(result);
    }

    public static int solution(String s) {
        int answer = 0;
        String result = "";
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<s.length(); i++) {
            if ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 58) {
                result += s.charAt(i);
                // System.out.println("숫자");
                continue;
            }
            sb.append(s.charAt(i));
            switch (sb.toString()) {
                case "zero":
                    result += "0";
                    sb = new StringBuffer();
                    break;
                case "one":
                    result += "1";
                    sb = new StringBuffer();
                    break;
                case "two":
                    result += "2";
                    sb = new StringBuffer();
                    break;
                case "three":
                    result += "3";
                    sb = new StringBuffer();
                    break;
                case "four":
                    result += "4";
                    sb = new StringBuffer();
                    break;
                case "five":
                    result += "5";
                    sb = new StringBuffer();
                    break;
                case "six":
                    result += "6";
                    sb = new StringBuffer();
                    break;
                case "seven":
                    result += "7";
                    sb = new StringBuffer();
                    break;
                case "eight":
                    result += "8";
                    sb = new StringBuffer();
                    break;
                case "nine":
                    result += "9";
                    sb = new StringBuffer();
                    break;
                
            }
            System.out.println(sb.toString());
        }
        answer = Integer.parseInt(result);
        return answer;
    }
}