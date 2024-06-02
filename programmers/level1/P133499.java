package level1;

public class P133499 {
    public static void main(String[] args) {
        P133499 p = new P133499();
        int r = p.solution(new String[]{"yayae"});
        System.out.println(r);
    }

    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = new String[]{"aya", "ye", "woo", "ma"};
        for (int i=0; i<babbling.length; i++) {
            for (int j=0; j<word.length; j++) {
                String matchStr = "("+word[j]+"){2,}";
                babbling[i] = babbling[i].replaceAll(matchStr,"+");
            }
            for (int j=0; j<word.length; j++) {
                babbling[i] = babbling[i].replace(word[j],"-");
            }
            babbling[i] = babbling[i].replace("-","");
            if ("".equals(babbling[i])) {
                // System.out.println(i);
                answer++;
            }
        }
        return answer;
    }
}
