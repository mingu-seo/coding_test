package level2;

import java.util.ArrayList;
import java.util.List;

public class P60057 {
    public static void main(String[] args) {
        P60057 p = new P60057();
        int result = p.solution("aabbaccc");
        System.out.println(result);
    }

    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        // 1부터 문자열의 길이까지의 압축 단위를 확인
        for (int i = 1; i <= s.length(); i++) {
            StringBuffer sb = new StringBuffer();
            String str = ""; // 현재 확인 중인 문자열
            int cnt = 0; // 동일한 문자열 조각의 반복 횟수
            List<String> splitList = new ArrayList<>(); // 문자열을 i 길이만큼 잘라서 저장할 리스트

            // 문자열 s를 i 길이만큼 잘라서 splitList에 추가
            for (int j = 0; j < s.length(); j += i) {
                int end = j + i; // 잘라야 할 끝 인덱스
                // 만약 끝 인덱스가 문자열의 길이를 초과한다면
                if (end > s.length()) {
                    end = s.length(); // 끝 인덱스를 문자열의 끝으로
                }
                // 잘라낸 문자열 조각을 splitList에 추가
                splitList.add(s.substring(j, end));
            }
            // 잘라낸 문자열 조각들을 순회하면서 압축된 결과 생성
            for (int j = 0; j < splitList.size(); j++) {
                // 이전 문자열 조각과 현재 조각이 동일하면 카운트를 증가
                if (str.equals(splitList.get(j))) {
                    cnt++;
                } else { // 동일하지 않으면, 이전 조각을 압축 결과에 추가
                    // 반복 횟수가 2 이상일 경우 횟수도 함께 추가
                    if (cnt > 1) {
                        sb.append(cnt);
                    }
                    sb.append(str); // 이전 조각을 결과에 추가
                    str = splitList.get(j); // 현재 조각으로 str을 갱신
                    cnt = 1; // 반복 횟수를 1로 초기화
                }
            }
            // 마지막 조각을 결과에 추가
            if (cnt > 1) {
                sb.append(cnt);
            }
            sb.append(str);
            // 현재 압축된 문자열의 길이가 기존의 최솟값보다 작은지
            if (answer > sb.length()) {
                answer = sb.length();
            }
        }

        return answer;
    }
}
