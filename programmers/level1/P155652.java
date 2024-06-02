package level1;

public class P155652 {
    public static void main(String[] args) {
        P155652 p = new P155652();
        String result = p.solution("aukks", "wbqd", 5);
        System.out.println(result);
    }

    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] sArr = s.toCharArray();
        char[] skipArr = skip.toCharArray();

        // a~z : 97 ~ 122
        
        // s 각 문자 반복
        for (int i=0; i<sArr.length; i++) {
            int moveCount = 0;
            // index횟수만큼 반복
            while (moveCount < index) {
                // System.out.println("sArr["+i+"]:"+sArr[i]);
                if (sArr[i]+1 > 122) { // z다음은 a로 변경
                    sArr[i] = 97;
                } else {
                    sArr[i]++;
                }
                // s의 문자가 skip문자열에 존재하는지 여부 체크
                boolean isPlus = true;
                for (int j=0; j<skipArr.length; j++) {
                    if (sArr[i] == skipArr[j]) {
                        isPlus = false;
                        break;
                    }
                }
                if (isPlus) moveCount++;
                if (moveCount == index) {
                    break;
                }
            }
            
        }
        
        for (char c : sArr) {
            answer += c;
        }
        return answer;
    }
}
