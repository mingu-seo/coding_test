package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12981 {
    public static void main(String[] args) {
        P12981 p = new P12981();
        // int[] result = p.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        // int[] result = p.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        int[] result = p.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        System.out.println(Arrays.toString(result));
    }
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        List<String> wordList = new ArrayList<>();

        for (int i=0; i<words.length; i++) {
            if (i % n == 0) {
                answer[1]++;
            }
            
            if (i > 0 ) {
                if (wordList.contains(words[i]) || words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                    answer[0] = i%n +1;
                    break;
                }
            }
            wordList.add(words[i]);
        }
        if (answer[0] == 0) answer[1] = 0;

        return answer;
    }
}
