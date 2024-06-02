package level2;

import java.util.ArrayList;

/*
 * 모음사전
 * https://school.programmers.co.kr/learn/courses/30/lessons/84512
 * 
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P84512 {
    public static void main(String[] args) {
        P84512 p = new P84512();
        int result = p.solution("EIO");
        System.out.println(result);
    }
    String[] str = {"A","E","I","O","U"};
    public int solution(String word) {
        int answer = 0;
        
        List<String> words = new ArrayList<>();
        // 모음배열 개수만큼 재귀호출
        for (int i=0; i<str.length; i++) {
            make(words, str[i]);
        }
        // System.out.println(words);
        for (String w : words) {
            answer++;
            if (w.equals(word)) {
                break;
            }
        }
        return answer;
    }

    void make(List<String> words, String word) {
        if (word.length() > 5) { // 길이가 5보다 크면 중지
            return;
        }
        // 문자리스트에 존재하지 않으면 추가
        if (!words.contains(word)) {
            words.add(word);
        }
        // 모음개수만큼 반복하면서 재귀호출
        for (int i=0; i<str.length; i++) {
            make(words, word+str[i]);
        }
    }

}
