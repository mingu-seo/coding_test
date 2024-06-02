package level1;

import java.util.*;
/**
 * P131128
 * 
 * answer를 StringBuffer로 바꿔도 안되고
 * ArrayList를 LinkedList로 바꿔도 안되고
 * 결국 배열로 변경해서 테스트해봤는데, sb.toString()이부분도 속도를 느리게 만드는 원인
 */
public class P131128 {

    public static void main(String[] args) {
        P131128 p = new P131128();
        String r = p.solution("100", "203045");
        System.out.println(r);
    }

    public String solution(String X, String Y) {
        String answer = "";
        // 한자씩 배열로 담을 변수
        String[] Xarr = X.split("");
        String[] Yarr = Y.split("");
        // 각 문자열의 숫자개수를 담을 변수
        int[] Xnumber = new int[10];
        int[] Ynumber = new int[10];

        // 해당 위치의 값 +1
        Arrays.stream(Xarr).forEach(i->{
            Xnumber[Integer.parseInt(i)]++;
        });
        Arrays.stream(Yarr).forEach(i->{
            Ynumber[Integer.parseInt(i)]++;
        });

        StringBuffer sb = new StringBuffer();
        for (int i=Xnumber.length-1; i>=0; i--) {
            // i가 0일때 toString()속도 문제로 먼저 체크
            if (i == 0) {
                if (sb.length() == 0) {
                    if (Xnumber[i] > 0 && Ynumber[i] > 0) { 
                        sb.append("0");
                    }
                } else {
                    int len = (Xnumber[i] < Ynumber[i]) ? Xnumber[i] : Ynumber[i];
                    for (int j=0; j<len; j++) {
                        sb.append(i);
                    }
                }
            } else {
                // 두 배열 모두 값이 있는 경우
                if (Xnumber[i] > 0 && Ynumber[i] > 0) { 
                    // 값만큼 반복해서 추가
                    int len = (Xnumber[i] < Ynumber[i]) ? Xnumber[i] : Ynumber[i];
                    for (int j=0; j<len; j++) {
                        sb.append(i);
                    }
                }
            }
        }
        
        answer = sb.toString();
        return "".equals(answer) ? "-1" : answer;
    }
}