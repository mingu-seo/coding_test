package level2;

/*
 * N진수 게임
 */
public class P17687 {
    public static void main(String[] args) {
        P17687 p = new P17687();
        // String result = p.solution(2, 4, 2, 1);
        // String result = p.solution(16, 16, 2, 1);
        String result = p.solution(16, 16, 2, 2);
        System.out.println(result);
    }

    // 진법, 숫자개수, 인원수, 튜브순서
    public String solution(int n, int t, int m, int p) {
        String answer = "";

        int v = 0; // 시작값
        int idx = 0; // 인원수 내에서 순번
        StringBuilder sb = new StringBuilder();
        while (t > 0) {
            String result = Integer.toString(v, n); // 진법변경

            // 해당진법으로 변경된 값으로 하나씩 반복(두번째 자리이후부터는 한문자씩 처리되므로)
            for (int i = 0; i < result.length(); i++) {

                if (idx == p - 1) { // 인원수내에서의 순번이 해당 튜브순서와 같아진 경우 리턴될문자열에 추가
                    sb.append(String.valueOf(result.charAt(i)).toUpperCase());
                    t--;
                }

                if (t == 0) // 남은숫자 감소하다 0이되면 중지, 바깥쪽 while문도 중지
                    break;

                idx++;
                if (idx == m) // 인원수랑 같아지면 0
                    idx = 0;
            }
            v++;
        }
        answer = sb.toString();
        return answer;
    }

}
