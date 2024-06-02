package level0;


public class P120886 {

    public static void main(String[] args) {
        int r = solution("allpe", "apple");
        
        System.out.println(r);
        
    }

    public static int solution(String before, String after) {
        // 순서를 다르게하라는것을 반대로 뒤집으라고 오해가능
        // 문자열을 배열로 변환해서 정렬 후 비교
        int answer = 1;
        String[] barr = new String[before.length()];
        String[] aarr = new String[after.length()];
        for (int i=0; i<before.length(); i++) {
            barr[i] = String.valueOf(before.charAt(i));
            aarr[i] = String.valueOf(after.charAt(i));
        }
        java.util.Arrays.sort(barr);
        java.util.Arrays.sort(aarr);
        for (int i=0; i<barr.length; i++) {
            if (!barr[i].equals(aarr[i])) {
                return 0;
            }
        }
        
        return answer;
    }
}