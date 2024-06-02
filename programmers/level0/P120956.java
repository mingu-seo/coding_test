package level0;


public class P120956 {

    public static void main(String[] args) {
        String[] args1 = {"aya", "yee", "u", "maa", "wyeoo"};
        // String[] args2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int r = solution(args1);
        
        System.out.println(r);
        
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        for (int i=0; i<babbling.length; i++) {
            for (int j=0; j<word.length; j++) {
                babbling[i] = babbling[i].replace(word[j], "*");
            }
            // 반복할때 바로 제거해버리면 다른 단어가 일치하는 경우가 생김
            // wyeoo -> woo -> ''
            // 그래서 먼저 *로 바꿔놓고, 반복끝나고 *을 한꺼면 ''로 변경
            babbling[i] = babbling[i].replace("*", "");
            if ("".equals(babbling[i])) {
                answer++;
                System.out.println(i);
            }
        }
        return answer;
    }
}