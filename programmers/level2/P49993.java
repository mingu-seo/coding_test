package level2;

import java.util.ArrayList;
import java.util.List;

public class P49993 {
    public static void main(String[] args) {
        P49993 p = new P49993();
        int result = p.solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" });
        System.out.println(result);
    }

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        // 선행스킬 순서 skill변수를 리스트에 한문자열씩 다음(아래서 비교하기 위해)
        List<String> list = new ArrayList<>();
        for (int i = 0; i < skill.length(); i++) {
            list.add(String.valueOf(skill.charAt(i)));
        }
        // System.out.println(list);

        for (int i = 0; i < skill_trees.length; i++) {
            String tree = skill_trees[i];
            int listIndex = 0; // 선행스킬 차례대로 비교하기 위해 인덱스값 저장
            boolean isSuccess = true; // 인덱스 비교해서 일치하지 않으면 반복중지
            for (int j = 0; j < tree.length(); j++) {
                int curIndex = list.indexOf(String.valueOf(tree.charAt(j))); // 현재 스킬트리의 하나의 스킬(문자열)을 선행스킬의 위치값
                if (curIndex > -1) { // 선행스킬에 존재하는 경우 (존재하지 않으면 처리 불필요)
                    if (curIndex == listIndex) { // 선행스킬의 인덱스와 비교 일치하는 경우
                        // System.out.println(tree + ", " + tree.charAt(j));
                        listIndex++; // 선행스킬 인덱스 +1
                    } else { // 일치하지 않는 경우 불가능한 스킬트리
                        isSuccess = false;
                        break;
                    }
                }
            }
            if (isSuccess) {
                // System.out.println(tree);
                answer++;
            }

        }
        return answer;
    }
}
