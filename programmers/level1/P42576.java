package level1;

import java.util.Arrays;

public class P42576 {
    public static void main(String[] args) {
        P42576 p = new P42576();
        // String result = p.solution(new String[] { "leo", "kiki", "eden" }, new
        // String[] { "eden", "kiki" });
        // String result = p.solution(new String[] { "marina", "josipa", "nikola",
        // "vinko", "filipa" },
        // new String[] { "josipa", "filipa", "marina", "nikola" });
        String result = p.solution(new String[] { "mislav", "stanko", "mislav", "ana" },
                new String[] { "stanko", "ana", "mislav" });
        System.out.println(result);
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        if ("".equals(answer))
            answer = participant[participant.length - 1];
        return answer;
    }
}
