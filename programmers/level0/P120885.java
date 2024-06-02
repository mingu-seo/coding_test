package level0;


public class P120885 {

    public static void main(String[] args) {
        String r = solution("10", "11");
        
        System.out.println(r);
        
    }

    public static String solution(String bin1, String bin2) {
        String answer = "";
        int i1 = Integer.parseInt(bin1, 2);
        int i2 = Integer.parseInt(bin2, 2);
        answer = Integer.toBinaryString(i1+i2);
        return answer;
    }
}