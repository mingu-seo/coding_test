package level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P72410 {
    public static void main(String[] args) {
        P72410 p = new P72410();
        String result = p.solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println(result);
    }
    public String solution(String new_id) {
        String answer = "";

        // 1단계 대문자->소문자
        Matcher m = Pattern.compile("[A-Z]").matcher(new_id);
        while (m.find()) {
            // System.out.println(m.group());
            new_id = new_id.replaceAll(m.group(), m.group().toLowerCase());
        }
        
        
        // 2단계 소문자, 숫자, -, _, . 제외 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // 3단계 . 가 두번이상 연속되면 하나로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        // 4단계 처음이나 끝에 .가 있으면 제거
        new_id = new_id.replaceAll("^[.]", "");
        new_id = new_id.replaceAll("[.]$", "");

        // 5단계 빈문자열이면 a 대입
        if ("".equals(new_id)) new_id = "a";

        // 6단계 16자 이상이면 15개문제만 남기
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0,15);
        }
        // 끝에 .인 경우
        new_id = new_id.replaceAll("[.]$", "");
        
        // 7단계 아이디 길이가 2 이하이면 마지막 문자를 길이가 3이 될때까지 끝에 불이기
        while (new_id.length() < 3) {
            new_id += new_id.substring(new_id.length()-1);
        }
        
        // System.out.println(new_id);
        answer = new_id;
        return answer;
    }
}
