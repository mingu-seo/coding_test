package level1;

import java.util.Arrays;

public class P160586 {
    public static void main(String[] args) {
        P160586 p = new P160586();
        int[] result = p.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"});
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // 입력하려는 문자열반복
        for (int i=0; i<targets.length; i++) {
            // 입력하려는 각 문자열의 문자반복
            for (int j=0; j<targets[i].length(); j++) {
                // System.out.println(targets[i].charAt(j)+" 시작");
                
                // 키맵 길이만큼 배열 생성(각 요소별로 작은값을 구하기 위해)
                int[] index = new int[keymap.length];
                // 초기값으로 -1
                for (int idx = 0; idx<index.length; idx++) {
                    index[idx] = -1;
                }
                // 일치하는 문자 찾았는지 여부
                boolean isFind = false;
                // 문자찾을 키맵배열반복
                for (int k=0; k<keymap.length; k++) {
                    // 문자찾을 각 키맵문자열의 문자반복
                    for (int l=0; l<keymap[k].length(); l++) {
                        // System.out.println(targets[i].charAt(j)+":"+keymap[k].charAt(l));
                        // 일치하는 문자찾았으면
                        if (targets[i].charAt(j) == keymap[k].charAt(l)) {
                            // 초기값으로 설정해놓은 -1인 경우에만 값 변경(가장 작은 수이므로)
                            if (index[k] == -1) index[k] = l;
                            isFind = true;
                            break;
                        }
                    }
                }
                // 이미 한문자라도 못찾으면 -1 대입하고 반복 중지(더 찾을 필요 없음)
                if (isFind == false) {
                    answer[i] = -1;
                    break;
                } else {
                    // 배열중 제일 작은거 구하기
                    int min = Integer.MAX_VALUE;
                    for (int idx = 0; idx<index.length; idx++) {
                        if (index[idx] != -1 && min > index[idx]) {
                            min = index[idx];
                        }
                    }
                    // 작은값 구한 경우에만 +1
                    answer[i] += min == Integer.MAX_VALUE ? -1 : min+1;
                }
                // System.out.println(targets[i].charAt(j)+" 끝");
                // System.out.println(Arrays.toString(index));
                
            }
        }
        return answer;
    }
}
